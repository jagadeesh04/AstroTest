package com.jag.astro.bo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jag.astro.database.DatabaseClass;

public class BrideService {

	private Map<String, List<String>> brideRaasis = DatabaseClass.getGroomNakshatraMap();
	
	public BrideService() {
		
		brideRaasis.put("Mesha", Arrays.asList("Aswini", "Bharani", "Krittika"));
		brideRaasis.put("Vrishabha", Arrays.asList("Krittika", "Rohini", "Mrigasira"));
		brideRaasis.put("Mithuna", Arrays.asList("Mrigasira", "Ardra", "Punarvasu"));
		brideRaasis.put("Kataka", Arrays.asList("Punarvasu", "Pushyami", "Aslesha"));
		brideRaasis.put("Simha", Arrays.asList("Makha", "Poorva Phalguni", "Uttara Phalguni"));
		brideRaasis.put("Kanya", Arrays.asList("Uttara Phalguni", "Hasta", "Chitra"));
		brideRaasis.put("Thula", Arrays.asList("Chitra", "Swati", "Visakha"));
		brideRaasis.put("Vrischika", Arrays.asList("Visakha", "Anuradha", "Jyeshta"));
		brideRaasis.put("Dhanus", Arrays.asList("Moola", "Poorvashada", "Uttarashada"));
		brideRaasis.put("Makara", Arrays.asList("Uttarashada", "Sravana", "Dhanishta"));
		brideRaasis.put("Kumbha", Arrays.asList("Dhanishta", "Satabhishak", "Poorvabhadra"));
		brideRaasis.put("Meena", Arrays.asList("Poorvabhadra", "Uttarabhadra", "Revati"));
		
	}
	
	public List<String> getBrideRaasi(String raasi){
		return brideRaasis.get(raasi);
	}
	
	public Set<String> getAllRaasisForBride(){
		return brideRaasis.keySet();
	}
	
}
