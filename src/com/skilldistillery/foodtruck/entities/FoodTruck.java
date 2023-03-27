package com.skilldistillery.foodtruck.entities;

//	Test conditions:
//	There are no static methods other than the one main method.
//	When a FoodTruck is created, its constructor assigns its id field the current value of a static field (such as (nextTruckId) and then increments the static field.
//	The user can input up to five food trucks.
//	The user can stop inputing trucks before entering five by entering quit as the truck name, after which all input stops and the program continues.
//	When a menu item is chosen the list of all trucks entered is displayed. If less than five were input, only those trucks that were created are displayed.
//	When another menu item is chosen the average rating based on the number of trucks entered is displayed.
//	When another menu item is chosen the winning truck - the one that was input with the highest rating - is displayed with all its properties.
//	Food trucks are displayed by printing its toString, which includes all FoodTruck fields.
//	When the quit menu item is chosen, the program ends with a message.

public class FoodTruck {
	private String name;
	private int truckId;
	private String foodType;
	private int rating;
	
	public FoodTruck(String nm, String type, int rtg, int id) {
		name = nm;
		foodType = type;
		rating = rtg;
		truckId = id;	// this is not user input but should be automatically assigned 0,1,2,3,4
	}

	public String toString() {
		return "Name: " + name + " TruckID: " + truckId + " Cuisine: " + foodType + " Rating: " + rating;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTruckId() {				// No setTruckId() method because we are not accepting user input for truck id.
		return truckId;
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
}

	
	
	
	
	
	
	
	
	
	
