package com.jag.astro.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseClass {

	private static Map<String, List<String>> groomNakshatraMap = new HashMap<>();

	public static Map<String, List<String>> getGroomNakshatraMap() {
		return groomNakshatraMap;
	}
	
}
