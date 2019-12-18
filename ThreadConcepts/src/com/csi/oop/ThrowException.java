package com.csi.oop;

public class ThrowException {
	
       static void isValidForVote(int age)
       {
    	   if(age<18)
    	   {
    		   throw new ArithmeticException("Not Eligible for vote....");
    	   }
    	   else
    	   {
    		   System.out.println("eligible for vote.......");
    	   }
       }
	
	public static void main(String[] args) {
		
		int age=19;
		
		isValidForVote(2);
		
		//System.out.println("Rest of the code will be executed after the custom exception..");
		
	}
}
