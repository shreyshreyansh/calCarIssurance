package com.nagarro.javatraining.assignment1.controller;

import com.nagarro.javatraining.assignment1.input.InputAcceptor;
import com.nagarro.javatraining.assignment1.model.Car;
import com.nagarro.javatraining.assignment1.view.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class utility {

	public static void main(String[] args) throws IOException {
		ArrayList<Car> list = new ArrayList<>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
		char ch ;
		Car i ;
		double effectivePriceOfAllInsurance= 0.0 ;
		double totalPrice ;
		do
		{
			i = InputAcceptor.enterInput() ;
			i.calc_stl() ;
			totalPrice = i.getInsurancePrice();
			i.setTotalInsurancePrice(totalPrice);
			effectivePriceOfAllInsurance+=i.getTotalInsurancePrice() ;
			list.add(i);
			System.out.print("Do you want to enter details of any other car (y/n): ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));
		
		Result.displayResultFormat();
		for (Car car : list) {
			Result.displayResult(car);
		}
		String str = String.format("\n%93.2f",effectivePriceOfAllInsurance );
		System.out.println(str);
	}
	
}
