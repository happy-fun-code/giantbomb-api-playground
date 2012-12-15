package com.happyfuncode.giantbomb.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonFormattingUtilities {

	public static void prettyPrintJson(String jsonString) {
		System.out.println(JsonFormattingUtilities.formatJsonString(jsonString));
	}

	public static String formatJsonString(String jsonString) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(jsonString);
		return gson.toJson(element);
	}

}
