package com.nagarro.javatraining.assignment1.input;

import com.nagarro.javatraining.assignment1.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAcceptor  {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	public static Car enterInput() throws IOException
	{

		String model ;
		String str ;
		String carType ;
		String insuranceType;
		Double price;
		boolean valid;
		

		System.out.println("\nEnter the Car Insurance Details :");
		System.out.print("Enter the Car model : ");
		model = br.readLine();

		System.out.print("Enter the Car price : ");
		do{
			str = br.readLine();
			valid  = InputValidator.checkDouble(str);
		} while(!valid) ;
		price =  Double.parseDouble(str) ;

		System.out.print("Enter the Car type : ");
		do{
			str = br.readLine();
			valid  = InputValidator.checkCarType(str);
		}while(!valid) ;
		carType = str.toLowerCase() ;

		System.out.print("Enter the Car insurance type : ");
		do{
			str = br.readLine();
			valid  = InputValidator.checkCarInsuranceType(str);
		}while(!valid) ;
		insuranceType = str.toLowerCase() ;
		
		Car i ;
		if (Constants.PREMIUM.equalsIgnoreCase(insuranceType)) {
			i = new Premium(model, carType, price, insuranceType);
		} else {
			i = new Basic(model, carType, price, insuranceType);
		}
		return i ;

	}

}
