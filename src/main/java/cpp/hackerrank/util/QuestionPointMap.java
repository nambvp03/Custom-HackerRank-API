package cpp.hackerrank.util;

import java.util.HashMap;
import java.util.Map;

public class QuestionPointMap {

	private static Map<String, Double> mapper = new HashMap<String, Double>();

	static {
		//TestID: 142875 (HSPC 2019 Sample Contest)
		mapper.put("133529", 50.0);
		mapper.put("130309", 50.0);
		mapper.put("130302", 50.0);
		mapper.put("130306", 50.0);
		mapper.put("232646", 50.0);
		mapper.put("157956", 75.0);
		mapper.put("111168", 75.0);
		mapper.put("222917", 75.0);

		//TestID: 231089 (California HSPC 2018 (HS I))
		mapper.put("463742", 50.0);
		mapper.put("467189", 50.0);
		mapper.put("467186", 50.0);
		mapper.put("463741", 50.0);
		mapper.put("463766", 50.0);
		mapper.put("463977", 50.0);
		mapper.put("463770", 50.0);
		mapper.put("463966", 50.0);

		//TestID: 235052 (California HSPC 2018 (HS Team))
		mapper.put("463742", 50.0);
		mapper.put("467189", 50.0);
		mapper.put("467186", 50.0);
		mapper.put("463741", 50.0);
		mapper.put("463766", 50.0);
		mapper.put("463977", 50.0);
		mapper.put("463770", 50.0);
		mapper.put("463966", 50.0);
	}

	public static Map<String, Double> getMapper() {
		return mapper;
	}
}
