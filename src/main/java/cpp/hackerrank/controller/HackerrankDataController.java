package cpp.hackerrank.controller;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import cpp.hackerrank.bean.AllTest;
import cpp.hackerrank.bean.AllTestCandidate;
import cpp.hackerrank.bean.Candidate;
import cpp.hackerrank.bean.Test;
import cpp.hackerrank.util.CandidateComparator;
import cpp.hackerrank.util.URLHit;

@RestController
public class HackerrankDataController {

	private static final String GET_ALL_TEST_URL = "/custom-ranking/getalltest";
	private static final String GET_ALL_TEST_CANDIDATE_URL = "/custom-ranking/getalltestcandidate";

	//@Value("${api.all.test}")
	private String allTestApiUrl = "https://www.hackerrank.com/x/api/v3/tests?limit=100&offset=0";
	private String allTestCandidateApiUrlP1 = "https://www.hackerrank.com/x/api/v3/tests/";
	private String allTestCandidateApiUrlP2 = "/candidates?limit=100&offset=0";

	@RequestMapping(value=GET_ALL_TEST_URL, method=RequestMethod.GET)
	public Map <String, Object> getAllTest() {
		Map <String, Object> response = new HashMap<String, Object>();
		try {
			URLHit urlHit = new URLHit();
			Gson gson = new Gson();
			AllTest allTestObject = gson.fromJson(urlHit.retrieveDataFromUrlWithGet(allTestApiUrl), AllTest.class);

			Map<String, String> testIdNameMap = new HashMap<>();
			if(null != allTestObject && null != allTestObject.getData() && !allTestObject.getData().isEmpty()) {
				for(Test t: allTestObject.getData()) {
					testIdNameMap.put(t.getId(), t.getName());
				}
			}
			response.put("success", true);
			response.put("message", testIdNameMap);
		}catch(Exception e) {
			e.printStackTrace();
			response.put("success", false);
			response.put("message", e.getMessage());
		}
		return response;
	}

	@RequestMapping(value=GET_ALL_TEST_CANDIDATE_URL, method=RequestMethod.GET)
	public Map <String, Object> getAllTestCandidate(@RequestParam("test_id") String testId) {
		Map <String, Object> response = new HashMap<String, Object>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+0000");
		try {
			URLHit urlHit = new URLHit();
			Gson gson = new Gson();
			AllTestCandidate allTestCandidateObject = gson.fromJson(urlHit.retrieveDataFromUrlWithGet(
					allTestCandidateApiUrlP1+testId+allTestCandidateApiUrlP2), AllTestCandidate.class);
			if(null != allTestCandidateObject && null != allTestCandidateObject.getData() && !allTestCandidateObject.getData().isEmpty()) {
				for(Candidate c: allTestCandidateObject.getData()) {
					if(null != c.getAttemptStarttime() && null != c.getAttemptEndtime()) {
						Date startTime = formatter.parse(c.getAttemptStarttime());
						Date endTime = formatter.parse(c.getAttemptEndtime());
						c.setTimeTaken((endTime.getTime()-startTime.getTime())/1000.0/60.0);
						if(null != c.getQuestions() && !c.getQuestions().isEmpty()) {
							for (Entry<String, Double> entry : c.getQuestions().entrySet()) { 
								if(entry.getValue() == 50) {
									c.setFinalScore(c.getFinalScore()+entry.getValue()); 
								}
							}
						}
					}
				}
			}
			Collections.sort(allTestCandidateObject.getData(), new CandidateComparator());
			response.put("success", true);
			response.put("message", allTestCandidateObject.getData());
		}catch(Exception e) {
			e.printStackTrace();
			response.put("success", false);
			response.put("message", e.getMessage());
		}
		return response;
	}
}
