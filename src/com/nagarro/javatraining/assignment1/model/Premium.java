package com.nagarro.javatraining.assignment1.model;

public class Premium extends Car {

	public Premium(String name, String carType, Double price, String insuranceType) {
		super(name, carType, price, insuranceType);
	}
	public void calc_stl() 
	{
		switch (carType.toLowerCase()){
			case "hatchback":
				insurancePrice += Constants.HATCHBACK_INTEREST_RATE * price;
				break;
			case "sedan":
				insurancePrice += Constants.SEDAN_INTEREST_RATE * price;
				break;
			case "suv":
				insurancePrice += Constants.SUV_INTEREST_RATE * price;
				break;
		}
		insurancePrice += Constants.PREMIUM_ADDITIONAL_INTEREST_RATE * insurancePrice;
	}

}
