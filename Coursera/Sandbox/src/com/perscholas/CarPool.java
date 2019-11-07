package com.perscholas;

// This program gives car pool information based upon the number of cars, drivers, passengers, etc.

import java.util.Scanner;

public class CarPool {

	public static void main(String[] args) 
	{
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// Define all variables
		int cars = 100;
		int drivers = 30;
		int passengers = 90;
		int cars_not_driven = cars - drivers;
		int cars_driven = drivers;
		
		double space_in_a_car = 4.0;
		double carpool_capacity = cars_driven * space_in_a_car;
		double average_passengers_per_car = (passengers / cars_driven);
		double average_miles_driven = 29.2;
		double average_miles_per_gallon = 23.6;
		double gas_cost_per_gallon = 2.517;
		double gas_cost_per_trip = ((average_miles_driven * gas_cost_per_gallon) / average_miles_per_gallon);
		double money_saved = ((gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven));
		
		// print out results
		System.out.println("\nThere are " + cars + " cars available." +
		"\nThere are only " + drivers + " drivers available." +
		"\nThat means their will be " + cars_not_driven + " empty cars today!" +
		"\nWe can transport " + carpool_capacity + " people today." +
		"\nOut of that, we're transporting " + passengers + " today." +
		"\nSo we'll need to put about " + average_passengers_per_car + " passengers" + " in each car." +
		"\nLong story short, today, we'll be saving about " + "$" + money_saved + "!");
	}

}
