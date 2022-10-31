package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

//import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		FoodTruck [] parked = new FoodTruck[5];
		

		parked[0]  = new FoodTruck();

		parked[1] = new FoodTruck();

		parked [2] = new FoodTruck();

		parked [3] = new FoodTruck();

		parked [4] = new FoodTruck();

		String[] foodTruckNames = new String[5];

		String[] foodTruckTypes = new String[5];

		int[] foodTruckRatings = new int[5];

		foodTruckNames[0] = parked[0].setName(scanner);

		foodTruckNames[1] = parked[1].setName(scanner);

		foodTruckNames[2] = parked[2].setName(scanner);

		foodTruckNames[3] = parked[3].setName(scanner);

		foodTruckNames[4] = parked[4].setName(scanner);

		foodTruckTypes[0] = parked[0].setFoodType(scanner);

		foodTruckTypes[1] = parked[1].setFoodType(scanner);

		foodTruckTypes[2] = parked[2].setFoodType(scanner);

		foodTruckTypes[3] = parked[3].setFoodType(scanner);

		foodTruckTypes[4] = parked[4].setFoodType(scanner);

		foodTruckRatings[0] = parked[0].setRating(scanner);

		foodTruckRatings[1] = parked[1].setRating(scanner);

		foodTruckRatings[2] = parked[2].setRating(scanner);

		foodTruckRatings[3] = parked[3].setRating(scanner);

		foodTruckRatings[4] = parked[4].setRating(scanner);

		boolean menu = false;

		int sum = 0;

		int length = foodTruckRatings.length;

		int max = 0;

		for (int index = 0; index < foodTruckRatings.length; index++) {
			
			if (scanner.equals("quit")) {
				continue;
			}

			System.out.println("What is the name of the food truck?");

			foodTruckNames[index] = scanner.next();

			System.out.println("What is the food type the truck sells?");
			foodTruckTypes[index] = scanner.next();

			System.out.println("What would you rate the food?");
			foodTruckRatings[index] = scanner.nextInt();

		}

		do {

			System.out.println("-------MENU-------");
			System.out.println("1. See the list of food trucks. ");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Which food truck is the highest rated?");
			System.out.println("4. Quit.");
			String select = scanner.next();

			switch (select) {
			case "1":
				//for (int index = 0; index < foodTruckNames.length; index++) {
				//	System.out.print(foodTruckNames[index] + "  " + foodTruckFoods[index] + " " + );
				//}
				for (int index = 0; index <parked.length; index++ ) {
					System.out.println(parked[index].toString());
					
					
				}
				
				break;

			case "2":
				for (int index = 0; index < foodTruckRatings.length; index++) {
					sum += foodTruckRatings[index];
				}
				double average = sum / length;

				System.out.println("The average rating is: " + average);
				break;
			case "3":
				for (int index = 0; index < foodTruckRatings.length; index++) {
					max = foodTruckRatings[0];
					if (foodTruckRatings[index] > max) {
						max  = foodTruckRatings[index];
					}

				}
				System.out.println("The highest rating is: " + max);
				break;
			case "4":
				System.out.println("Goodbye!");
				menu = true;

			}
		} while (!menu);

	}

}
