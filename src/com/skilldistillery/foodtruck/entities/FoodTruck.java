package com.skilldistillery.foodtruck.entities;

import java.util.Scanner;

public class FoodTruck {
	private static int nextTruckId;
	//no more statics
	private String name;
	private int id;
	private String foodType;
	private int rating;
	public Scanner scan;
	
	
	
	
	
	
	
	public FoodTruck() {
		
	}
	

	
	public static int getNextTruckId() {
		return nextTruckId;
	}
	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String setName(Scanner name) {
		return this.name;
	}
	public String getFoodType() {
		return foodType;
	}
	public String setFoodType(Scanner foodType) {
		return this.foodType;
	}
	public int getRating() {
		return rating;
	}
	public int setRating(Scanner rating) {
		return this.rating ;
	}
	
	
	
	
	

	
}
