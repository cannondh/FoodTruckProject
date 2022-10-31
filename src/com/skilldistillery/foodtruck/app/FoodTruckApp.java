package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

//import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		FoodTruck foodTruck1 = new FoodTruck();

		FoodTruck foodTruck2 = new FoodTruck();

		FoodTruck foodTruck3 = new FoodTruck();

		FoodTruck foodTruck4 = new FoodTruck();

		FoodTruck foodTruck5 = new FoodTruck();

		String[] foodTruckNames = new String[5];

		String[] foodTruckTypes = new String[5];

		int[] foodTruckRatings = new int[5];

		foodTruckNames[0] = foodTruck1.setName(scanner);

		foodTruckNames[1] = foodTruck2.setName(scanner);

		foodTruckNames[2] = foodTruck3.setName(scanner);

		foodTruckNames[3] = foodTruck4.setName(scanner);

		foodTruckNames[4] = foodTruck5.setName(scanner);

		foodTruckTypes[0] = foodTruck1.setFoodType(scanner);

		foodTruckTypes[1] = foodTruck2.setFoodType(scanner);

		foodTruckTypes[2] = foodTruck3.setFoodType(scanner);

		foodTruckTypes[3] = foodTruck4.setFoodType(scanner);

		foodTruckTypes[4] = foodTruck5.setFoodType(scanner);

		foodTruckRatings[0] = foodTruck1.setRating(scanner);

		foodTruckRatings[1] = foodTruck1.setRating(scanner);

		foodTruckRatings[2] = foodTruck1.setRating(scanner);

		foodTruckRatings[3] = foodTruck1.setRating(scanner);

		foodTruckRatings[4] = foodTruck1.setRating(scanner);

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
				for (int index = 0; index < foodTruckNames.length; index++) {
					System.out.print(foodTruckNames[index] + "  ");
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
						max = foodTruckRatings[index];
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
