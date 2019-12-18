package com.csi.oop;

public class TestMyException {
	
	static  void isValidAge(int age) throws  InvalidAgeException12
	{
		//int age;
		if(age<18)
		{
			throw new InvalidAgeException12("Not valid for vote........");
		}
		else
		{
			System.out.println("Eligible for vote...");
		}
	}
	public static void main(String[] args) {
		
		try {
			isValidAge(18);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("rest of program will be executed..");
	}

}
