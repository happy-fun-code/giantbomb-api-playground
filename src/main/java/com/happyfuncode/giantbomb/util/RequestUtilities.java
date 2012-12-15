package com.happyfuncode.giantbomb.util;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RequestUtilities {

	public final static String performGetRequest(final String url) {
		final RestTemplate restTemplate = new RestTemplate();
		final ResponseEntity<String> result = restTemplate.exchange(url,
				HttpMethod.GET, null, String.class);
		final String resultString = result.getBody();
		return resultString;
	}

}
