package com.covidapp.screening.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.covidapp.screening.entities.Person;

public class PersonService {
	
	public PersonService() {
		getPersonData();
	}

	public List<Person> getPersonData(){
		List<Person> personData = new ArrayList<>();
		
		Scanner object = new Scanner(System.in);
		System.out.println("**************Personal Details**************");
		System.out.println("\n");

		System.out.println("Enter First Name  :");
		String fname = object.nextLine();

		if (!fname.isBlank()) {
			System.out.println("Enter Last Name   :");
			String sname = object.nextLine();

			if (!sname.isBlank()) {
				System.out.println("Gender            :");
				String gender = object.nextLine();

				if (!gender.isBlank()) {
					System.out.println("Age               :");
					int age = object.nextInt();

					if (age > 0) {
						Person pers = new Person();
						pers.setAge(age);
						pers.setFname(fname);
						pers.setSname(sname);
						pers.setGender(gender);

						personData.add(pers);

						BaselineService base = new BaselineService();

					}
				}

			}

		} else {
			ScreeningAppService service = new ScreeningAppService();
		}
		
		return personData;
	}


}
