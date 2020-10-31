package com.demo.testCases;

public class FactorialNumber {
	
	public int factorial(int j) {
		
		 
		int i, fact = 1;
		int number = 5;
		
		//fact = factorial(number);
	
		for(i=1;i<=j;i++){
			
			fact = fact*i;
		}
		
		System.out.println("Factorial Number is :"+ fact);
		return fact;
	}

}
