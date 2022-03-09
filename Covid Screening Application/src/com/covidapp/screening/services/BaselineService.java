package com.covidapp.screening.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.covidapp.screening.entities.BaselineTests;
import com.covidapp.screening.entities.Temperature;

public class BaselineService {

	public BaselineService() {
		getBaselineTests();
	}

	public List<BaselineTests> getBaselineTests() {
		List<BaselineTests> tests = new ArrayList<>();

		Scanner x = new Scanner(System.in);
		System.out.println("**************Baseline Tests**************");
		System.out.println("\n");

		System.out.println("Temperature         	    :");
		int temp = x.nextInt();

		Temperature t = new Temperature();
		t.setTemp(temp);

		if (temp > 0) {
			System.out.println("Coughing? (Yes / No) 	    :");
			String coughing = x.nextLine();

			if (!coughing.isBlank()) {
				System.out.println("Fever? (Yes / No) 	    :");
				String fever = x.nextLine();

				if (!fever.isBlank()) {
					System.out.println("Lung Pain? (Yes / No) 	    :");
					String lungPain = x.nextLine();

					if (!lungPain.isBlank()) {
						System.out.println("Date Tested (dd/mm/yyyy)    :");
						String dateTested = x.nextLine();

						if (!dateTested.isBlank()) {
							BaselineTests test = new BaselineTests();
							test.setCoughing(coughing);
							test.setDateTested(dateTested);
							test.setFever(fever);
							test.setLungPain(lungPain);
							test.setTemperature(temp);

							tests.add(test);
							FacultyServices fac = new FacultyServices();
						}
					}
				}
			} 
			FacultyServices fac = new FacultyServices();

		}

		return tests;
	}

}
