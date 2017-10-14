package com.jag.astro.bo;

import java.util.HashMap;
import java.util.Map;

public class Service {

	Map<String, Integer> finalResult = new HashMap<>();

	public Map<String, Integer> getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(Map<String, Integer> finalResult) {
		this.finalResult = finalResult;
	}

	public Service() {

		// mesha,mesha
		finalResult.put("Mesha,Aswini,Mesha,Aswini", 28);
		finalResult.put("Mesha,Bharani,Mesha,Aswini", 33);
		finalResult.put("Mesha,Krittika,Mesha,Aswini", 28);

		finalResult.put("Mesha,Aswini,Mesha,Bharani", 34);
		finalResult.put("Mesha,Bharani,Mesha,Bharani", 28);
		finalResult.put("Mesha,Krittika,Mesha,Bharani", 29);

		finalResult.put("Mesha,Aswini,Mesha,Krittika", 27);
		finalResult.put("Mesha,Bharani,Mesha,Krittika", 27);
		finalResult.put("Mesha,Krittika,Mesha,Krittika", 28);

		// mesha,Vrishabha
		finalResult.put("Mesha,Aswini,Vrishabha,Aswini", 18);
		finalResult.put("Mesha,Bharani,Vrishabha,Aswini", 18);
		finalResult.put("Mesha,Krittika,Vrishabha,Aswini", 19);

		finalResult.put("Mesha,Aswini,Vrishabha,Bharani", 23);
		finalResult.put("Mesha,Bharani,Vrishabha,Bharani", 23);
		finalResult.put("Mesha,Krittika,Vrishabha,Bharani", 10);

		finalResult.put("Mesha,Aswini,Vrishabha,Krittika", 22);
		finalResult.put("Mesha,Bharani,Vrishabha,Krittika", 13);
		finalResult.put("Mesha,Krittika,Vrishabha,Krittika", 13);

		// mesha,Mithuna
		finalResult.put("Mesha,Aswini,Mithuna,Aswini", 27);
		finalResult.put("Mesha,Bharani,Mithuna,Aswini", 18);
		finalResult.put("Mesha,Krittika,Mithuna,Aswini", 21);

		finalResult.put("Mesha,Aswini,Mithuna,Bharani", 19);
		finalResult.put("Mesha,Bharani,Mithuna,Bharani", 27);
		finalResult.put("Mesha,Krittika,Mithuna,Bharani", 21);

		finalResult.put("Mesha,Aswini,Mithuna,Krittika", 19);
		finalResult.put("Mesha,Bharani,Mithuna,Krittika", 26);
		finalResult.put("Mesha,Krittika,Mithuna,Krittika", 22);

		// mesha,Kataka
		finalResult.put("Mesha,Aswini,Kataka,Aswini", 21);
		finalResult.put("Mesha,Bharani,Kataka,Aswini", 28);
		finalResult.put("Mesha,Krittika,Kataka,Aswini", 23);

		finalResult.put("Mesha,Aswini,Kataka,Bharani", 30);
		finalResult.put("Mesha,Bharani,Kataka,Bharani", 21);
		finalResult.put("Mesha,Krittika,Kataka,Bharani", 26);

		finalResult.put("Mesha,Aswini,Kataka,Krittika", 25);
		finalResult.put("Mesha,Bharani,Kataka,Krittika", 23);
		finalResult.put("Mesha,Krittika,Kataka,Krittika", 22);

		// mesha,Simha
		finalResult.put("Mesha,Aswini,Simha,Aswini", 21);
		finalResult.put("Mesha,Bharani,Simha,Aswini", 21);
		finalResult.put("Mesha,Krittika,Simha,Aswini", 17);

		finalResult.put("Mesha,Aswini,Simha,Bharani", 27);
		finalResult.put("Mesha,Bharani,Simha,Bharani", 19);
		finalResult.put("Mesha,Krittika,Simha,Bharani", 21);

		finalResult.put("Mesha,Aswini,Simha,Krittika", 18);
		finalResult.put("Mesha,Bharani,Simha,Krittika", 27);
		finalResult.put("Mesha,Krittika,Simha,Krittika", 22);

		// mesha,Kanya
		finalResult.put("Mesha,Aswini,Kanya,Aswini", 13);
		finalResult.put("Mesha,Bharani,Kanya,Aswini", 21);
		finalResult.put("Mesha,Krittika,Kanya,Aswini", 16);

		finalResult.put("Mesha,Aswini,Kanya,Bharani", 11);
		finalResult.put("Mesha,Bharani,Kanya,Bharani", 20);
		finalResult.put("Mesha,Krittika,Kanya,Bharani", 16);

		finalResult.put("Mesha,Aswini,Kanya,Krittika", 13);
		finalResult.put("Mesha,Bharani,Kanya,Krittika", 6);
		finalResult.put("Mesha,Krittika,Kanya,Krittika", 19);

		// mesha,Thula
		finalResult.put("Mesha,Aswini,Thula,Aswini", 22);
		finalResult.put("Mesha,Bharani,Thula,Aswini", 15);
		finalResult.put("Mesha,Krittika,Thula,Aswini", 28);

		finalResult.put("Mesha,Aswini,Thula,Bharani", 27);
		finalResult.put("Mesha,Bharani,Thula,Bharani", 29);
		finalResult.put("Mesha,Krittika,Thula,Bharani", 17);

		finalResult.put("Mesha,Aswini,Thula,Krittika", 22);
		finalResult.put("Mesha,Bharani,Thula,Krittika", 22);
		finalResult.put("Mesha,Krittika,Thula,Krittika", 20);

		// mesha,Vrischika
		finalResult.put("Mesha,Aswini,Vrischika,Aswini", 16);
		finalResult.put("Mesha,Bharani,Vrischika,Aswini", 16);
		finalResult.put("Mesha,Krittika,Vrischika,Aswini", 14);

		finalResult.put("Mesha,Aswini,Vrischika,Bharani", 24);
		finalResult.put("Mesha,Bharani,Vrischika,Bharani", 14);
		finalResult.put("Mesha,Krittika,Vrischika,Bharani", 19);

		finalResult.put("Mesha,Aswini,Vrischika,Krittika", 12);
		finalResult.put("Mesha,Bharani,Vrischika,Krittika", 18);
		finalResult.put("Mesha,Krittika,Vrischika,Krittika", 24);

		// mesha,Dhanus
		finalResult.put("Mesha,Aswini,Dhanus,Aswini", 12);
		finalResult.put("Mesha,Bharani,Dhanus,Aswini", 20);
		finalResult.put("Mesha,Krittika,Dhanus,Aswini", 24);

		finalResult.put("Mesha,Aswini,Dhanus,Bharani", 27);
		finalResult.put("Mesha,Bharani,Dhanus,Bharani", 20);
		finalResult.put("Mesha,Krittika,Dhanus,Bharani", 19);

		finalResult.put("Mesha,Aswini,Dhanus,Krittika", 25);
		finalResult.put("Mesha,Bharani,Dhanus,Krittika", 27);
		finalResult.put("Mesha,Krittika,Dhanus,Krittika", 14);

		// mesha,Makara
		finalResult.put("Mesha,Aswini,Makara,Aswini", 28);
		finalResult.put("Mesha,Bharani,Makara,Aswini", 29);
		finalResult.put("Mesha,Krittika,Makara,Aswini", 16);

		finalResult.put("Mesha,Aswini,Makara,Bharani", 27);
		finalResult.put("Mesha,Bharani,Makara,Bharani", 26);
		finalResult.put("Mesha,Krittika,Makara,Bharani", 13);

		finalResult.put("Mesha,Aswini,Makara,Krittika", 20);
		finalResult.put("Mesha,Bharani,Makara,Krittika", 10);
		finalResult.put("Mesha,Krittika,Makara,Krittika", 26);

		// mesha,Kumbha
		finalResult.put("Mesha,Aswini,Kumbha,Aswini", 20);
		finalResult.put("Mesha,Bharani,Kumbha,Aswini", 11);
		finalResult.put("Mesha,Krittika,Kumbha,Aswini", 26);

		finalResult.put("Mesha,Aswini,Kumbha,Bharani", 15);
		finalResult.put("Mesha,Bharani,Kumbha,Bharani", 21);
		finalResult.put("Mesha,Krittika,Kumbha,Bharani", 28);

		finalResult.put("Mesha,Aswini,Kumbha,Krittika", 18);
		finalResult.put("Mesha,Bharani,Kumbha,Krittika", 25);
		finalResult.put("Mesha,Krittika,Kumbha,Krittika", 20);

		// mesha,Meena
		finalResult.put("Mesha,Aswini,Meena,Aswini", 14);
		finalResult.put("Mesha,Bharani,Meena,Aswini", 21);
		finalResult.put("Mesha,Krittika,Meena,Aswini", 16);

		finalResult.put("Mesha,Aswini,Meena,Bharani", 24);
		finalResult.put("Mesha,Bharani,Meena,Bharani", 15);
		finalResult.put("Mesha,Krittika,Meena,Bharani", 18);

		finalResult.put("Mesha,Aswini,Meena,Krittika", 25);
		finalResult.put("Mesha,Bharani,Meena,Krittika", 24);
		finalResult.put("Mesha,Krittika,Meena,Krittika", 11);

		// 2
		// Vrishabha,mesha
		finalResult.put("Vrishabha,Krittika,Mesha,Aswini", 18);
		finalResult.put("Vrishabha,Rohini,Mesha,Aswini", 21);
		finalResult.put("Vrishabha,Mrigasira,Mesha,Aswini", 22);

		finalResult.put("Vrishabha,Krittika,Mesha,Bharani", 19);
		finalResult.put("Vrishabha,Rohini,Mesha,Bharani", 22);
		finalResult.put("Vrishabha,Mrigasira,Mesha,Bharani", 15);

		finalResult.put("Vrishabha,Krittika,Mesha,Krittika", 17);
		finalResult.put("Vrishabha,Rohini,Mesha,Krittika", 10);
		finalResult.put("Vrishabha,Mrigasira,Mesha,Krittika", 15);

		// Vrishabha,Vrishabha
		finalResult.put("Vrishabha,Krittika,Vrishabha,Krittika", 28);
		finalResult.put("Vrishabha,Rohini,Vrishabha,Krittika", 19);
		finalResult.put("Vrishabha,Mrigasira,Vrishabha,Krittika", 25);

		finalResult.put("Vrishabha,Krittika,Vrishabha,Rohini", 19);
		finalResult.put("Vrishabha,Rohini,Vrishabha,Rohini", 28);
		finalResult.put("Vrishabha,Mrigasira,Vrishabha,Rohini", 36);

		finalResult.put("Vrishabha,Krittika,Vrishabha,Mrigasira", 27);
		finalResult.put("Vrishabha,Rohini,Vrishabha,Mrigasira", 34);
		finalResult.put("Vrishabha,Mrigasira,Vrishabha,Mrigasira", 28);

		// Vrishabha,Mithuna
		finalResult.put("Vrishabha,Krittika,Mithuna,Mrigasira", 18);
		finalResult.put("Vrishabha,Rohini,Mithuna,Mrigasira", 25);
		finalResult.put("Vrishabha,Mrigasira,Mithuna,Mrigasira", 20);

		finalResult.put("Vrishabha,Krittika,Mithuna,Ardra", 18);
		finalResult.put("Vrishabha,Rohini,Mithuna,Ardra", 24);
		finalResult.put("Vrishabha,Mrigasira,Mithuna,Ardra", 26);

		finalResult.put("Vrishabha,Krittika,Mithuna,Punarvasu", 19);
		finalResult.put("Vrishabha,Rohini,Mithuna,Punarvasu", 23);
		finalResult.put("Vrishabha,Mrigasira,Mithuna,Punarvasu", 24);

		// Vrishabha,Kataka
		finalResult.put("Vrishabha,Krittika,Kataka,Punarvasu", 20);
		finalResult.put("Vrishabha,Rohini,Kataka,Punarvasu", 24);
		finalResult.put("Vrishabha,Mrigasira,Kataka,Punarvasu", 25);

		finalResult.put("Vrishabha,Krittika,Kataka,Pushyami", 23);
		finalResult.put("Vrishabha,Rohini,Kataka,Pushyami", 24);
		finalResult.put("Vrishabha,Mrigasira,Kataka,Pushyami", 7);

		finalResult.put("Vrishabha,Krittika,Kataka,Aslesha", 19);
		finalResult.put("Vrishabha,Rohini,Kataka,Aslesha", 12);
		finalResult.put("Vrishabha,Mrigasira,Kataka,Aslesha", 21);

		// Vrishabha,Simha
		finalResult.put("Vrishabha,Krittika,Simha,Makha", 18);
		finalResult.put("Vrishabha,Rohini,Simha,Makha", 11);
		finalResult.put("Vrishabha,Mrigasira,Simha,Makha", 19);

		finalResult.put("Vrishabha,Krittika,Simha,Poorva Phalguni", 22);
		finalResult.put("Vrishabha,Rohini,Simha,Poorva Phalguni", 25);
		finalResult.put("Vrishabha,Mrigasira,Simha,Poorva Phalguni", 17);

		finalResult.put("Vrishabha,Krittika,Simha,Uttara Phalguni", 23);
		finalResult.put("Vrishabha,Rohini,Simha,Uttara Phalguni", 27);
		finalResult.put("Vrishabha,Mrigasira,Simha,Uttara Phalguni", 25);

		// Vrishabha,Kanya
		finalResult.put("Vrishabha,Krittika,Kanya,Uttara Phalguni", 21);
		finalResult.put("Vrishabha,Rohini,Kanya,Uttara Phalguni", 25);
		finalResult.put("Vrishabha,Mrigasira,Kanya,Uttara Phalguni", 23);

		finalResult.put("Vrishabha,Krittika,Kanya,Hasta", 21);
		finalResult.put("Vrishabha,Rohini,Kanya,Hasta", 26);
		finalResult.put("Vrishabha,Mrigasira,Kanya,Hasta", 26);

		finalResult.put("Vrishabha,Krittika,Kanya,Chitra", 25);
		finalResult.put("Vrishabha,Rohini,Kanya,Chitra", 20);
		finalResult.put("Vrishabha,Mrigasira,Kanya,Chitra", 12);

		// Vrishabha,Thula
		finalResult.put("Vrishabha,Krittika,Thula,Chitra", 23);
		finalResult.put("Vrishabha,Rohini,Thula,Chitra", 20);
		finalResult.put("Vrishabha,Mrigasira,Thula,Chitra", 12);

		finalResult.put("Vrishabha,Krittika,Thula,Swati", 12);
		finalResult.put("Vrishabha,Rohini,Thula,Swati", 16);
		finalResult.put("Vrishabha,Mrigasira,Thula,Swati", 27);

		finalResult.put("Vrishabha,Krittika,Thula,Visakha", 15);
		finalResult.put("Vrishabha,Rohini,Thula,Visakha", 10);
		finalResult.put("Vrishabha,Mrigasira,Thula,Visakha", 18);

		// Vrishabha,Vrischika
		finalResult.put("Vrishabha,Krittika,Vrischika,Visakha", 19);
		finalResult.put("Vrishabha,Rohini,Vrischika,Visakha", 14);
		finalResult.put("Vrishabha,Mrigasira,Vrischika,Visakha", 22);

		finalResult.put("Vrishabha,Krittika,Vrischika,Anuradha", 24);
		finalResult.put("Vrishabha,Rohini,Vrischika,Anuradha", 27);
		finalResult.put("Vrishabha,Mrigasira,Vrischika,Anuradha", 20);

		finalResult.put("Vrishabha,Krittika,Vrischika,Jyeshta", 29);
		finalResult.put("Vrishabha,Rohini,Vrischika,Jyeshta", 22);
		finalResult.put("Vrishabha,Mrigasira,Vrischika,Jyeshta", 22);

		// Vrishabha,Dhanus
		finalResult.put("Vrishabha,Aswini,Dhanus,Moola", 19);
		finalResult.put("Vrishabha,Bharani,Dhanus,Moola", 13);
		finalResult.put("Vrishabha,Krittika,Dhanus,Moola", 14);

		finalResult.put("Vrishabha,Aswini,Dhanus,Poorvashada", 13);
		finalResult.put("Vrishabha,Bharani,Dhanus,Poorvashada", 20);
		finalResult.put("Vrishabha,Krittika,Dhanus,Poorvashada", 12);

		finalResult.put("Vrishabha,Aswini,Dhanus,Uttarashada", 8);
		finalResult.put("Vrishabha,Bharani,Dhanus,Uttarashada", 11);
		finalResult.put("Vrishabha,Krittika,Dhanus,Uttarashada", 18);

		// Vrishabha,Makara
		finalResult.put("Vrishabha,Aswini,Makara,Uttarashada", 14);
		finalResult.put("Vrishabha,Bharani,Makara,Uttarashada", 17);
		finalResult.put("Vrishabha,Krittika,Makara,Uttarashada", 22);

		finalResult.put("Vrishabha,Aswini,Makara,Sravana", 10);
		finalResult.put("Vrishabha,Bharani,Makara,Sravana", 17);
		finalResult.put("Vrishabha,Krittika,Makara,Sravana", 26);

		finalResult.put("Vrishabha,Aswini,Makara,Dhanishta", 23);
		finalResult.put("Vrishabha,Bharani,Makara,Dhanishta", 20);
		finalResult.put("Vrishabha,Krittika,Makara,Dhanishta", 12);

		// Vrishabha,Kumbha
		finalResult.put("Vrishabha,Aswini,Kumbha,Dhanishta", 30);
		finalResult.put("Vrishabha,Bharani,Kumbha,Dhanishta", 27);
		finalResult.put("Vrishabha,Krittika,Kumbha,Dhanishta", 19);

		finalResult.put("Vrishabha,Aswini,Kumbha,Satabhishak", 32);
		finalResult.put("Vrishabha,Bharani,Kumbha,Satabhishak", 25);
		finalResult.put("Vrishabha,Krittika,Kumbha,Satabhishak", 25);

		finalResult.put("Vrishabha,Aswini,Kumbha,Poorvabhadra", 24);
		finalResult.put("Vrishabha,Bharani,Kumbha,Poorvabhadra", 31);
		finalResult.put("Vrishabha,Krittika,Kumbha,Poorvabhadra", 31);

		// Vrishabha,Meena
		finalResult.put("Vrishabha,Aswini,Meena,Poorvabhadra", 19);
		finalResult.put("Vrishabha,Bharani,Meena,Poorvabhadra", 26);
		finalResult.put("Vrishabha,Krittika,Meena,Poorvabhadra", 26);

		finalResult.put("Vrishabha,Aswini,Meena,Uttarabhadra", 21);
		finalResult.put("Vrishabha,Bharani,Meena,Uttarabhadra", 25);
		finalResult.put("Vrishabha,Krittika,Meena,Uttarabhadra", 17);

		finalResult.put("Vrishabha,Aswini,Meena,Revati", 14);
		finalResult.put("Vrishabha,Bharani,Meena,Revati", 17);
		finalResult.put("Vrishabha,Krittika,Meena,Revati", 26);

		// 3
		// Mithuna,mesha
		finalResult.put("Mithuna,Mrigasira,Mesha,Aswini", 26);
		finalResult.put("Mithuna,Ardra,Mesha,Aswini", 17);
		finalResult.put("Mithuna,Punarvasu,Mesha,Aswini", 18);

		finalResult.put("Mithuna,Mrigasira,Mesha,Bharani", 18);
		finalResult.put("Mithuna,Ardra,Mesha,Bharani", 26);
		finalResult.put("Mithuna,Punarvasu,Mesha,Bharani", 26);

		finalResult.put("Mithuna,Mrigasira,Mesha,Krittika", 19);
		finalResult.put("Mithuna,Ardra,Mesha,Krittika", 20);
		finalResult.put("Mithuna,Punarvasu,Mesha,Krittika", 21);

		// Mithuna,Vrishabha
		finalResult.put("Mithuna,Mrigasira,Vrishabha,Krittika", 16);
		finalResult.put("Mithuna,Ardra,Vrishabha,Krittika", 17);
		finalResult.put("Mithuna,Punarvasu,Vrishabha,Krittika", 18);

		finalResult.put("Mithuna,Mrigasira,Vrishabha,Rohini", 27);
		finalResult.put("Mithuna,Ardra,Vrishabha,Rohini", 23);
		finalResult.put("Mithuna,Punarvasu,Vrishabha,Rohini", 23);

		finalResult.put("Mithuna,Mrigasira,Vrishabha,Mrigasira", 20);
		finalResult.put("Mithuna,Ardra,Vrishabha,Mrigasira", 25);
		finalResult.put("Mithuna,Punarvasu,Vrishabha,Mrigasira", 23);

		// Mithuna,Mithuna
		finalResult.put("Mithuna,Mrigasira,Mithuna,Mrigasira", 28);
		finalResult.put("Mithuna,Ardra,Mithuna,Mrigasira", 33);
		finalResult.put("Mithuna,Punarvasu,Mithuna,Mrigasira", 31);

		finalResult.put("Mithuna,Mrigasira,Mithuna,Ardra", 34);
		finalResult.put("Mithuna,Ardra,Mithuna,Ardra", 28);
		finalResult.put("Mithuna,Punarvasu,Mithuna,Ardra", 25);

		finalResult.put("Mithuna,Mrigasira,Mithuna,Punarvasu", 32);
		finalResult.put("Mithuna,Ardra,Mithuna,Punarvasu", 24);
		finalResult.put("Mithuna,Punarvasu,Mithuna,Punarvasu", 28);

		// Mithuna,Kataka
		finalResult.put("Mithuna,Mrigasira,Kataka,Punarvasu", 18);
		finalResult.put("Mithuna,Ardra,Kataka,Punarvasu", 10);
		finalResult.put("Mithuna,Punarvasu,Kataka,Punarvasu", 14);

		finalResult.put("Mithuna,Mrigasira,Kataka,Pushyami", 10);
		finalResult.put("Mithuna,Ardra,Kataka,Pushyami", 18);
		finalResult.put("Mithuna,Punarvasu,Kataka,Pushyami", 21);

		finalResult.put("Mithuna,Mrigasira,Kataka,Aslesha", 13);
		finalResult.put("Mithuna,Ardra,Kataka,Aslesha", 12);
		finalResult.put("Mithuna,Punarvasu,Kataka,Aslesha", 15);

		// Mithuna,Simha
		finalResult.put("Mithuna,Mrigasira,Simha,Makha", 22);
		finalResult.put("Mithuna,Ardra,Simha,Makha", 22);
		finalResult.put("Mithuna,Punarvasu,Simha,Makha", 21);

		finalResult.put("Mithuna,Mrigasira,Simha,Poorva Phalguni", 20);
		finalResult.put("Mithuna,Ardra,Simha,Poorva Phalguni", 28);
		finalResult.put("Mithuna,Punarvasu,Simha,Poorva Phalguni", 27);

		finalResult.put("Mithuna,Mrigasira,Simha,Uttara Phalguni", 28);
		finalResult.put("Mithuna,Ardra,Simha,Uttara Phalguni", 21);
		finalResult.put("Mithuna,Punarvasu,Simha,Uttara Phalguni", 21);

		// Mithuna,Kanya
		finalResult.put("Mithuna,Mrigasira,Kanya,Uttara Phalguni", 30);
		finalResult.put("Mithuna,Ardra,Kanya,Uttara Phalguni", 23);
		finalResult.put("Mithuna,Punarvasu,Kanya,Uttara Phalguni", 23);

		finalResult.put("Mithuna,Mrigasira,Kanya,Hasta", 33);
		finalResult.put("Mithuna,Ardra,Kanya,Hasta", 23);
		finalResult.put("Mithuna,Punarvasu,Kanya,Hasta", 23);

		finalResult.put("Mithuna,Mrigasira,Kanya,Chitra", 19);
		finalResult.put("Mithuna,Ardra,Kanya,Chitra", 26);
		finalResult.put("Mithuna,Punarvasu,Kanya,Chitra", 24);

		// Mithuna,Thula
		finalResult.put("Mithuna,Mrigasira,Thula,Chitra", 13);
		finalResult.put("Mithuna,Ardra,Thula,Chitra", 20);
		finalResult.put("Mithuna,Punarvasu,Thula,Chitra", 18);

		finalResult.put("Mithuna,Mrigasira,Thula,Swati", 27);
		finalResult.put("Mithuna,Ardra,Thula,Swati", 26);
		finalResult.put("Mithuna,Punarvasu,Thula,Swati", 26);

		finalResult.put("Mithuna,Mrigasira,Thula,Visakha", 19);
		finalResult.put("Mithuna,Ardra,Thula,Visakha", 21);
		finalResult.put("Mithuna,Punarvasu,Thula,Visakha", 21);

		// Mithuna,Vrischika
		finalResult.put("Mithuna,Mrigasira,Vrischika,Visakha", 13);
		finalResult.put("Mithuna,Ardra,Vrischika,Visakha", 22);
		finalResult.put("Mithuna,Punarvasu,Vrischika,Visakha", 14);

		finalResult.put("Mithuna,Mrigasira,Vrischika,Anuradha", 11);
		finalResult.put("Mithuna,Ardra,Vrischika,Anuradha", 16);
		finalResult.put("Mithuna,Punarvasu,Vrischika,Anuradha", 21);

		finalResult.put("Mithuna,Mrigasira,Vrischika,Jyeshta", 13);
		finalResult.put("Mithuna,Ardra,Vrischika,Jyeshta", 3);
		finalResult.put("Mithuna,Punarvasu,Vrischika,Jyeshta", 6);

		// Mithuna,Dhanus
		finalResult.put("Mithuna,Mrigasira,Dhanus,Moola", 21);
		finalResult.put("Mithuna,Ardra,Dhanus,Moola", 15);
		finalResult.put("Mithuna,Punarvasu,Dhanus,Moola", 12);

		finalResult.put("Mithuna,Mrigasira,Dhanus,Poorvashada", 18);
		finalResult.put("Mithuna,Ardra,Dhanus,Poorvashada", 26);
		finalResult.put("Mithuna,Punarvasu,Dhanus,Poorvashada", 26);

		finalResult.put("Mithuna,Mrigasira,Dhanus,Uttarashada", 24);
		finalResult.put("Mithuna,Ardra,Dhanus,Uttarashada", 26);
		finalResult.put("Mithuna,Punarvasu,Dhanus,Uttarashada", 26);

		// Mithuna,Makara
		finalResult.put("Mithuna,Mrigasira,Makara,Uttarashada", 20);
		finalResult.put("Mithuna,Ardra,Makara,Uttarashada", 22);
		finalResult.put("Mithuna,Punarvasu,Makara,Uttarashada", 22);

		finalResult.put("Mithuna,Mrigasira,Makara,Sravana", 23);
		finalResult.put("Mithuna,Ardra,Makara,Sravana", 21);
		finalResult.put("Mithuna,Punarvasu,Makara,Sravana", 23);

		finalResult.put("Mithuna,Mrigasira,Makara,Dhanishta", 8);
		finalResult.put("Mithuna,Ardra,Makara,Dhanishta", 17);
		finalResult.put("Mithuna,Punarvasu,Makara,Dhanishta", 17);

		// Mithuna,Kumbha
		finalResult.put("Mithuna,Mrigasira,Kumbha,Dhanishta", 10);
		finalResult.put("Mithuna,Ardra,Kumbha,Dhanishta", 19);
		finalResult.put("Mithuna,Punarvasu,Kumbha,Dhanishta", 19);

		finalResult.put("Mithuna,Mrigasira,Kumbha,Satabhishak", 18);
		finalResult.put("Mithuna,Ardra,Kumbha,Satabhishak", 10);
		finalResult.put("Mithuna,Punarvasu,Kumbha,Satabhishak", 10);

		finalResult.put("Mithuna,Mrigasira,Kumbha,Poorvabhadra", 24);
		finalResult.put("Mithuna,Ardra,Kumbha,Poorvabhadra", 17);
		finalResult.put("Mithuna,Punarvasu,Kumbha,Poorvabhadra", 17);

		// Mithuna,Meena
		finalResult.put("Mithuna,Mrigasira,Meena,Poorvabhadra", 25);
		finalResult.put("Mithuna,Ardra,Meena,Poorvabhadra", 18);
		finalResult.put("Mithuna,Punarvasu,Meena,Poorvabhadra", 18);

		finalResult.put("Mithuna,Mrigasira,Meena,Uttarabhadra", 16);
		finalResult.put("Mithuna,Ardra,Meena,Uttarabhadra", 25);
		finalResult.put("Mithuna,Punarvasu,Meena,Uttarabhadra", 27);

		finalResult.put("Mithuna,Mrigasira,Meena,Revati", 25);
		finalResult.put("Mithuna,Ardra,Meena,Revati", 24);
		finalResult.put("Mithuna,Punarvasu,Meena,Revati", 13);

		// 4
		// Kataka,mesha
		finalResult.put("Kataka,Punarvasu,Mesha,Aswini", 22);
		finalResult.put("Kataka,Pushyami,Mesha,Aswini", 31);
		finalResult.put("Kataka,Aslesha,Mesha,Aswini", 27);

		finalResult.put("Kataka,Punarvasu,Mesha,Bharani", 30);
		finalResult.put("Kataka,Pushyami,Mesha,Bharani", 23);
		finalResult.put("Kataka,Aslesha,Mesha,Bharani", 24);

		finalResult.put("Kataka,Punarvasu,Mesha,Krittika", 25);
		finalResult.put("Kataka,Pushyami,Mesha,Krittika", 26);
		finalResult.put("Kataka,Aslesha,Mesha,Krittika", 23);

		// Kataka,Vrishabha
		finalResult.put("Kataka,Punarvasu,Vrishabha,Krittika", 22);
		finalResult.put("Kataka,Pushyami,Vrishabha,Krittika", 23);
		finalResult.put("Kataka,Aslesha,Vrishabha,Krittika", 20);

		finalResult.put("Kataka,Punarvasu,Vrishabha,Rohini", 27);
		finalResult.put("Kataka,Pushyami,Vrishabha,Rohini", 26);
		finalResult.put("Kataka,Aslesha,Vrishabha,Rohini", 13);

		finalResult.put("Kataka,Punarvasu,Vrishabha,Mrigasira", 26);
		finalResult.put("Kataka,Pushyami,Vrishabha,Mrigasira", 19);
		finalResult.put("Kataka,Aslesha,Vrishabha,Mrigasira", 22);

		// Kataka,Mithuna
		finalResult.put("Kataka,Punarvasu,Mithuna,Mrigasira", 19);
		finalResult.put("Kataka,Pushyami,Mithuna,Mrigasira", 10);
		finalResult.put("Kataka,Aslesha,Mithuna,Mrigasira", 15);

		finalResult.put("Kataka,Punarvasu,Mithuna,Ardra", 13);
		finalResult.put("Kataka,Pushyami,Mithuna,Ardra", 20);
		finalResult.put("Kataka,Aslesha,Mithuna,Ardra", 13);

		finalResult.put("Kataka,Punarvasu,Mithuna,Punarvasu", 16);
		finalResult.put("Kataka,Pushyami,Mithuna,Punarvasu", 23);
		finalResult.put("Kataka,Aslesha,Mithuna,Punarvasu", 16);

		// Kataka,Kataka
		finalResult.put("Kataka,Punarvasu,Kataka,Punarvasu", 28);
		finalResult.put("Kataka,Pushyami,Kataka,Punarvasu", 35);
		finalResult.put("Kataka,Aslesha,Kataka,Punarvasu", 28);

		finalResult.put("Kataka,Punarvasu,Kataka,Pushyami", 35);
		finalResult.put("Kataka,Pushyami,Kataka,Pushyami", 28);
		finalResult.put("Kataka,Aslesha,Kataka,Pushyami", 30);

		finalResult.put("Kataka,Punarvasu,Kataka,Aslesha", 26);
		finalResult.put("Kataka,Pushyami,Kataka,Aslesha", 28);
		finalResult.put("Kataka,Aslesha,Kataka,Aslesha", 28);

		// Kataka,Simha
		finalResult.put("Kataka,Punarvasu,Simha,Makha", 16);
		finalResult.put("Kataka,Pushyami,Simha,Makha", 18);
		finalResult.put("Kataka,Aslesha,Simha,Makha", 16);

		finalResult.put("Kataka,Punarvasu,Simha,Poorva Phalguni", 22);
		finalResult.put("Kataka,Pushyami,Simha,Poorva Phalguni", 16);
		finalResult.put("Kataka,Aslesha,Simha,Poorva Phalguni", 16);

		finalResult.put("Kataka,Punarvasu,Simha,Uttara Phalguni", 16);
		finalResult.put("Kataka,Pushyami,Simha,Uttara Phalguni", 25);
		finalResult.put("Kataka,Aslesha,Simha,Uttara Phalguni", 18);

		// Kataka,Kanya
		finalResult.put("Kataka,Punarvasu,Kanya,Uttara Phalguni", 19);
		finalResult.put("Kataka,Pushyami,Kanya,Uttara Phalguni", 28);
		finalResult.put("Kataka,Aslesha,Kanya,Uttara Phalguni", 21);

		finalResult.put("Kataka,Punarvasu,Kanya,Hasta", 19);
		finalResult.put("Kataka,Pushyami,Kanya,Hasta", 28);
		finalResult.put("Kataka,Aslesha,Kanya,Hasta", 21);

		finalResult.put("Kataka,Punarvasu,Kanya,Chitra", 20);
		finalResult.put("Kataka,Pushyami,Kanya,Chitra", 12);
		finalResult.put("Kataka,Aslesha,Kanya,Chitra", 26);

		// Kataka,Thula
		finalResult.put("Kataka,Punarvasu,Thula,Chitra", 20);
		finalResult.put("Kataka,Pushyami,Thula,Chitra", 12);
		finalResult.put("Kataka,Aslesha,Thula,Chitra", 26);

		finalResult.put("Kataka,Punarvasu,Thula,Swati", 28);
		finalResult.put("Kataka,Pushyami,Thula,Swati", 28);
		finalResult.put("Kataka,Aslesha,Thula,Swati", 15);

		finalResult.put("Kataka,Punarvasu,Thula,Visakha", 22);
		finalResult.put("Kataka,Pushyami,Thula,Visakha", 21);
		finalResult.put("Kataka,Aslesha,Thula,Visakha", 19);

		// Kataka,Vrischika
		finalResult.put("Kataka,Punarvasu,Vrischika,Visakha", 19);
		finalResult.put("Kataka,Pushyami,Vrischika,Visakha", 18);
		finalResult.put("Kataka,Aslesha,Vrischika,Visakha", 15);

		finalResult.put("Kataka,Punarvasu,Vrischika,Anuradha", 26);
		finalResult.put("Kataka,Pushyami,Vrischika,Anuradha", 18);
		finalResult.put("Kataka,Aslesha,Vrischika,Anuradha", 21);

		finalResult.put("Kataka,Punarvasu,Vrischika,Jyeshta", 10);
		finalResult.put("Kataka,Pushyami,Vrischika,Jyeshta", 20);
		finalResult.put("Kataka,Aslesha,Vrischika,Jyeshta", 26);

		// Kataka,Dhanus
		finalResult.put("Kataka,Punarvasu,Dhanus,Moola", 8);
		finalResult.put("Kataka,Pushyami,Dhanus,Moola", 17);
		finalResult.put("Kataka,Aslesha,Dhanus,Moola", 24);

		finalResult.put("Kataka,Punarvasu,Dhanus,Poorvashada", 23);
		finalResult.put("Kataka,Pushyami,Dhanus,Poorvashada", 13);
		finalResult.put("Kataka,Aslesha,Dhanus,Poorvashada", 17);

		finalResult.put("Kataka,Punarvasu,Dhanus,Uttarashada", 23);
		finalResult.put("Kataka,Pushyami,Dhanus,Uttarashada", 24);
		finalResult.put("Kataka,Aslesha,Dhanus,Uttarashada", 9);

		// Kataka,Makara
		finalResult.put("Kataka,Punarvasu,Makara,Uttarashada", 27);
		finalResult.put("Kataka,Pushyami,Makara,Uttarashada", 28);
		finalResult.put("Kataka,Aslesha,Makara,Uttarashada", 14);

		finalResult.put("Kataka,Punarvasu,Makara,Sravana", 28);
		finalResult.put("Kataka,Pushyami,Makara,Sravana", 26);
		finalResult.put("Kataka,Aslesha,Makara,Sravana", 15);

		finalResult.put("Kataka,Punarvasu,Makara,Dhanishta", 22);
		finalResult.put("Kataka,Pushyami,Makara,Dhanishta", 13);
		finalResult.put("Kataka,Aslesha,Makara,Dhanishta", 27);

		// Kataka,Kumbha
		finalResult.put("Kataka,Punarvasu,Kumbha,Dhanishta", 14);
		finalResult.put("Kataka,Pushyami,Kumbha,Dhanishta", 5);
		finalResult.put("Kataka,Aslesha,Kumbha,Dhanishta", 20);

		finalResult.put("Kataka,Punarvasu,Kumbha,Satabhishak", 7);
		finalResult.put("Kataka,Pushyami,Kumbha,Satabhishak", 15);
		finalResult.put("Kataka,Aslesha,Kumbha,Satabhishak", 20);

		finalResult.put("Kataka,Punarvasu,Kumbha,Poorvabhadra", 13);
		finalResult.put("Kataka,Pushyami,Kumbha,Poorvabhadra", 20);
		finalResult.put("Kataka,Aslesha,Kumbha,Poorvabhadra", 14);

		// Kataka,Meena
		finalResult.put("Kataka,Punarvasu,Meena,Poorvabhadra", 18);
		finalResult.put("Kataka,Pushyami,Meena,Poorvabhadra", 25);
		finalResult.put("Kataka,Aslesha,Meena,Poorvabhadra", 18);

		finalResult.put("Kataka,Punarvasu,Meena,Uttarabhadra", 26);
		finalResult.put("Kataka,Pushyami,Meena,Uttarabhadra", 19);
		finalResult.put("Kataka,Aslesha,Meena,Uttarabhadra", 20);

		finalResult.put("Kataka,Punarvasu,Meena,Revati", 24);
		finalResult.put("Kataka,Pushyami,Meena,Revati", 27);
		finalResult.put("Kataka,Aslesha,Meena,Revati", 13);

		// 5
		// Simha,mesha
		finalResult.put("Simha,Makha,Mesha,Aswini", 21);
		finalResult.put("Simha,Poorva Phalguni,Mesha,Aswini", 26);
		finalResult.put("Simha,Uttara Phalguni,Mesha,Aswini", 17);

		finalResult.put("Simha,Makha,Mesha,Bharani", 21);
		finalResult.put("Simha,Poorva Phalguni,Mesha,Bharani", 19);
		finalResult.put("Simha,Uttara Phalguni,Mesha,Bharani", 28);

		finalResult.put("Simha,Makha,Mesha,Krittika", 17);
		finalResult.put("Simha,Poorva Phalguni,Mesha,Krittika", 21);
		finalResult.put("Simha,Uttara Phalguni,Mesha,Krittika", 22);

		// Simha,Vrishabha
		finalResult.put("Simha,Makha,Vrishabha,Krittika", 19);
		finalResult.put("Simha,Poorva Phalguni,Vrishabha,Krittika", 23);
		finalResult.put("Simha,Uttara Phalguni,Vrishabha,Krittika", 24);

		finalResult.put("Simha,Makha,Vrishabha,Rohini", 12);
		finalResult.put("Simha,Poorva Phalguni,Vrishabha,Rohini", 26);
		finalResult.put("Simha,Uttara Phalguni,Vrishabha,Rohini", 28);

		finalResult.put("Simha,Makha,Vrishabha,Mrigasira", 21);
		finalResult.put("Simha,Poorva Phalguni,Vrishabha,Mrigasira", 17);
		finalResult.put("Simha,Uttara Phalguni,Vrishabha,Mrigasira", 25);

		// Simha,Mithuna
		finalResult.put("Simha,Makha,Mithuna,Mrigasira", 24);
		finalResult.put("Simha,Poorva Phalguni,Mithuna,Mrigasira", 20);
		finalResult.put("Simha,Uttara Phalguni,Mithuna,Mrigasira", 28);

		finalResult.put("Simha,Makha,Mithuna,Ardra", 23);
		finalResult.put("Simha,Poorva Phalguni,Mithuna,Ardra", 30);
		finalResult.put("Simha,Uttara Phalguni,Mithuna,Ardra", 22);

		finalResult.put("Simha,Makha,Mithuna,Punarvasu", 22);
		finalResult.put("Simha,Poorva Phalguni,Mithuna,Punarvasu", 27);
		finalResult.put("Simha,Uttara Phalguni,Mithuna,Punarvasu", 21);

		// Simha,Kataka
		finalResult.put("Simha,Makha,Kataka,Punarvasu", 15);
		finalResult.put("Simha,Poorva Phalguni,Kataka,Punarvasu", 20);
		finalResult.put("Simha,Uttara Phalguni,Kataka,Punarvasu", 14);

		finalResult.put("Simha,Makha,Kataka,Pushyami", 18);
		finalResult.put("Simha,Poorva Phalguni,Kataka,Pushyami", 14);
		finalResult.put("Simha,Uttara Phalguni,Kataka,Pushyami", 23);

		finalResult.put("Simha,Makha,Kataka,Aslesha", 15);
		finalResult.put("Simha,Poorva Phalguni,Kataka,Aslesha", 15);
		finalResult.put("Simha,Uttara Phalguni,Kataka,Aslesha", 17);

		// Simha,Simha
		finalResult.put("Simha,Makha,Simha,Makha", 28);
		finalResult.put("Simha,Poorva Phalguni,Simha,Makha", 30);
		finalResult.put("Simha,Uttara Phalguni,Simha,Makha", 26);

		finalResult.put("Simha,Makha,Simha,Poorva Phalguni", 30);
		finalResult.put("Simha,Poorva Phalguni,Simha,Poorva Phalguni", 28);
		finalResult.put("Simha,Uttara Phalguni,Simha,Poorva Phalguni", 34);

		finalResult.put("Simha,Makha,Simha,Uttara Phalguni", 26);
		finalResult.put("Simha,Poorva Phalguni,Simha,Uttara Phalguni", 34);
		finalResult.put("Simha,Uttara Phalguni,Simha,Uttara Phalguni", 28);

		// Simha,Kanya
		finalResult.put("Simha,Makha,Kanya,Uttara Phalguni", 17);
		finalResult.put("Simha,Poorva Phalguni,Kanya,Uttara Phalguni", 25);
		finalResult.put("Simha,Uttara Phalguni,Kanya,Uttara Phalguni", 19);

		finalResult.put("Simha,Makha,Kanya,Hasta", 17);
		finalResult.put("Simha,Poorva Phalguni,Kanya,Hasta", 22);
		finalResult.put("Simha,Uttara Phalguni,Kanya,Hasta", 17);

		finalResult.put("Simha,Makha,Kanya,Chitra", 23);
		finalResult.put("Simha,Poorva Phalguni,Kanya,Chitra", 9);
		finalResult.put("Simha,Uttara Phalguni,Kanya,Chitra", 15);

		// Simha,Thula
		finalResult.put("Simha,Makha,Thula,Chitra", 25);
		finalResult.put("Simha,Poorva Phalguni,Thula,Chitra", 10);
		finalResult.put("Simha,Uttara Phalguni,Thula,Chitra", 17);

		finalResult.put("Simha,Makha,Thula,Swati", 13);
		finalResult.put("Simha,Poorva Phalguni,Thula,Swati", 25);
		finalResult.put("Simha,Uttara Phalguni,Thula,Swati", 25);

		finalResult.put("Simha,Makha,Thula,Visakha", 17);
		finalResult.put("Simha,Poorva Phalguni,Thula,Visakha", 19);
		finalResult.put("Simha,Uttara Phalguni,Thula,Visakha", 18);

		// Simha,Vrischika
		finalResult.put("Simha,Makha,Vrischika,Visakha", 21);
		finalResult.put("Simha,Poorva Phalguni,Vrischika,Visakha", 23);
		finalResult.put("Simha,Uttara Phalguni,Vrischika,Visakha", 21);

		finalResult.put("Simha,Makha,Vrischika,Anuradha", 24);
		finalResult.put("Simha,Poorva Phalguni,Vrischika,Anuradha", 20);
		finalResult.put("Simha,Uttara Phalguni,Vrischika,Anuradha", 29);

		finalResult.put("Simha,Makha,Vrischika,Jyeshta", 31);
		finalResult.put("Simha,Poorva Phalguni,Vrischika,Jyeshta", 13);
		finalResult.put("Simha,Uttara Phalguni,Vrischika,Jyeshta", 16);

		// Simha,Dhanus
		finalResult.put("Simha,Makha,Dhanus,Moola", 25);
		finalResult.put("Simha,Poorva Phalguni,Dhanus,Moola", 19);
		finalResult.put("Simha,Uttara Phalguni,Dhanus,Moola", 9);

		finalResult.put("Simha,Makha,Dhanus,Poorvashada", 21);
		finalResult.put("Simha,Poorva Phalguni,Dhanus,Poorvashada", 19);
		finalResult.put("Simha,Uttara Phalguni,Dhanus,Poorvashada", 27);

		finalResult.put("Simha,Makha,Dhanus,Uttarashada", 11);
		finalResult.put("Simha,Poorva Phalguni,Dhanus,Uttarashada", 27);
		finalResult.put("Simha,Uttara Phalguni,Dhanus,Uttarashada", 28);

		// Simha,Makara
		finalResult.put("Simha,Makha,Makara,Uttarashada", 6);
		finalResult.put("Simha,Poorva Phalguni,Makara,Uttarashada", 22);
		finalResult.put("Simha,Uttara Phalguni,Makara,Uttarashada", 23);

		finalResult.put("Simha,Makha,Makara,Sravana", 17);
		finalResult.put("Simha,Poorva Phalguni,Makara,Sravana", 18);
		finalResult.put("Simha,Uttara Phalguni,Makara,Sravana", 20);

		finalResult.put("Simha,Makha,Makara,Dhanishta", 18);
		finalResult.put("Simha,Poorva Phalguni,Makara,Dhanishta", 5);
		finalResult.put("Simha,Uttara Phalguni,Makara,Dhanishta", 12);

		// Simha,Kumbha
		finalResult.put("Simha,Makha,Kumbha,Dhanishta", 25);
		finalResult.put("Simha,Poorva Phalguni,Kumbha,Dhanishta", 11);
		finalResult.put("Simha,Uttara Phalguni,Kumbha,Dhanishta", 19);

		finalResult.put("Simha,Makha,Kumbha,Satabhishak", 26);
		finalResult.put("Simha,Poorva Phalguni,Kumbha,Satabhishak", 20);
		finalResult.put("Simha,Uttara Phalguni,Kumbha,Satabhishak", 13);

		finalResult.put("Simha,Makha,Kumbha,Poorvabhadra", 19);
		finalResult.put("Simha,Poorva Phalguni,Kumbha,Poorvabhadra", 25);
		finalResult.put("Simha,Uttara Phalguni,Kumbha,Poorvabhadra", 17);

		// Simha,Meena
		finalResult.put("Simha,Makha,Meena,Poorvabhadra", 16);
		finalResult.put("Simha,Poorva Phalguni,Meena,Poorvabhadra", 22);
		finalResult.put("Simha,Uttara Phalguni,Meena,Poorvabhadra", 14);

		finalResult.put("Simha,Makha,Meena,Uttarabhadra", 17);
		finalResult.put("Simha,Poorva Phalguni,Meena,Uttarabhadra", 15);
		finalResult.put("Simha,Uttara Phalguni,Meena,Uttarabhadra", 26);

		finalResult.put("Simha,Makha,Meena,Revati", 12);
		finalResult.put("Simha,Poorva Phalguni,Meena,Revati", 22);
		finalResult.put("Simha,Uttara Phalguni,Meena,Revati", 22);

		// 6
		// Kanya,mesha
		finalResult.put("Kanya,Uttara Phalguni,Mesha,Aswini", 11);
		finalResult.put("Kanya,Hasta,Mesha,Aswini", 9);
		finalResult.put("Kanya,Chitra,Mesha,Aswini", 13);

		finalResult.put("Kanya,Uttara Phalguni,Mesha,Bharani", 21);
		finalResult.put("Kanya,Hasta,Mesha,Bharani", 19);
		finalResult.put("Kanya,Chitra,Mesha,Bharani", 6);

		finalResult.put("Kanya,Uttara Phalguni,Mesha,Krittika", 15);
		finalResult.put("Kanya,Hasta,Mesha,Krittika", 15);
		finalResult.put("Kanya,Chitra,Mesha,Krittika", 18);

		// Kanya,Vrishabha
		finalResult.put("Kanya,Uttara Phalguni,Vrishabha,Krittika", 21);
		finalResult.put("Kanya,Hasta,Vrishabha,Krittika", 21);
		finalResult.put("Kanya,Chitra,Vrishabha,Krittika", 23);

		finalResult.put("Kanya,Uttara Phalguni Phalguni,Vrishabha,Rohini", 25);
		finalResult.put("Kanya,Hasta,Vrishabha,Rohini", 26);
		finalResult.put("Kanya,Chitra,Vrishabha,Rohini", 20);

		finalResult.put("Kanya,Uttara Phalguni,Vrishabha,Mrigasira", 23);
		finalResult.put("Kanya,Hasta,Vrishabha,Mrigasira", 27);
		finalResult.put("Kanya,Chitra,Vrishabha,Mrigasira", 13);

		// Kanya,Mithuna
		finalResult.put("Kanya,Uttara Phalguni,Mithuna,Mrigasira", 30);
		finalResult.put("Kanya,Hasta,Mithuna,Mrigasira", 34);
		finalResult.put("Kanya,Chitra,Mithuna,Mrigasira", 21);

		finalResult.put("Kanya,Uttara Phalguni,Mithuna,Ardra", 24);
		finalResult.put("Kanya,Hasta,Mithuna,Ardra", 24);
		finalResult.put("Kanya,Chitra,Mithuna,Ardra", 25);

		finalResult.put("Kanya,Uttara Phalguni,Mithuna,Punarvasu", 23);
		finalResult.put("Kanya,Hasta,Mithuna,Punarvasu", 24);
		finalResult.put("Kanya,Chitra,Mithuna,Punarvasu", 25);

		// Kanya,Kataka
		finalResult.put("Kanya,Uttara Phalguni,Kataka,Punarvasu", 18);
		finalResult.put("Kanya,Hasta,Kataka,Punarvasu", 18);
		finalResult.put("Kanya,Chitra,Kataka,Punarvasu", 20);

		finalResult.put("Kanya,Uttara Phalguni,Kataka,Pushyami", 26);
		finalResult.put("Kanya,Hasta,Kataka,Pushyami", 27);
		finalResult.put("Kanya,Chitra,Kataka,Pushyami", 12);

		finalResult.put("Kanya,Uttara Phalguni,Kataka,Aslesha", 20);
		finalResult.put("Kanya,Hasta,Kataka,Aslesha", 20);
		finalResult.put("Kanya,Chitra,Kataka,Aslesha", 26);

		// Kanya,Simha
		finalResult.put("Kanya,Uttara Phalguni,Simha,Makha", 16);
		finalResult.put("Kanya,Hasta,Simha,Makha", 16);
		finalResult.put("Kanya,Chitra,Simha,Makha", 22);

		finalResult.put("Kanya,Uttara Phalguni,Simha,Poorva Phalguni", 24);
		finalResult.put("Kanya,Hasta,Simha,Poorva Phalguni", 22);
		finalResult.put("Kanya,Chitra,Simha,Poorva Phalguni", 8);

		finalResult.put("Kanya,Uttara Phalguni,Simha,Uttara Phalguni", 18);
		finalResult.put("Kanya,Hasta,Simha,Uttara Phalguni", 16);
		finalResult.put("Kanya,Chitra,Simha,Uttara Phalguni", 14);

		// Kanya,Kanya
		finalResult.put("Kanya,Uttara Phalguni,Kanya,Uttara Phalguni", 28);
		finalResult.put("Kanya,Hasta,Kanya,Uttara Phalguni", 25);
		finalResult.put("Kanya,Chitra,Kanya,Uttara Phalguni", 24);

		finalResult.put("Kanya,Uttara Phalguni,Kanya,Hasta", 26);
		finalResult.put("Kanya,Hasta,Kanya,Hasta", 28);
		finalResult.put("Kanya,Chitra,Kanya,Hasta", 27);

		finalResult.put("Kanya,Uttara Phalguni,Kanya,Chitra", 24);
		finalResult.put("Kanya,Hasta,Kanya,Chitra", 27);
		finalResult.put("Kanya,Chitra,Kanya,Chitra", 28);

		// Kanya,Thula
		finalResult.put("Kanya,Uttara Phalguni,Thula,Chitra", 17);
		finalResult.put("Kanya,Hasta,Thula,Chitra", 20);
		finalResult.put("Kanya,Chitra,Thula,Chitra", 21);

		finalResult.put("Kanya,Uttara Phalguni,Thula,Swati", 25);
		finalResult.put("Kanya,Hasta,Thula,Swati", 27);
		finalResult.put("Kanya,Chitra,Thula,Swati", 21);

		finalResult.put("Kanya,Uttara Phalguni,Thula,Visakha", 17);
		finalResult.put("Kanya,Hasta,Thula,Visakha", 18);
		finalResult.put("Kanya,Chitra,Thula,Visakha", 27);

		// Kanya,Vrischika
		finalResult.put("Kanya,Uttara Phalguni,Vrischika,Visakha", 18);
		finalResult.put("Kanya,Hasta,Vrischika,Visakha", 19);
		finalResult.put("Kanya,Chitra,Vrischika,Visakha", 28);

		finalResult.put("Kanya,Uttara Phalguni,Vrischika,Anuradha", 26);
		finalResult.put("Kanya,Hasta,Vrischika,Anuradha", 27);
		finalResult.put("Kanya,Chitra,Vrischika,Anuradha", 12);

		finalResult.put("Kanya,Uttara Phalguni,Vrischika,Jyeshta", 13);
		finalResult.put("Kanya,Hasta,Vrischika,Jyeshta", 12);
		finalResult.put("Kanya,Chitra,Vrischika,Jyeshta", 25);

		// Kanya,Dhanus
		finalResult.put("Kanya,Uttara Phalguni,Dhanus,Moola", 13);
		finalResult.put("Kanya,Hasta,Dhanus,Moola", 13);
		finalResult.put("Kanya,Chitra,Dhanus,Moola", 27);

		finalResult.put("Kanya,Uttara Phalguni,Dhanus,Poorvashada", 27);
		finalResult.put("Kanya,Hasta,Dhanus,Poorvashada", 26);
		finalResult.put("Kanya,Chitra,Dhanus,Poorvashada", 11);

		finalResult.put("Kanya,Uttara Phalguni,Dhanus,Uttarashada", 28);
		finalResult.put("Kanya,Hasta,Dhanus,Uttarashada", 27);
		finalResult.put("Kanya,Chitra,Dhanus,Uttarashada", 20);

		// Kanya,Makara
		finalResult.put("Kanya,Uttara Phalguni,Makara,Uttarashada", 26);
		finalResult.put("Kanya,Hasta,Makara,Uttarashada", 25);
		finalResult.put("Kanya,Chitra,Makara,Uttarashada", 17);

		finalResult.put("Kanya,Uttara Phalguni,Makara,Sravana", 23);
		finalResult.put("Kanya,Pushyami,Makara,Sravana", 25);
		finalResult.put("Kanya,Chitra,Makara,Sravana", 18);

		finalResult.put("Kanya,Uttara Phalguni,Makara,Dhanishta", 16);
		finalResult.put("Kanya,Hasta,Makara,Dhanishta", 18);
		finalResult.put("Kanya,Chitra,Makara,Dhanishta", 16);

		// Kanya,Kumbha
		finalResult.put("Kanya,Uttara Phalguni,Kumbha,Dhanishta", 17);
		finalResult.put("Kanya,Hasta,Kumbha,Dhanishta", 21);
		finalResult.put("Kanya,Chitra,Kumbha,Dhanishta", 28);

		finalResult.put("Kanya,Uttara Phalguni,Kumbha,Satabhishak", 11);
		finalResult.put("Kanya,Hasta,Kumbha,Satabhishak", 8);
		finalResult.put("Kanya,Chitra,Kumbha,Satabhishak", 26);

		finalResult.put("Kanya,Uttara Phalguni,Kumbha,Poorvabhadra", 15);
		finalResult.put("Kanya,Hasta,Kumbha,Poorvabhadra", 17);
		finalResult.put("Kanya,Chitra,Kumbha,Poorvabhadra", 18);

		// Kanya,Meena
		finalResult.put("Kanya,Uttara Phalguni,Meena,Poorvabhadra", 16);
		finalResult.put("Kanya,Hasta,Meena,Poorvabhadra", 18);
		finalResult.put("Kanya,Chitra,Meena,Poorvabhadra", 19);

		finalResult.put("Kanya,Uttara Phalguni,Meena,Uttarabhadra", 27);
		finalResult.put("Kanya,Hasta,Meena,Uttarabhadra", 26);
		finalResult.put("Kanya,Chitra,Meena,Uttarabhadra", 9);

		finalResult.put("Kanya,Uttara Phalguni,Meena,Revati", 24);
		finalResult.put("Kanya,Hasta,Meena,Revati", 26);
		finalResult.put("Kanya,Chitra,Meena,Revati", 20);

		// 7
		// Thula,mesha
		finalResult.put("Thula,Chitra,Mesha,Aswini", 22);
		finalResult.put("Thula,Swati,Mesha,Aswini", 26);
		finalResult.put("Thula,Visakha,Mesha,Aswini", 22);

		finalResult.put("Thula,Chitra,Mesha,Bharani", 14);
		finalResult.put("Thula,Swati,Mesha,Bharani", 29);
		finalResult.put("Thula,Visakha,Mesha,Bharani", 22);

		finalResult.put("Thula,Chitra,Mesha,Krittika", 27);
		finalResult.put("Thula,Swati,Mesha,Krittika", 15);
		finalResult.put("Thula,Visakha,Mesha,Krittika", 19);

		// Thula,Vrishabha
		finalResult.put("Thula,Chitra,Vrishabha,Krittika", 22);
		finalResult.put("Thula,Swati,Vrishabha,Krittika", 10);
		finalResult.put("Thula,Visakha,Vrishabha,Krittika", 14);

		finalResult.put("Thula,Chitra,Vrishabha,Rohini", 19);
		finalResult.put("Thula,Swati,Vrishabha,Rohini", 15);
		finalResult.put("Thula,Visakha,Vrishabha,Rohini", 9);

		finalResult.put("Thula,Chitra,Vrishabha,Mrigasira", 10);
		finalResult.put("Thula,Swati,Vrishabha,Mrigasira", 25);
		finalResult.put("Thula,Visakha,Vrishabha,Mrigasira", 17);

		// Thula,Mithuna
		finalResult.put("Thula,Chitra,Mithuna,Mrigasira", 14);
		finalResult.put("Thula,Swati,Mithuna,Mrigasira", 27);
		finalResult.put("Thula,Visakha,Mithuna,Mrigasira", 19);

		finalResult.put("Thula,Chitra,Mithuna,Ardra", 20);
		finalResult.put("Thula,Swati,Mithuna,Ardra", 27);
		finalResult.put("Thula,Visakha,Mithuna,Ardra", 20);

		finalResult.put("Thula,Chitra,Mithuna,Punarvasu", 18);
		finalResult.put("Thula,Swati,Mithuna,Punarvasu", 27);
		finalResult.put("Thula,Visakha,Mithuna,Punarvasu", 21);

		// Thula,Kataka
		finalResult.put("Thula,Chitra,Kataka,Punarvasu", 20);
		finalResult.put("Thula,Swati,Kataka,Punarvasu", 27);
		finalResult.put("Thula,Visakha,Kataka,Punarvasu", 20);

		finalResult.put("Thula,Chitra,Kataka,Pushyami", 11);
		finalResult.put("Thula,Swati,Kataka,Pushyami", 26);
		finalResult.put("Thula,Visakha,Kataka,Pushyami", 21);

		finalResult.put("Thula,Chitra,Kataka,Aslesha", 25);
		finalResult.put("Thula,Swati,Kataka,Aslesha", 11);
		finalResult.put("Thula,Visakha,Kataka,Aslesha", 16);

		// Thula,Simha
		finalResult.put("Thula,Chitra,Simha,Makha", 25);
		finalResult.put("Thula,Swati,Simha,Makha", 11);
		finalResult.put("Thula,Visakha,Simha,Makha", 17);

		finalResult.put("Thula,Chitra,Simha,Poorva Phalguni", 11);
		finalResult.put("Thula,Swati,Simha,Poorva Phalguni", 25);
		finalResult.put("Thula,Visakha,Simha,Poorva Phalguni", 19);

		finalResult.put("Thula,Chitra,Simha,Uttara Phalguni", 17);
		finalResult.put("Thula,Swati,Simha,Uttara Phalguni", 26);
		finalResult.put("Thula,Visakha,Simha,Uttara Phalguni", 17);

		// Thula,Kanya
		finalResult.put("Thula,Chitra,Kanya,Uttara Phalguni", 16);
		finalResult.put("Thula,Swati,Kanya,Uttara Phalguni", 25);
		finalResult.put("Thula,Visakha,Kanya,Uttara Phalguni", 16);

		finalResult.put("Thula,Chitra,Kanya,Hasta", 19);
		finalResult.put("Thula,Swati,Kanya,Hasta", 36);
		finalResult.put("Thula,Visakha,Kanya,Hasta", 17);

		finalResult.put("Thula,Chitra,Kanya,Chitra", 20);
		finalResult.put("Thula,Swati,Kanya,Chitra", 18);
		finalResult.put("Thula,Visakha,Kanya,Chitra", 26);

		// Thula,Thula
		finalResult.put("Thula,Chitra,Thula,Chitra", 28);
		finalResult.put("Thula,Swati,Thula,Chitra", 27);
		finalResult.put("Thula,Visakha,Thula,Chitra", 34);

		finalResult.put("Thula,Chitra,Thula,Swati", 28);
		finalResult.put("Thula,Swati,Thula,Swati", 28);
		finalResult.put("Thula,Visakha,Thula,Swati", 20);

		finalResult.put("Thula,Chitra,Thula,Visakha", 33);
		finalResult.put("Thula,Swati,Thula,Visakha", 18);
		finalResult.put("Thula,Visakha,Thula,Visakha", 28);

		// Thula,Vrischika
		finalResult.put("Thula,Chitra,Vrischika,Visakha", 23);
		finalResult.put("Thula,Swati,Vrischika,Visakha", 8);
		finalResult.put("Thula,Visakha,Vrischika,Visakha", 17);

		finalResult.put("Thula,Chitra,Vrischika,Anuradha", 7);
		finalResult.put("Thula,Swati,Vrischika,Anuradha", 22);
		finalResult.put("Thula,Visakha,Vrischika,Anuradha", 17);

		finalResult.put("Thula,Chitra,Vrischika,Jyeshta", 20);
		finalResult.put("Thula,Swati,Vrischika,Jyeshta", 17);
		finalResult.put("Thula,Visakha,Vrischika,Jyeshta", 20);

		// Thula,Dhanus
		finalResult.put("Thula,Chitra,Dhanus,Moola", 27);
		finalResult.put("Thula,Swati,Dhanus,Moola", 21);
		finalResult.put("Thula,Visakha,Dhanus,Moola", 27);

		finalResult.put("Thula,Chitra,Dhanus,Poorvashada", 11);
		finalResult.put("Thula,Swati,Dhanus,Poorvashada", 26);
		finalResult.put("Thula,Visakha,Dhanus,Poorvashada", 19);

		finalResult.put("Thula,Chitra,Dhanus,Uttarashada", 20);
		finalResult.put("Thula,Swati,Dhanus,Uttarashada", 19);
		finalResult.put("Thula,Visakha,Dhanus,Uttarashada", 12);

		// Thula,Makara
		finalResult.put("Thula,Chitra,Makara,Uttarashada", 24);
		finalResult.put("Thula,Swati,Makara,Uttarashada", 23);
		finalResult.put("Thula,Visakha,Makara,Uttarashada", 16);

		finalResult.put("Thula,Chitra,Makara,Sravana", 25);
		finalResult.put("Thula,Swati,Makara,Sravana", 23);
		finalResult.put("Thula,Visakha,Makara,Sravana", 16);

		finalResult.put("Thula,Chitra,Makara,Dhanishta", 24);
		finalResult.put("Thula,Swati,Makara,Dhanishta", 26);
		finalResult.put("Thula,Visakha,Makara,Dhanishta", 30);

		// Thula,Kumbha
		finalResult.put("Thula,Chitra,Kumbha,Dhanishta", 19);
		finalResult.put("Thula,Swati,Kumbha,Dhanishta", 22);
		finalResult.put("Thula,Visakha,Kumbha,Dhanishta", 25);

		finalResult.put("Thula,Chitra,Kumbha,Satabhishak", 26);
		finalResult.put("Thula,Swati,Kumbha,Satabhishak", 19);
		finalResult.put("Thula,Visakha,Kumbha,Satabhishak", 21);

		finalResult.put("Thula,Chitra,Kumbha,Poorvabhadra", 19);
		finalResult.put("Thula,Swati,Kumbha,Poorvabhadra", 28);
		finalResult.put("Thula,Visakha,Kumbha,Poorvabhadra", 21);

		// Thula,Meena
		finalResult.put("Thula,Chitra,Meena,Poorvabhadra", 12);
		finalResult.put("Thula,Swati,Meena,Poorvabhadra", 20);
		finalResult.put("Thula,Visakha,Meena,Poorvabhadra", 14);

		finalResult.put("Thula,Chitra,Meena,Uttarabhadra", 3);
		finalResult.put("Thula,Swati,Meena,Uttarabhadra", 19);
		finalResult.put("Thula,Visakha,Meena,Uttarabhadra", 12);

		finalResult.put("Thula,Chitra,Meena,Revati", 13);
		finalResult.put("Thula,Swati,Meena,Revati", 11);
		finalResult.put("Thula,Visakha,Meena,Revati", 5);

		// 8
		// Vrischika,mesha
		finalResult.put("Vrischika,Visakha,Mesha,Aswini", 19);
		finalResult.put("Vrischika,Anuradha,Mesha,Aswini", 26);
		finalResult.put("Vrischika,Jyeshta,Mesha,Aswini", 15);

		finalResult.put("Vrischika,Visakha,Mesha,Bharani", 19);
		finalResult.put("Vrischika,Anuradha,Mesha,Bharani", 17);
		finalResult.put("Vrischika,Jyeshta,Mesha,Bharani", 19);

		finalResult.put("Vrischika,Visakha,Mesha,Krittika", 16);
		finalResult.put("Vrischika,Anuradha,Mesha,Krittika", 20);
		finalResult.put("Vrischika,Jyeshta,Mesha,Krittika", 26);

		// Vrischika,Vrishabha
		finalResult.put("Vrischika,Visakha,Vrishabha,Krittika", 21);
		finalResult.put("Vrischika,Anuradha,Vrishabha,Krittika", 25);
		finalResult.put("Vrischika,Jyeshta,Vrishabha,Krittika", 31);

		finalResult.put("Vrischika,Visakha,Vrishabha,Rohini", 16);
		finalResult.put("Vrischika,Anuradha,Vrishabha,Rohini", 30);
		finalResult.put("Vrischika,Jyeshta,Vrishabha,Rohini", 24);

		finalResult.put("Vrischika,Visakha,Vrishabha,Mrigasira", 23);
		finalResult.put("Vrischika,Anuradha,Vrishabha,Mrigasira", 22);
		finalResult.put("Vrischika,Jyeshta,Vrishabha,Mrigasira", 26);

		// Vrischika,Mithuna
		finalResult.put("Vrischika,Visakha,Mithuna,Mrigasira", 14);
		finalResult.put("Vrischika,Anuradha,Mithuna,Mrigasira", 11);
		finalResult.put("Vrischika,Jyeshta,Mithuna,Mrigasira", 13);

		finalResult.put("Vrischika,Visakha,Mithuna,Ardra", 13);
		finalResult.put("Vrischika,Anuradha,Mithuna,Ardra", 17);
		finalResult.put("Vrischika,Jyeshta,Mithuna,Ardra", 4);

		finalResult.put("Vrischika,Visakha,Mithuna,Punarvasu", 13);
		finalResult.put("Vrischika,Anuradha,Mithuna,Punarvasu", 20);
		finalResult.put("Vrischika,Jyeshta,Mithuna,Punarvasu", 5);

		// Vrischika,Kataka
		finalResult.put("Vrischika,Visakha,Kataka,Punarvasu", 19);
		finalResult.put("Vrischika,Anuradha,Kataka,Punarvasu", 26);
		finalResult.put("Vrischika,Jyeshta,Kataka,Punarvasu", 10);

		finalResult.put("Vrischika,Visakha,Kataka,Pushyami", 20);
		finalResult.put("Vrischika,Anuradha,Kataka,Pushyami", 19);
		finalResult.put("Vrischika,Jyeshta,Kataka,Pushyami", 22);

		finalResult.put("Vrischika,Visakha,Kataka,Aslesha", 15);
		finalResult.put("Vrischika,Anuradha,Kataka,Aslesha", 20);
		finalResult.put("Vrischika,Jyeshta,Kataka,Aslesha", 26);

		// Vrischika,Simha
		finalResult.put("Vrischika,Visakha,Simha,Makha", 24);
		finalResult.put("Vrischika,Anuradha,Simha,Makha", 26);
		finalResult.put("Vrischika,Jyeshta,Simha,Makha", 34);

		finalResult.put("Vrischika,Visakha,Simha,Poorva Phalguni", 26);
		finalResult.put("Vrischika,Anuradha,Simha,Poorva Phalguni", 24);
		finalResult.put("Vrischika,Jyeshta,Simha,Poorva Phalguni", 24);

		finalResult.put("Vrischika,Visakha,Simha,Uttara Phalguni", 23);
		finalResult.put("Vrischika,Anuradha,Simha,Uttara Phalguni", 13);
		finalResult.put("Vrischika,Jyeshta,Simha,Uttara Phalguni", 19);

		// Vrischika,Kanya
		finalResult.put("Vrischika,Visakha,Kanya,Uttara Phalguni", 17);
		finalResult.put("Vrischika,Anuradha,Kanya,Uttara Phalguni", 27);
		finalResult.put("Vrischika,Jyeshta,Kanya,Uttara Phalguni", 13);

		finalResult.put("Vrischika,Visakha,Kanya,Hasta", 19);
		finalResult.put("Vrischika,Anuradha,Kanya,Hasta", 26);
		finalResult.put("Vrischika,Jyeshta,Kanya,Hasta", 12);

		finalResult.put("Vrischika,Visakha,Kanya,Chitra", 28);
		finalResult.put("Vrischika,Anuradha,Kanya,Chitra", 11);
		finalResult.put("Vrischika,Jyeshta,Kanya,Chitra", 25);

		// Vrischika,Thula
		finalResult.put("Vrischika,Visakha,Thula,Chitra", 24);
		finalResult.put("Vrischika,Anuradha,Thula,Chitra", 7);
		finalResult.put("Vrischika,Jyeshta,Thula,Chitra", 21);

		finalResult.put("Vrischika,Visakha,Thula,Swati", 10);
		finalResult.put("Vrischika,Anuradha,Thula,Swati", 23);
		finalResult.put("Vrischika,Jyeshta,Thula,Swati", 18);

		finalResult.put("Vrischika,Visakha,Thula,Visakha", 18);
		finalResult.put("Vrischika,Anuradha,Thula,Visakha", 17);
		finalResult.put("Vrischika,Jyeshta,Thula,Visakha", 21);

		// Vrischika,Vrischika
		finalResult.put("Vrischika,Visakha,Vrischika,Visakha", 28);
		finalResult.put("Vrischika,Anuradha,Vrischika,Visakha", 27);
		finalResult.put("Vrischika,Jyeshta,Vrischika,Visakha", 31);

		finalResult.put("Vrischika,Visakha,Vrischika,Anuradha", 28);
		finalResult.put("Vrischika,Anuradha,Vrischika,Anuradha", 28);
		finalResult.put("Vrischika,Jyeshta,Vrischika,Anuradha", 31);

		finalResult.put("Vrischika,Visakha,Vrischika,Jyeshta", 31);
		finalResult.put("Vrischika,Anuradha,Vrischika,Jyeshta", 30);
		finalResult.put("Vrischika,Jyeshta,Vrischika,Jyeshta", 28);

		// Vrischika,Dhanus
		finalResult.put("Vrischika,Visakha,Dhanus,Moola", 24);
		finalResult.put("Vrischika,Anuradha,Dhanus,Moola", 26);
		finalResult.put("Vrischika,Jyeshta,Dhanus,Moola", 16);

		finalResult.put("Vrischika,Visakha,Dhanus,Poorvashada", 18);
		finalResult.put("Vrischika,Anuradha,Dhanus,Poorvashada", 18);
		finalResult.put("Vrischika,Jyeshta,Dhanus,Poorvashada", 19);

		finalResult.put("Vrischika,Visakha,Dhanus,Uttarashada", 11);
		finalResult.put("Vrischika,Anuradha,Dhanus,Uttarashada", 25);
		finalResult.put("Vrischika,Jyeshta,Dhanus,Uttarashada", 19);

		// Vrischika,Makara
		finalResult.put("Vrischika,Visakha,Makara,Uttarashada", 14);
		finalResult.put("Vrischika,Anuradha,Makara,Uttarashada", 28);
		finalResult.put("Vrischika,Jyeshta,Makara,Uttarashada", 22);

		finalResult.put("Vrischika,Visakha,Makara,Sravana", 14);
		finalResult.put("Vrischika,Anuradha,Makara,Sravana", 28);
		finalResult.put("Vrischika,Jyeshta,Makara,Sravana", 23);

		finalResult.put("Vrischika,Visakha,Makara,Dhanishta", 28);
		finalResult.put("Vrischika,Anuradha,Makara,Dhanishta", 14);
		finalResult.put("Vrischika,Jyeshta,Makara,Dhanishta", 28);

		// Vrischika,Kumbha
		finalResult.put("Vrischika,Visakha,Kumbha,Dhanishta", 28);
		finalResult.put("Vrischika,Anuradha,Kumbha,Dhanishta", 12);
		finalResult.put("Vrischika,Jyeshta,Kumbha,Dhanishta", 26);

		finalResult.put("Vrischika,Visakha,Kumbha,Satabhishak", 26);
		finalResult.put("Vrischika,Anuradha,Kumbha,Satabhishak", 12);
		finalResult.put("Vrischika,Jyeshta,Kumbha,Satabhishak", 26);

		finalResult.put("Vrischika,Visakha,Kumbha,Poorvabhadra", 26);
		finalResult.put("Vrischika,Anuradha,Kumbha,Poorvabhadra", 21);
		finalResult.put("Vrischika,Jyeshta,Kumbha,Poorvabhadra", 19);

		// Vrischika,Meena
		finalResult.put("Vrischika,Visakha,Meena,Poorvabhadra", 21);
		finalResult.put("Vrischika,Anuradha,Meena,Poorvabhadra", 27);
		finalResult.put("Vrischika,Jyeshta,Meena,Poorvabhadra", 11);

		finalResult.put("Vrischika,Visakha,Meena,Uttarabhadra", 18);
		finalResult.put("Vrischika,Anuradha,Meena,Uttarabhadra", 20);
		finalResult.put("Vrischika,Jyeshta,Meena,Uttarabhadra", 22);

		finalResult.put("Vrischika,Visakha,Meena,Revati", 12);
		finalResult.put("Vrischika,Anuradha,Meena,Revati", 27);
		finalResult.put("Vrischika,Jyeshta,Meena,Revati", 22);

		// 9
		// Dhanus,mesha
		finalResult.put("Dhanus,Moola,Mesha,Aswini", 13);
		finalResult.put("Dhanus,Poorvashada,Mesha,Aswini", 27);
		finalResult.put("Dhanus,Uttarashada,Mesha,Aswini", 24);

		finalResult.put("Dhanus,Moola,Mesha,Bharani", 20);
		finalResult.put("Dhanus,Poorvashada,Mesha,Bharani", 20);
		finalResult.put("Dhanus,Uttarashada,Mesha,Bharani", 27);

		finalResult.put("Dhanus,Moola,Mesha,Krittika", 24);
		finalResult.put("Dhanus,Poorvashada,Mesha,Krittika", 19);
		finalResult.put("Dhanus,Uttarashada,Mesha,Krittika", 14);

		// Dhanus,Vrishabha
		finalResult.put("Dhanus,Moola,Vrishabha,Krittika", 20);
		finalResult.put("Dhanus,Poorvashada,Vrishabha,Krittika", 13);
		finalResult.put("Dhanus,Uttarashada,Vrishabha,Krittika", 9);

		finalResult.put("Dhanus,Moola,Vrishabha,Rohini", 14);
		finalResult.put("Dhanus,Poorvashada,Vrishabha,Rohini", 20);
		finalResult.put("Dhanus,Uttarashada,Vrishabha,Rohini", 11);

		finalResult.put("Dhanus,Moola,Vrishabha,Mrigasira", 15);
		finalResult.put("Dhanus,Poorvashada,Vrishabha,Mrigasira", 11);
		finalResult.put("Dhanus,Uttarashada,Vrishabha,Mrigasira", 18);

		// Dhanus,Mithuna
		finalResult.put("Dhanus,Moola,Mithuna,Mrigasira", 23);
		finalResult.put("Dhanus,Poorvashada,Mithuna,Mrigasira", 18);
		finalResult.put("Dhanus,Uttarashada,Mithuna,Mrigasira", 24);

		finalResult.put("Dhanus,Moola,Mithuna,Ardra", 16);
		finalResult.put("Dhanus,Poorvashada,Mithuna,Ardra", 27);
		finalResult.put("Dhanus,Uttarashada,Mithuna,Ardra", 27);

		finalResult.put("Dhanus,Moola,Mithuna,Punarvasu", 13);
		finalResult.put("Dhanus,Poorvashada,Mithuna,Punarvasu", 26);
		finalResult.put("Dhanus,Uttarashada,Mithuna,Punarvasu", 27);

		// Dhanus,Kataka
		finalResult.put("Dhanus,Moola,Kataka,Punarvasu", 8);
		finalResult.put("Dhanus,Poorvashada,Kataka,Punarvasu", 20);
		finalResult.put("Dhanus,Uttarashada,Kataka,Punarvasu", 21);

		finalResult.put("Dhanus,Moola,Kataka,Pushyami", 17);
		finalResult.put("Dhanus,Poorvashada,Kataka,Pushyami", 11);
		finalResult.put("Dhanus,Uttarashada,Kataka,Pushyami", 22);

		finalResult.put("Dhanus,Moola,Kataka,Aslesha", 22);
		finalResult.put("Dhanus,Poorvashada,Kataka,Aslesha", 16);
		finalResult.put("Dhanus,Uttarashada,Kataka,Aslesha", 8);

		// Dhanus,Simha
		finalResult.put("Dhanus,Moola,Simha,Makha", 24);
		finalResult.put("Dhanus,Poorvashada,Simha,Makha", 21);
		finalResult.put("Dhanus,Uttarashada,Simha,Makha", 11);

		finalResult.put("Dhanus,Moola,Simha,Poorva Phalguni", 19);
		finalResult.put("Dhanus,Poorvashada,Simha,Poorva Phalguni", 19);
		finalResult.put("Dhanus,Uttarashada,Simha,Poorva Phalguni", 27);

		finalResult.put("Dhanus,Moola,Simha,Uttara Phalguni", 10);
		finalResult.put("Dhanus,Poorvashada,Simha,Uttara Phalguni", 27);
		finalResult.put("Dhanus,Uttarashada,Simha,Uttara Phalguni", 28);

		// Dhanus,Kanya
		finalResult.put("Dhanus,Moola,Kanya,Uttara Phalguni", 15);
		finalResult.put("Dhanus,Poorvashada,Kanya,Uttara Phalguni", 28);
		finalResult.put("Dhanus,Uttarashada,Kanya,Uttara Phalguni", 29);

		finalResult.put("Dhanus,Moola,Kanya,Hasta", 14);
		finalResult.put("Dhanus,Poorvashada,Kanya,Hasta", 26);
		finalResult.put("Dhanus,Uttarashada,Kanya,Hasta", 27);

		finalResult.put("Dhanus,Moola,Kanya,Chitra", 28);
		finalResult.put("Dhanus,Poorvashada,Kanya,Chitra", 13);
		finalResult.put("Dhanus,Uttarashada,Kanya,Chitra", 21);

		// Dhanus,Thula
		finalResult.put("Dhanus,Moola,Thula,Chitra", 28);
		finalResult.put("Dhanus,Poorvashada,Thula,Chitra", 13);
		finalResult.put("Dhanus,Uttarashada,Thula,Chitra", 21);

		finalResult.put("Dhanus,Moola,Thula,Swati", 24);
		finalResult.put("Dhanus,Poorvashada,Thula,Swati", 26);
		finalResult.put("Dhanus,Uttarashada,Thula,Swati", 18);

		finalResult.put("Dhanus,Moola,Thula,Visakha", 28);
		finalResult.put("Dhanus,Poorvashada,Thula,Visakha", 21);
		finalResult.put("Dhanus,Uttarashada,Thula,Visakha", 13);

		// Dhanus,Vrischika
		finalResult.put("Dhanus,Moola,Vrischika,Visakha", 23);
		finalResult.put("Dhanus,Poorvashada,Vrischika,Visakha", 17);
		finalResult.put("Dhanus,Uttarashada,Vrischika,Visakha", 9);

		finalResult.put("Dhanus,Moola,Vrischika,Anuradha", 16);
		finalResult.put("Dhanus,Poorvashada,Vrischika,Anuradha", 14);
		finalResult.put("Dhanus,Uttarashada,Vrischika,Anuradha", 22);

		finalResult.put("Dhanus,Moola,Vrischika,Jyeshta", 13);
		finalResult.put("Dhanus,Poorvashada,Vrischika,Jyeshta", 17);
		finalResult.put("Dhanus,Uttarashada,Vrischika,Jyeshta", 17);

		// Dhanus,Dhanus
		finalResult.put("Dhanus,Moola,Dhanus,Moola", 28);
		finalResult.put("Dhanus,Poorvashada,Dhanus,Moola", 27);
		finalResult.put("Dhanus,Uttarashada,Dhanus,Moola", 25);

		finalResult.put("Dhanus,Moola,Dhanus,Poorvashada", 27);
		finalResult.put("Dhanus,Poorvashada,Dhanus,Poorvashada", 28);
		finalResult.put("Dhanus,Uttarashada,Dhanus,Poorvashada", 34);

		finalResult.put("Dhanus,Moola,Dhanus,Uttarashada", 25);
		finalResult.put("Dhanus,Poorvashada,Dhanus,Uttarashada", 34);
		finalResult.put("Dhanus,Uttarashada,Dhanus,Uttarashada", 28);

		// Dhanus,Makara
		finalResult.put("Dhanus,Moola,Makara,Uttarashada", 16);
		finalResult.put("Dhanus,Poorvashada,Makara,Uttarashada", 25);
		finalResult.put("Dhanus,Uttarashada,Makara,Uttarashada", 19);

		finalResult.put("Dhanus,Moola,Makara,Sravana", 17);
		finalResult.put("Dhanus,Poorvashada,Makara,Sravana", 25);
		finalResult.put("Dhanus,Uttarashada,Makara,Sravana", 15);

		finalResult.put("Dhanus,Moola,Makara,Dhanishta", 21);
		finalResult.put("Dhanus,Poorvashada,Makara,Dhanishta", 9);
		finalResult.put("Dhanus,Uttarashada,Makara,Dhanishta", 16);

		// Dhanus,Kumbha
		finalResult.put("Dhanus,Moola,Kumbha,Dhanishta", 29);
		finalResult.put("Dhanus,Poorvashada,Kumbha,Dhanishta", 16);
		finalResult.put("Dhanus,Uttarashada,Kumbha,Dhanishta", 13);

		finalResult.put("Dhanus,Moola,Kumbha,Satabhishak", 22);
		finalResult.put("Dhanus,Poorvashada,Kumbha,Satabhishak", 23);
		finalResult.put("Dhanus,Uttarashada,Kumbha,Satabhishak", 23);

		finalResult.put("Dhanus,Moola,Kumbha,Poorvabhadra", 15);
		finalResult.put("Dhanus,Poorvashada,Kumbha,Poorvabhadra", 30);
		finalResult.put("Dhanus,Uttarashada,Kumbha,Poorvabhadra", 29);

		// Dhanus,Meena
		finalResult.put("Dhanus,Moola,Meena,Poorvabhadra", 15);
		finalResult.put("Dhanus,Poorvashada,Meena,Poorvabhadra", 31);
		finalResult.put("Dhanus,Uttarashada,Meena,Poorvabhadra", 30);

		finalResult.put("Dhanus,Moola,Meena,Uttarabhadra", 24);
		finalResult.put("Dhanus,Poorvashada,Meena,Uttarabhadra", 22);
		finalResult.put("Dhanus,Uttarashada,Meena,Uttarabhadra", 31);

		finalResult.put("Dhanus,Moola,Meena,Revati", 27);
		finalResult.put("Dhanus,Poorvashada,Meena,Revati", 30);
		finalResult.put("Dhanus,Uttarashada,Meena,Revati", 21);

		// 10
		// Makara,mesha
		finalResult.put("Makara,Uttarashada,Mesha,Aswini", 26);
		finalResult.put("Makara,Sravana,Mesha,Aswini", 24);
		finalResult.put("Makara,Dhanishta,Mesha,Aswini", 21);

		finalResult.put("Makara,Uttarashada,Mesha,Bharani", 28);
		finalResult.put("Makara,Sravana,Mesha,Bharani", 26);
		finalResult.put("Makara,Dhanishta,Mesha,Bharani", 10);

		finalResult.put("Makara,Uttarashada,Mesha,Krittika", 15);
		finalResult.put("Makara,Sravana,Mesha,Krittika", 10);
		finalResult.put("Makara,Dhanishta,Mesha,Krittika", 25);

		// Makara,Vrishabha
		finalResult.put("Makara,Uttarashada,Vrishabha,Krittika", 14);
		finalResult.put("Makara,Sravana,Vrishabha,Krittika", 10);
		finalResult.put("Makara,Dhanishta,Vrishabha,Krittika", 23);

		finalResult.put("Makara,Uttarashada,Vrishabha,Rohini", 17);
		finalResult.put("Makara,Sravana,Vrishabha,Rohini", 18);
		finalResult.put("Makara,Dhanishta,Vrishabha,Rohini", 20);

		finalResult.put("Makara,Uttarashada,Vrishabha,Mrigasira", 21);
		finalResult.put("Makara,Sravana,Vrishabha,Mrigasira", 24);
		finalResult.put("Makara,Dhanishta,Vrishabha,Mrigasira", 13);

		// Makara,Mithuna
		finalResult.put("Makara,Uttarashada,Mithuna,Mrigasira", 20);
		finalResult.put("Makara,Sravana,Mithuna,Mrigasira", 25);
		finalResult.put("Makara,Dhanishta,Mithuna,Mrigasira", 12);

		finalResult.put("Makara,Uttarashada,Mithuna,Ardra", 22);
		finalResult.put("Makara,Sravana,Mithuna,Ardra", 22);
		finalResult.put("Makara,Dhanishta,Mithuna,Ardra", 17);

		finalResult.put("Makara,Uttarashada,Mithuna,Punarvasu", 27);
		finalResult.put("Makara,Sravana,Mithuna,Punarvasu", 23);
		finalResult.put("Makara,Dhanishta,Mithuna,Punarvasu", 17);

		// Makara,Kataka
		finalResult.put("Makara,Uttarashada,Kataka,Punarvasu", 28);
		finalResult.put("Makara,Sravana,Kataka,Punarvasu", 27);
		finalResult.put("Makara,Dhanishta,Kataka,Punarvasu", 21);

		finalResult.put("Makara,Uttarashada,Kataka,Pushyami", 26);
		finalResult.put("Makara,Sravana,Kataka,Pushyami", 25);
		finalResult.put("Makara,Dhanishta,Kataka,Pushyami", 13);

		finalResult.put("Makara,Uttarashada,Kataka,Aslesha", 12);
		finalResult.put("Makara,Sravana,Kataka,Aslesha", 13);
		finalResult.put("Makara,Dhanishta,Kataka,Aslesha", 27);

		// Makara,Simha
		finalResult.put("Makara,Uttarashada,Simha,Makha", 5);
		finalResult.put("Makara,Sravana,Simha,Makha", 4);
		finalResult.put("Makara,Dhanishta,Simha,Makha", 18);

		finalResult.put("Makara,Uttarashada,Simha,Poorva Phalguni", 21);
		finalResult.put("Makara,Sravana,Simha,Poorva Phalguni", 18);
		finalResult.put("Makara,Dhanishta,Simha,Poorva Phalguni", 4);

		finalResult.put("Makara,Uttarashada,Simha,Uttara Phalguni", 22);
		finalResult.put("Makara,Sravana,Simha,Uttara Phalguni", 20);
		finalResult.put("Makara,Dhanishta,Simha,Uttara Phalguni", 11);

		// Makara,Kanya
		finalResult.put("Makara,Uttarashada,Kanya,Uttara Phalguni", 26);
		finalResult.put("Makara,Sravana,Kanya,Uttara Phalguni", 25);
		finalResult.put("Makara,Dhanishta,Kanya,Uttara Phalguni", 16);

		finalResult.put("Makara,Uttarashada,Kanya,Hasta", 23);
		finalResult.put("Makara,Sravana,Kanya,Hasta", 24);
		finalResult.put("Makara,Dhanishta,Kanya,Hasta", 19);

		finalResult.put("Makara,Uttarashada,Kanya,Chitra", 17);
		finalResult.put("Makara,Sravana,Kanya,Chitra", 19);
		finalResult.put("Makara,Dhanishta,Kanya,Chitra", 19);

		// Makara,Thula
		finalResult.put("Makara,Uttarashada,Thula,Chitra", 25);
		finalResult.put("Makara,Sravana,Thula,Chitra", 27);
		finalResult.put("Makara,Dhanishta,Thula,Chitra", 26);

		finalResult.put("Makara,Uttarashada,Thula,Swati", 22);
		finalResult.put("Makara,Sravana,Thula,Swati", 24);
		finalResult.put("Makara,Dhanishta,Thula,Swati", 27);

		finalResult.put("Makara,Uttarashada,Thula,Visakha", 17);
		finalResult.put("Makara,Sravana,Thula,Visakha", 17);
		finalResult.put("Makara,Dhanishta,Thula,Visakha", 32);

		// Makara,Vrischika
		finalResult.put("Makara,Uttarashada,Vrischika,Visakha", 12);
		finalResult.put("Makara,Sravana,Vrischika,Visakha", 12);
		finalResult.put("Makara,Dhanishta,Vrischika,Visakha", 27);

		finalResult.put("Makara,Uttarashada,Vrischika,Anuradha", 25);
		finalResult.put("Makara,Sravana,Vrischika,Anuradha", 26);
		finalResult.put("Makara,Dhanishta,Vrischika,Anuradha", 12);

		finalResult.put("Makara,Uttarashada,Vrischika,Jyeshta", 20);
		finalResult.put("Makara,Sravana,Vrischika,Jyeshta", 20);
		finalResult.put("Makara,Dhanishta,Vrischika,Jyeshta", 25);

		// Makara,Dhanus
		finalResult.put("Makara,Uttarashada,Dhanus,Moola", 15);
		finalResult.put("Makara,Sravana,Dhanus,Moola", 15);
		finalResult.put("Makara,Dhanishta,Dhanus,Moola", 21);

		finalResult.put("Makara,Uttarashada,Dhanus,Poorvashada", 24);
		finalResult.put("Makara,Sravana,Dhanus,Poorvashada", 23);
		finalResult.put("Makara,Dhanishta,Dhanus,Poorvashada", 8);

		finalResult.put("Makara,Uttarashada,Dhanus,Uttarashada", 18);
		finalResult.put("Makara,Sravana,Dhanus,Uttarashada", 15);
		finalResult.put("Makara,Dhanishta,Dhanus,Uttarashada", 15);

		// Makara,Makara
		finalResult.put("Makara,Uttarashada,Makara,Uttarashada", 24);
		finalResult.put("Makara,Sravana,Makara,Uttarashada", 25);
		finalResult.put("Makara,Dhanishta,Makara,Uttarashada", 25);

		finalResult.put("Makara,Uttarashada,Makara,Sravana", 25);
		finalResult.put("Makara,Sravana,Makara,Sravana", 28);
		finalResult.put("Makara,Dhanishta,Makara,Sravana", 30);

		finalResult.put("Makara,Uttarashada,Makara,Dhanishta", 28);
		finalResult.put("Makara,Sravana,Makara,Dhanishta", 21);
		finalResult.put("Makara,Dhanishta,Makara,Dhanishta", 28);

		// Makara,Kumbha
		finalResult.put("Makara,Uttarashada,Kumbha,Dhanishta", 18);
		finalResult.put("Makara,Sravana,Kumbha,Dhanishta", 21);
		finalResult.put("Makara,Dhanishta,Kumbha,Dhanishta", 20);

		finalResult.put("Makara,Uttarashada,Kumbha,Satabhishak", 18);
		finalResult.put("Makara,Sravana,Kumbha,Satabhishak", 18);
		finalResult.put("Makara,Dhanishta,Kumbha,Satabhishak", 25);

		finalResult.put("Makara,Uttarashada,Kumbha,Poorvabhadra", 24);
		finalResult.put("Makara,Sravana,Kumbha,Poorvabhadra", 25);
		finalResult.put("Makara,Dhanishta,Kumbha,Poorvabhadra", 20);

		// Makara,Meena
		finalResult.put("Makara,Uttarashada,Meena,Poorvabhadra", 28);
		finalResult.put("Makara,Sravana,Meena,Poorvabhadra", 30);
		finalResult.put("Makara,Dhanishta,Meena,Poorvabhadra", 25);

		finalResult.put("Makara,Uttarashada,Meena,Uttarabhadra", 29);
		finalResult.put("Makara,Sravana,Meena,Uttarabhadra", 29);
		finalResult.put("Makara,Dhanishta,Meena,Uttarabhadra", 14);

		finalResult.put("Makara,Uttarashada,Meena,Revati", 19);
		finalResult.put("Makara,Sravana,Meena,Revati", 22);
		finalResult.put("Makara,Dhanishta,Meena,Revati", 22);

		// 11
		// Kumbha,mesha
		finalResult.put("Kumbha,Dhanishta,Mesha,Aswini", 21);
		finalResult.put("Kumbha,Satabhishak,Mesha,Aswini", 15);
		finalResult.put("Kumbha,Poorvabhadra,Mesha,Aswini", 16);

		finalResult.put("Kumbha,Dhanishta,Mesha,Bharani", 10);
		finalResult.put("Kumbha,Satabhishak,Mesha,Bharani", 20);
		finalResult.put("Kumbha,Poorvabhadra,Mesha,Bharani", 19);

		finalResult.put("Kumbha,Dhanishta,Mesha,Krittika", 25);
		finalResult.put("Kumbha,Satabhishak,Mesha,Krittika", 27);
		finalResult.put("Kumbha,Poorvabhadra,Mesha,Krittika", 19);

		// Kumbha,Vrishabha
		finalResult.put("Kumbha,Dhanishta,Vrishabha,Krittika", 29);
		finalResult.put("Kumbha,Satabhishak,Vrishabha,Krittika", 31);
		finalResult.put("Kumbha,Poorvabhadra,Vrishabha,Krittika", 23);

		finalResult.put("Kumbha,Dhanishta,Vrishabha,Rohini", 26);
		finalResult.put("Kumbha,Satabhishak,Vrishabha,Rohini", 24);
		finalResult.put("Kumbha,Poorvabhadra,Vrishabha,Rohini", 30);

		finalResult.put("Kumbha,Dhanishta,Vrishabha,Mrigasira", 19);
		finalResult.put("Kumbha,Satabhishak,Vrishabha,Mrigasira", 27);
		finalResult.put("Kumbha,Poorvabhadra,Vrishabha,Mrigasira", 29);

		// Kumbha,Mithuna
		finalResult.put("Kumbha,Dhanishta,Mithuna,Mrigasira", 13);
		finalResult.put("Kumbha,Satabhishak,Mithuna,Mrigasira", 21);
		finalResult.put("Kumbha,Poorvabhadra,Mithuna,Mrigasira", 23);

		finalResult.put("Kumbha,Dhanishta,Mithuna,Ardra", 18);
		finalResult.put("Kumbha,Satabhishak,Mithuna,Ardra", 11);
		finalResult.put("Kumbha,Poorvabhadra,Mithuna,Ardra", 16);

		finalResult.put("Kumbha,Dhanishta,Mithuna,Punarvasu", 18);
		finalResult.put("Kumbha,Satabhishak,Mithuna,Punarvasu", 11);
		finalResult.put("Kumbha,Poorvabhadra,Mithuna,Punarvasu", 17);

		// Kumbha,Kataka
		finalResult.put("Kumbha,Dhanishta,Kataka,Punarvasu", 12);
		finalResult.put("Kumbha,Satabhishak,Kataka,Punarvasu", 7);
		finalResult.put("Kumbha,Poorvabhadra,Kataka,Punarvasu", 11);

		finalResult.put("Kumbha,Dhanishta,Kataka,Pushyami", 4);
		finalResult.put("Kumbha,Satabhishak,Kataka,Pushyami", 14);
		finalResult.put("Kumbha,Poorvabhadra,Kataka,Pushyami", 18);

		finalResult.put("Kumbha,Dhanishta,Kataka,Aslesha", 18);
		finalResult.put("Kumbha,Satabhishak,Kataka,Aslesha", 18);
		finalResult.put("Kumbha,Poorvabhadra,Kataka,Aslesha", 12);

		// Kumbha,Simha
		finalResult.put("Kumbha,Dhanishta,Simha,Makha", 24);
		finalResult.put("Kumbha,Satabhishak,Simha,Makha", 25);
		finalResult.put("Kumbha,Poorvabhadra,Simha,Makha", 18);

		finalResult.put("Kumbha,Dhanishta,Simha,Poorva Phalguni", 11);
		finalResult.put("Kumbha,Satabhishak,Simha,Poorva Phalguni", 19);
		finalResult.put("Kumbha,Poorvabhadra,Simha,Poorva Phalguni", 24);

		finalResult.put("Kumbha,Dhanishta,Simha,Uttara Phalguni", 18);
		finalResult.put("Kumbha,Satabhishak,Simha,Uttara Phalguni", 12);
		finalResult.put("Kumbha,Poorvabhadra,Simha,Uttara Phalguni", 16);

		// Kumbha,Kanya
		finalResult.put("Kumbha,Dhanishta,Kanya,Uttara Phalguni", 16);
		finalResult.put("Kumbha,Satabhishak,Kanya,Uttara Phalguni", 10);
		finalResult.put("Kumbha,Poorvabhadra,Kanya,Uttara Phalguni", 14);

		finalResult.put("Kumbha,Dhanishta,Kanya,Hasta", 19);
		finalResult.put("Kumbha,Satabhishak,Kanya,Hasta", 7);
		finalResult.put("Kumbha,Poorvabhadra,Kanya,Hasta", 14);

		finalResult.put("Kumbha,Dhanishta,Kanya,Chitra", 18);
		finalResult.put("Kumbha,Satabhishak,Kanya,Chitra", 24);
		finalResult.put("Kumbha,Poorvabhadra,Kanya,Chitra", 18);

		// Kumbha,Thula
		finalResult.put("Kumbha,Dhanishta,Thula,Chitra", 18);
		finalResult.put("Kumbha,Satabhishak,Thula,Chitra", 26);
		finalResult.put("Kumbha,Poorvabhadra,Thula,Chitra", 20);

		finalResult.put("Kumbha,Dhanishta,Thula,Swati", 21);
		finalResult.put("Kumbha,Satabhishak,Thula,Swati", 20);
		finalResult.put("Kumbha,Poorvabhadra,Thula,Swati", 25);

		finalResult.put("Kumbha,Dhanishta,Thula,Visakha", 26);
		finalResult.put("Kumbha,Satabhishak,Thula,Visakha", 26);
		finalResult.put("Kumbha,Poorvabhadra,Thula,Visakha", 22);

		// Kumbha,Vrischika
		finalResult.put("Kumbha,Dhanishta,Vrischika,Visakha", 27);
		finalResult.put("Kumbha,Satabhishak,Vrischika,Visakha", 26);
		finalResult.put("Kumbha,Poorvabhadra,Vrischika,Visakha", 22);

		finalResult.put("Kumbha,Dhanishta,Vrischika,Anuradha", 12);
		finalResult.put("Kumbha,Satabhishak,Vrischika,Anuradha", 22);
		finalResult.put("Kumbha,Poorvabhadra,Vrischika,Anuradha", 24);

		finalResult.put("Kumbha,Dhanishta,Vrischika,Jyeshta", 25);
		finalResult.put("Kumbha,Satabhishak,Vrischika,Jyeshta", 18);
		finalResult.put("Kumbha,Poorvabhadra,Vrischika,Jyeshta", 11);

		// Kumbha,Dhanus
		finalResult.put("Kumbha,Dhanishta,Dhanus,Moola", 25);
		finalResult.put("Kumbha,Satabhishak,Dhanus,Moola", 21);
		finalResult.put("Kumbha,Poorvabhadra,Dhanus,Moola", 11);

		finalResult.put("Kumbha,Dhanishta,Dhanus,Poorvashada", 15);
		finalResult.put("Kumbha,Satabhishak,Dhanus,Poorvashada", 22);
		finalResult.put("Kumbha,Poorvabhadra,Dhanus,Poorvashada", 29);

		finalResult.put("Kumbha,Dhanishta,Dhanus,Uttarashada", 22);
		finalResult.put("Kumbha,Satabhishak,Dhanus,Uttarashada", 22);
		finalResult.put("Kumbha,Poorvabhadra,Dhanus,Uttarashada", 28);

		// Kumbha,Makara
		finalResult.put("Kumbha,Dhanishta,Makara,Uttarashada", 17);
		finalResult.put("Kumbha,Satabhishak,Makara,Uttarashada", 17);
		finalResult.put("Kumbha,Poorvabhadra,Makara,Uttarashada", 23);

		finalResult.put("Kumbha,Dhanishta,Makara,Sravana", 20);
		finalResult.put("Kumbha,Satabhishak,Makara,Sravana", 18);
		finalResult.put("Kumbha,Poorvabhadra,Makara,Sravana", 23);

		finalResult.put("Kumbha,Dhanishta,Makara,Dhanishta", 18);
		finalResult.put("Kumbha,Satabhishak,Makara,Dhanishta", 23);
		finalResult.put("Kumbha,Poorvabhadra,Makara,Dhanishta", 21);

		// Kumbha,Kumbha
		finalResult.put("Kumbha,Dhanishta,Kumbha,Dhanishta", 28);
		finalResult.put("Kumbha,Satabhishak,Kumbha,Dhanishta", 33);
		finalResult.put("Kumbha,Poorvabhadra,Kumbha,Dhanishta", 28);

		finalResult.put("Kumbha,Dhanishta,Kumbha,Satabhishak", 33);
		finalResult.put("Kumbha,Satabhishak,Kumbha,Satabhishak", 28);
		finalResult.put("Kumbha,Poorvabhadra,Kumbha,Satabhishak", 19);

		finalResult.put("Kumbha,Dhanishta,Kumbha,Poorvabhadra", 27);
		finalResult.put("Kumbha,Satabhishak,Kumbha,Poorvabhadra", 19);
		finalResult.put("Kumbha,Poorvabhadra,Kumbha,Poorvabhadra", 28);

		// Kumbha,Meena
		finalResult.put("Kumbha,Dhanishta,Meena,Poorvabhadra", 17);
		finalResult.put("Kumbha,Satabhishak,Meena,Poorvabhadra", 7);
		finalResult.put("Kumbha,Poorvabhadra,Meena,Poorvabhadra", 16);

		finalResult.put("Kumbha,Dhanishta,Meena,Uttarabhadra", 6);
		finalResult.put("Kumbha,Satabhishak,Meena,Uttarabhadra", 16);
		finalResult.put("Kumbha,Poorvabhadra,Meena,Uttarabhadra", 21);

		finalResult.put("Kumbha,Dhanishta,Meena,Revati", 14);
		finalResult.put("Kumbha,Satabhishak,Meena,Revati", 16);
		finalResult.put("Kumbha,Poorvabhadra,Meena,Revati", 18);

		// 12
		// Meena,mesha
		finalResult.put("Meena,Poorvabhadra,Mesha,Aswini", 14);
		finalResult.put("Meena,Uttarabhadra,Mesha,Aswini", 24);
		finalResult.put("Meena,Revati,Mesha,Aswini", 26);

		finalResult.put("Meena,Poorvabhadra,Mesha,Bharani", 22);
		finalResult.put("Meena,Uttarabhadra,Mesha,Bharani", 16);
		finalResult.put("Meena,Revati,Mesha,Bharani", 28);

		finalResult.put("Meena,Poorvabhadra,Mesha,Krittika", 17);
		finalResult.put("Meena,Uttarabhadra,Mesha,Krittika", 19);
		finalResult.put("Meena,Revati,Mesha,Krittika", 11);

		// Meena,Vrishabha
		finalResult.put("Meena,Poorvabhadra,Vrishabha,Krittika", 20);
		finalResult.put("Meena,Uttarabhadra,Vrishabha,Krittika", 22);
		finalResult.put("Meena,Revati,Vrishabha,Krittika", 14);

		finalResult.put("Meena,Poorvabhadra,Vrishabha,Rohini", 27);
		finalResult.put("Meena,Uttarabhadra,Vrishabha,Rohini", 26);
		finalResult.put("Meena,Revati,Vrishabha,Rohini", 19);

		finalResult.put("Meena,Poorvabhadra,Vrishabha,Mrigasira", 26);
		finalResult.put("Meena,Uttarabhadra,Vrishabha,Mrigasira", 17);
		finalResult.put("Meena,Revati,Vrishabha,Mrigasira", 27);

		// Meena,Mithuna
		finalResult.put("Meena,Poorvabhadra,Mithuna,Mrigasira", 27);
		finalResult.put("Meena,Uttarabhadra,Mithuna,Mrigasira", 17);
		finalResult.put("Meena,Revati,Mithuna,Mrigasira", 27);

		finalResult.put("Meena,Poorvabhadra,Mithuna,Ardra", 19);
		finalResult.put("Meena,Uttarabhadra,Mithuna,Ardra", 27);
		finalResult.put("Meena,Revati,Mithuna,Ardra", 27);

		finalResult.put("Meena,Poorvabhadra,Mithuna,Punarvasu", 19);
		finalResult.put("Meena,Uttarabhadra,Mithuna,Punarvasu", 27);
		finalResult.put("Meena,Revati,Mithuna,Punarvasu", 28);

		// Meena,Kataka
		finalResult.put("Meena,Poorvabhadra,Kataka,Punarvasu", 17);
		finalResult.put("Meena,Uttarabhadra,Kataka,Punarvasu", 25);
		finalResult.put("Meena,Revati,Kataka,Punarvasu", 25);

		finalResult.put("Meena,Poorvabhadra,Kataka,Pushyami", 24);
		finalResult.put("Meena,Uttarabhadra,Kataka,Pushyami", 18);
		finalResult.put("Meena,Revati,Kataka,Pushyami", 27);

		finalResult.put("Meena,Poorvabhadra,Kataka,Aslesha", 18);
		finalResult.put("Meena,Uttarabhadra,Kataka,Aslesha", 20);
		finalResult.put("Meena,Revati,Kataka,Aslesha", 12);

		// Meena,Simha
		finalResult.put("Meena,Poorvabhadra,Simha,Makha", 17);
		finalResult.put("Meena,Uttarabhadra,Simha,Makha", 18);
		finalResult.put("Meena,Revati,Simha,Makha", 12);

		finalResult.put("Meena,Poorvabhadra,Simha,Poorva Phalguni", 23);
		finalResult.put("Meena,Uttarabhadra,Simha,Poorva Phalguni", 16);
		finalResult.put("Meena,Revati,Simha,Poorva Phalguni", 24);

		finalResult.put("Meena,Poorvabhadra,Simha,Uttara Phalguni", 15);
		finalResult.put("Meena,Uttarabhadra,Simha,Uttara Phalguni", 26);
		finalResult.put("Meena,Revati,Simha,Uttara Phalguni", 24);

		// Meena,Kanya
		finalResult.put("Meena,Poorvabhadra,Kanya,Uttara Phalguni", 18);
		finalResult.put("Meena,Uttarabhadra,Kanya,Uttara Phalguni", 29);
		finalResult.put("Meena,Revati,Kanya,Uttara Phalguni", 27);

		finalResult.put("Meena,Poorvabhadra,Kanya,Hasta", 19);
		finalResult.put("Meena,Uttarabhadra,Kanya,Hasta", 27);
		finalResult.put("Meena,Revati,Kanya,Hasta", 27);

		finalResult.put("Meena,Poorvabhadra,Kanya,Chitra", 22);
		finalResult.put("Meena,Uttarabhadra,Kanya,Chitra", 11);
		finalResult.put("Meena,Revati,Kanya,Chitra", 21);

		// Meena,Thula
		finalResult.put("Meena,Poorvabhadra,Thula,Chitra", 15);
		finalResult.put("Meena,Uttarabhadra,Thula,Chitra", 4);
		finalResult.put("Meena,Revati,Thula,Chitra", 13);

		finalResult.put("Meena,Poorvabhadra,Thula,Swati", 19);
		finalResult.put("Meena,Uttarabhadra,Thula,Swati", 20);
		finalResult.put("Meena,Revati,Thula,Swati", 13);

		finalResult.put("Meena,Poorvabhadra,Thula,Visakha", 16);
		finalResult.put("Meena,Uttarabhadra,Thula,Visakha", 13);
		finalResult.put("Meena,Revati,Thula,Visakha", 5);

		// Meena,Vrischika
		finalResult.put("Meena,Poorvabhadra,Vrischika,Visakha", 21);
		finalResult.put("Meena,Uttarabhadra,Vrischika,Visakha", 18);
		finalResult.put("Meena,Revati,Vrischika,Visakha", 9);

		finalResult.put("Meena,Poorvabhadra,Vrischika,Anuradha", 24);
		finalResult.put("Meena,Uttarabhadra,Vrischika,Anuradha", 18);
		finalResult.put("Meena,Revati,Vrischika,Anuradha", 27);

		finalResult.put("Meena,Poorvabhadra,Vrischika,Jyeshta", 9);
		finalResult.put("Meena,Uttarabhadra,Vrischika,Jyeshta", 21);
		finalResult.put("Meena,Revati,Vrischika,Jyeshta", 21);

		// Meena,Dhanus
		finalResult.put("Meena,Poorvabhadra,Dhanus,Moola", 17);
		finalResult.put("Meena,Uttarabhadra,Dhanus,Moola", 25);
		finalResult.put("Meena,Revati,Dhanus,Moola", 27);

		finalResult.put("Meena,Poorvabhadra,Dhanus,Poorvashada", 32);
		finalResult.put("Meena,Uttarabhadra,Dhanus,Poorvashada", 23);
		finalResult.put("Meena,Revati,Dhanus,Poorvashada", 32);

		finalResult.put("Meena,Poorvabhadra,Dhanus,Uttarashada", 31);
		finalResult.put("Meena,Uttarabhadra,Dhanus,Uttarashada", 32);
		finalResult.put("Meena,Revati,Dhanus,Uttarashada", 23);

		// Meena,Makara
		finalResult.put("Meena,Poorvabhadra,Makara,Uttarashada", 30);
		finalResult.put("Meena,Uttarabhadra,Makara,Uttarashada", 32);
		finalResult.put("Meena,Revati,Makara,Uttarashada", 23);

		finalResult.put("Meena,Poorvabhadra,Makara,Sravana", 32);
		finalResult.put("Meena,Uttarabhadra,Makara,Sravana", 31);
		finalResult.put("Meena,Revati,Makara,Sravana", 24);

		finalResult.put("Meena,Poorvabhadra,Makara,Dhanishta", 26);
		finalResult.put("Meena,Uttarabhadra,Makara,Dhanishta", 15);
		finalResult.put("Meena,Revati,Makara,Dhanishta", 22);

		// Meena,Kumbha
		finalResult.put("Meena,Poorvabhadra,Kumbha,Dhanishta", 18);
		finalResult.put("Meena,Uttarabhadra,Kumbha,Dhanishta", 7);
		finalResult.put("Meena,Revati,Kumbha,Dhanishta", 14);

		finalResult.put("Meena,Poorvabhadra,Kumbha,Satabhishak", 9);
		finalResult.put("Meena,Uttarabhadra,Kumbha,Satabhishak", 17);
		finalResult.put("Meena,Revati,Kumbha,Satabhishak", 16);

		finalResult.put("Meena,Poorvabhadra,Kumbha,Poorvabhadra", 18);
		finalResult.put("Meena,Uttarabhadra,Kumbha,Poorvabhadra", 23);
		finalResult.put("Meena,Revati,Kumbha,Poorvabhadra", 20);

		// Meena,Meena
		finalResult.put("Meena,Poorvabhadra,Meena,Poorvabhadra", 28);
		finalResult.put("Meena,Uttarabhadra,Meena,Poorvabhadra", 33);
		finalResult.put("Meena,Revati,Meena,Poorvabhadra", 30);

		finalResult.put("Meena,Poorvabhadra,Meena,Uttarabhadra", 33);
		finalResult.put("Meena,Uttarabhadra,Meena,Uttarabhadra", 28);
		finalResult.put("Meena,Revati,Meena,Uttarabhadra", 34);

		finalResult.put("Meena,Poorvabhadra,Meena,Revati", 30);
		finalResult.put("Meena,Uttarabhadra,Meena,Revati", 33);
		finalResult.put("Meena,Revati,Meena,Revati", 28);

	}

}
