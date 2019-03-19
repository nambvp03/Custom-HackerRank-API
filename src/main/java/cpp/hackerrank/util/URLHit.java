package cpp.hackerrank.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class URLHit {
	
	private String apiKey = ""; //Add hackerrank api key
	
	public String retrieveDataFromUrlWithGet(String getUrl) throws Exception {
		HttpURLConnection conn = null;
		StringBuffer outputJson = null;
		String output = null;
		URL url = new URL(getUrl);
		conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Authorization", apiKey);

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		outputJson = new StringBuffer();
		while ((output = br.readLine()) != null) {
			outputJson.append(output);
		}
		output = outputJson.toString();

		conn.disconnect();
		return output;
	}
}
