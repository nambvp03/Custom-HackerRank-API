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

		//TestID: 231089/235052 (California HSPC 2018 (HS I/Team))
		mapper.put("463742", 50.0);
		mapper.put("467189", 50.0);
		mapper.put("467186", 50.0);
		mapper.put("463741", 50.0);
		mapper.put("463766", 50.0);
		mapper.put("463977", 50.0);
		mapper.put("463770", 50.0);
		mapper.put("463966", 50.0);

		//TestID: 426719/438152 (HSPC 2019 - HS Team/I)
		mapper.put("222912", 75.0);
		mapper.put("568819", 50.0);
		mapper.put("222929", 100.0);
		mapper.put("573612", 75.0);
		mapper.put("561215", 100.0);
		mapper.put("573615", 75.0);
		mapper.put("555002", 50.0);
		mapper.put("132088", 75.0);

		//TestID: 438153/432236 (HSPC 2019 - MS Team/I)
		mapper.put("573612", 75.0);
		mapper.put("555002", 50.0);
		mapper.put("504995", 75.0);
		mapper.put("568819", 50.0);
		mapper.put("561215", 100.0);
		mapper.put("132088", 75.0);
		mapper.put("313725", 50.0);
		mapper.put("558363", 75.0);   
	}

	public static Map<String, Double> getMapper() {
		return mapper;
	}
}
