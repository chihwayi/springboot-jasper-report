package com.covidapp.screening.services;

import java.util.Scanner;

public class ScreeningAppService{

	public ScreeningAppService() {

		ScreeningHome home = new ScreeningHome();
		Scanner object = new Scanner(System.in);
		System.out.println("Enter Current Time in24hrs Notation (Just digits only and no whitespaces) :");
		int time = object.nextInt();
		
		String msg = home.checkTimer(time);
		if(msg.equalsIgnoreCase("Allow")) {
			Scanner object1 = new Scanner(System.in);

			System.out.println("\nDo you want to Screen or Search the Person?\n");
			System.out.println("Press 1 and click Enter for Screening");
			System.out.println("Press 2 and click Enter for Searching");

			int choice = object1.nextInt();

			if (choice == 1) {
				System.out.println("********************Person Screening Module********************");
				System.out.println("\n");

				PersonService serv = new PersonService();

			} else if (choice == 2) {
				System.out.println("You has pressed 2");
			}

			else {
				System.out.println("Please enter a valid choice, System exiting!!");
				System.exit(0);
			}
			
		}
		else {
			System.out.println("CAMPUS ACCESS AFTER 1200HRS IS NOT ALLOWED");
			System.out.println("System exiting!!");
			System.exit(0);
		}
		
		
	}

}
