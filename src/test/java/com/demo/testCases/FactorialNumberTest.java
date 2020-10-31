package com.demo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialNumberTest {
	
   @Test
   public void Test(){
	   FactorialNumber fact = new FactorialNumber();
	   int k = fact.factorial(6);
	   Assert.assertEquals(120, k);
	   Assert.assertEquals(121,k);
   }
   
  
	
   
}
