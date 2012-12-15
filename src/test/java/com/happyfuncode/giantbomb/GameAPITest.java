package com.happyfuncode.giantbomb;

import org.junit.Test;

import com.happyfuncode.giantbomb.util.Constants;
import com.happyfuncode.giantbomb.util.JsonFormattingUtilities;
import com.happyfuncode.giantbomb.util.RequestUtilities;

public class GameAPITest {
	private final int GAME_ID = 16140;

	@Test
	public void testGetGame() {
		final String url = "http://api.giantbomb.com/game/" + GAME_ID + "/?api_key="
				+ Constants.API_KEY + "&format=json";
		JsonFormattingUtilities.prettyPrintJson(RequestUtilities
				.performGetRequest(url));
	}
}
