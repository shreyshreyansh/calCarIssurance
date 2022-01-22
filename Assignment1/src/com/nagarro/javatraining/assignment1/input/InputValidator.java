package com.nagarro.javatraining.assignment1.input;
import com.nagarro.javatraining.assignment1.model.Constants;
public class InputValidator {

	public static boolean checkDouble(String str) {
		try {
			Double.parseDouble(str) ;
		}
		catch (NumberFormatException e) {
			System.err.print("Enter the Car price again in double format : ");
			return false ;
		}
		return true ;
	}

	public static boolean checkCarType(String str) {
		if (str.equalsIgnoreCase(Constants.HATCHBACK)|str.equalsIgnoreCase(Constants.SEDAN)|str.equalsIgnoreCase(Constants.SUV))
			return true ;
		System.err.print("You entered the car type in wrong format . kindly enter again .\nEnter one of the following (hatchback, sedan, suv) :");
		return false ;
	}

	public static boolean checkCarInsuranceType(String str) {
		if (str.equalsIgnoreCase(Constants.BASIC)|str.equalsIgnoreCase(Constants.PREMIUM))
			return true ;
		System.err.print("You entered the car insurance type in wrong format . kindly enter again .\nEnter one of the following (basic, premium) :");
		return false ;
	}

}
