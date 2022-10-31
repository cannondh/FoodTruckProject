package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

//import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		FoodTruck[] parked = new FoodTruck[5];

		parked[0] = new FoodTruck();

		parked[1] = new FoodTruck();

		parked[2] = new FoodTruck();

		parked[3] = new FoodTruck();

		parked[4] = new FoodTruck();

		String[] foodTruckNames = new String[5];

		String[] foodTruckTypes = new String[5];

		int[] foodTruckRatings = new int[5];
		
		
		
		

		for (int index = 0; index < parked.length; index++) {

			System.out.println("What is the name of the food truck?");
		//	foodTruckNames[index]= scanner.nextLine();

			String input = foodTruckNames[index] = scanner.nextLine();
			
			if (input.equals("quit")) {
				break;
			}

			System.out.println("What is the food type the truck sells?");
			foodTruckTypes[index] = scanner.nextLine();

			System.out.println("What would you rate the food?");
			foodTruckRatings[index] = scanner.nextInt();
			
			scanner.nextLine();

		}

		for (int index = 0; index < foodTruckNames.length; index++) {
			parked[index].setName(foodTruckNames[index]);

			parked[index].setFoodType(foodTruckTypes[index]);

			parked[index].setRating(foodTruckRatings[index]);

		}

		boolean menu = false;

		int sum = 0;

		int length = foodTruckRatings.length;

		int max = 0;

		do {

			System.out.println("-------MENU-------");
			System.out.println("1. See the list of food trucks. ");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Which food truck is the highest rated?");
			System.out.println("4. Quit.");
			String select = scanner.next();

			switch (select) {
			case "1":
				// for (int index = 0; index < foodTruckNames.length; index++) {
				// System.out.print(foodTruckNames[index] + " " + foodTruckFoods[index] + " " +
				// );
				// }
				for (int index = 0; index < parked.length; index++) {
					if(parked[index].getName() == null) {
						continue;
					} if (parked[index].getFoodType()== null) {
						continue;
					}
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
				for (int index = 0; index < parked.length; index++) {
					max = parked[0].getRating();
					if (parked[index].getRating() > max) {
						max = parked[index].getRating();
					}

				}
				for (int i = 0; i < parked.length; i++) {
					if (max == parked[i].getRating()) {
						System.out.println(parked[i].getRating() + " " + parked[i].getName() + " " + parked[i].getFoodType());
					}
					
				}
				
				break;
			case "4": case "quit": case "Quit":
				System.out.println("Goodbye!");
				menu = true;

			}
		} while (!menu);
		scanner.close();

	}

} 
