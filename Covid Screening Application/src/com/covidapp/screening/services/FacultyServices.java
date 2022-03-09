package com.covidapp.screening.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.covidapp.screening.entities.BaselineTests;
import com.covidapp.screening.entities.Faculty;

public class FacultyServices {

	BaselineService service = new BaselineService();

	public FacultyServices() {
		getFacultyData();
	}

	public List<Faculty> getFacultyData() {
		List<Faculty> facultyData = new ArrayList<>();

		Scanner ob = new Scanner(System.in);
		Scanner obj = new Scanner(System.in);
		Scanner obje = new Scanner(System.in);
		Scanner objec = new Scanner(System.in);
		System.out.println("**************Faculty Details**************");
		System.out.println("\n");

		System.out.println("Faculty Name         :");
		String facultyName = obj.nextLine();

		if (!facultyName.isBlank()) {
			System.out.println("Program Name         :");
			String programName = obje.nextLine();

			if (!programName.isBlank()) {
				System.out.println("Level                :");
				String programLevel = objec.nextLine();
				System.out.println("\n");
				if (!programLevel.isBlank()) {
					Faculty f = new Faculty();
					f.setFacultyName(facultyName);
					f.setProgramLevel(programLevel);
					f.setProgramName(programName);

					facultyData.add(f);

					System.out.println("Person Successfully Screened");
					System.out.println("\n");

					List<BaselineTests> data = service.getBaselineTests();

					for (BaselineTests temp : data) {
						if (temp.getTemperature() > 38) {
							System.out.println("ALERT : Person Has High Temperature, Deny Access to campus");
							System.out.println("Press 1 to go back to main menu");
							System.out.println("\n");
							int menu = ob.nextInt();
							if (menu == 1) {
								ScreeningAppService serv = new ScreeningAppService();
							}
						}

						else {
							System.out.println("Allow Entry");
							System.out.println("Press 1 to go back to main menu");
							System.out.println("\n");
							int menu = ob.nextInt();
							if (menu == 1) {
								ScreeningAppService serv = new ScreeningAppService();
							}
						}
					}

				}
			}
		}

		return facultyData;
	}

}
