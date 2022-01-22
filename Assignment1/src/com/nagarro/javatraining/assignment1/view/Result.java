package com.nagarro.javatraining.assignment1.view;

import com.nagarro.javatraining.assignment1.model.Car;

public class Result {

	public static void displayResult(Car i)
	{
		String str = String.format("%-14s%-14s%-15.2f%-18.2f%-25s%-7.2f", i.getName(),i.getCarType(),i.getPrice(),i.getInsurancePrice(),i.getInsuranceType(),i.getTotalInsurancePrice());
		System.out.println(str);
	}

	public static void displayResultFormat() {
		System.out.println("\n\n\nOutput:");
		String str = String.format("%-14s%-14s%-15s%-18s%-25s%-7s", "Name","Car Type","Price","Insurance cost","Insurance Type","Total Insurance Price");
		System.out.println(str);
	}
}
