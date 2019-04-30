package cpp.hackerrank.util;

import java.util.HashMap;
import java.util.Map;

public class QuestionPointMap {

	private static Map<String, Double> mapper = new HashMap<String, Double>();

	static {
		//TestID: 142875
		mapper.put("133529", 50.0);
		mapper.put("130309", 50.0);
		mapper.put("130302", 50.0);
		mapper.put("130306", 50.0);
		mapper.put("232646", 50.0);
		mapper.put("157956", 75.0);
		mapper.put("111168", 75.0);
		mapper.put("222917", 75.0);

		//TestID: 231089
		mapper.put("133529", 50.0);
		mapper.put("130309", 50.0);
		mapper.put("130302", 50.0);
		mapper.put("130306", 50.0);
		mapper.put("232646", 50.0);
		mapper.put("157956", 75.0);
		mapper.put("111168", 75.0);
		mapper.put("222917", 75.0);
	}

	public static Map<String, Double> getMapper() {
		return mapper;
	}
}
