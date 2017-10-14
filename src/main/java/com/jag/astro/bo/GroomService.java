package com.jag.astro.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jag.astro.database.DatabaseClass;

public class GroomService {

	private Map<String, List<String>> groomRaasis = DatabaseClass.getGroomNakshatraMap();
	
	public GroomService(){
		groomRaasis.put("Mesha", Arrays.asList("Aswini", "Bharani", "Krittika"));
		groomRaasis.put("Vrishabha", Arrays.asList("Krittika", "Rohini", "Mrigasira"));
		groomRaasis.put("Mithuna", Arrays.asList("Mrigasira", "Ardra", "Punarvasu"));
		groomRaasis.put("Kataka", Arrays.asList("Punarvasu", "Pushyami", "Aslesha"));
		groomRaasis.put("Simha", Arrays.asList("Makha", "Poorva Phalguni", "Uttara Phalguni"));
		groomRaasis.put("Kanya", Arrays.asList("Uttara Phalguni", "Hasta", "Chitra"));
		groomRaasis.put("Thula", Arrays.asList("Chitra", "Swati", "Visakha"));
		groomRaasis.put("Vrischika", Arrays.asList("Visakha", "Anuradha", "Jyeshta"));
		groomRaasis.put("Dhanus", Arrays.asList("Moola", "Poorvashada", "Uttarashada"));
		groomRaasis.put("Makara", Arrays.asList("Uttarashada", "Sravana", "Dhanishta"));
		groomRaasis.put("Kumbha", Arrays.asList("Dhanishta", "Satabhishak", "Poorvabhadra"));
		groomRaasis.put("Meena", Arrays.asList("Poorvabhadra", "Uttarabhadra", "Revati"));
		
	}
	
	public List<String> getGroomRaasi(String raasi){
		List<String> list = new ArrayList<String>();
		return groomRaasis.get(raasi);
		
		
	}
	
	public Set<String> getAllRaasisForBride(){
		return groomRaasis.keySet();
	}
	
}
