package com.nagarro.javatraining.assignment1.model;

public abstract class Car {
	protected String name ;
	protected double price ;
	protected String insuranceType;
	protected String carType;
	protected double insurancePrice;
	protected double totalInsurancePrice;
	
	public Car(String name, String carType, Double price, String insuranceType) {
		this.name = name ;
		this.carType = carType;
		this.price = price ;
		this.insuranceType = insuranceType ;
	}
    public abstract void calc_stl() ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getInsurancePrice() {
		return insurancePrice;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public String getCarType() {
		return carType;
	}
	public double getTotalInsurancePrice() {
		return totalInsurancePrice;
	}
	public void setTotalInsurancePrice(double totalInsurancePrice) {
		this.totalInsurancePrice = totalInsurancePrice;
	}
	
	
	
}
