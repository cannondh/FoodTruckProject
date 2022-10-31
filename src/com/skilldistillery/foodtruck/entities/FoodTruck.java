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
		id = nextTruckId;
		
				
		
		
		nextTruckId++;
		
		
	}
	

	
	public static int getNextTruckId() {
		return nextTruckId;
	}
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFoodType() {
		return foodType;
	}



	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "FoodTruck [name=" + name +  ", foodType=" + this.foodType + ", rating=" + this.rating + "id=" +  this.id + "]";
	}



	public int setRating(String rating) {
		return this.rating ;
	}
	
	
	
	
	

	
}
