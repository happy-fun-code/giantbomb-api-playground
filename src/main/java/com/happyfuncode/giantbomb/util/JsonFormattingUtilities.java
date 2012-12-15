package com.happyfuncode.giantbomb.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonFormattingUtilities {

	public static void prettyPrintJson(final String jsonString) {
		System.out
				.println(JsonFormattingUtilities.formatJsonString(jsonString));
	}

	public static String formatJsonString(final String jsonString) {
		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		final JsonParser parser = new JsonParser();
		final JsonElement element = parser.parse(jsonString);
		return gson.toJson(element);
	}

}
