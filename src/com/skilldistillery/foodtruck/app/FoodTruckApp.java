package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {       //only class with scanner. none in FoodTruck.
	private FoodTruck[] fleet = new FoodTruck[5];
	private int numTrucks = 0;
	private int setTruckId = 1;
	
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < fta.fleet.length; i++) {
			System.out.println("Please enter name of food truck. (Enter quit to move on) ");
			String nameInput = sc.nextLine();
			
				if (nameInput.equalsIgnoreCase("quit")) {
					break;
				} 
					System.out.println("Please enter type of food. ");
					String foodInput = sc.nextLine();
					
					System.out.println("Please enter rating 1-5. ");
					int ratingInput = sc.nextInt();
					sc.nextLine();				// this line ensures there is a break between end and beginning questions.
					
					FoodTruck createTruck = new FoodTruck(nameInput, foodInput, ratingInput, fta.setTruckId);
					fta.setTruckId++;
					fta.fleet[fta.numTrucks] = createTruck;
					fta.numTrucks++;
					
					
					System.out.println("Food Truck added.");
		}
		
		fta.printMenu();	
		int selection;
	
		do {
			selection = sc.nextInt();
			switch(selection) {
			case 1:
				fta.printList();
				break;
			case 2:
				fta.printAvg();
				break;
			case 3:
				fta.printTop();
				break;
			case 4:
				fta.printQuit();
				break;
			default:
				fta.printInvalid();
				break;
			} 
		} while (selection != 4);			//this loops through unless 4 selected, then quits.

		sc.close();
	}

	public void printMenu() {
		System.out.println("1. List of Food Trucks "
				+ "\n2. Average Rating "
				+ "\n3. Highest Rated "
				+ "\n4. Quit");	
	}
	
	public void printList() {
		for (int i = 0; i < numTrucks; i++) {
			System.out.println(fleet[i]);									// print food truck array
		}
		printMenu();
	}
	
	public void printAvg() {
		int sum = 0;													// define new variable to total ratings together
		for (int i = 0; i < numTrucks; i++) {
			sum += fleet[i].getRating();								// sum += adds each rating in the array and calls each array by fleet[i].getRating()
		}
		double average = (double) sum / numTrucks;  							//print average food truck rating
		System.out.printf("Average Rating: %.1f", average);  // I utilized printf and the specifier '%.1f' so my result would only print to one decimal place. Originally it would print an average with many decimals such as '2.3333333333333335'
		System.out.println();
		printMenu();
	}
	
	public void printTop() {
		FoodTruck topRated = fleet[0];                                           //print top rated truck
		for (int i = 0; i < numTrucks; i++) {
			if(topRated.getRating() < fleet[i].getRating()) {
				topRated = fleet[i];
			}
		}
		System.out.println("<<< Top Rated Truck >>>");
		System.out.println(topRated.toString());
		printMenu();
	}
	
	public void printQuit() {
		System.out.println("Thanks for using the Food Truck App!");		
	}
	
	public void printInvalid() {
		System.out.println("Invalid selection. Please enter 1-4.");
		printMenu();		
	}
}



