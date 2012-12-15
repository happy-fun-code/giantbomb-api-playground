package com.happyfuncode.giantbomb;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.happyfuncode.giantbomb.util.Constants;
import com.happyfuncode.giantbomb.util.JsonFormattingUtilities;

public class GameAPITest {
	@Test
	public void testGetGame() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.exchange(
				"http://api.giantbomb.com/game/16140/?api_key="
						+ Constants.API_KEY + "&format=json", HttpMethod.GET,
				null, String.class);
		JsonFormattingUtilities.prettyPrintJson(result.getBody());
	}
}
