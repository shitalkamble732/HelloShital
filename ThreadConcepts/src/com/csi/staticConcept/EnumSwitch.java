package com.csi.staticConcept;

import java.util.Scanner;

public class EnumSwitch {
	
	enum DaysOfWeek
	{
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
	}
	
	public static void main(String[] args) {
		
		//DaysOfWeek day;
	    DaysOfWeek day=DaysOfWeek.Wednesday;
		
		switch(day)
		{
			case Sunday:  System.out.println("Sunday..");
			break;
			case Monday:  System.out.println("Monday..");
			break;
			case Tuesday:  System.out.println("Tuesday..");
			break;
			case Wednesday:  System.out.println("Wednesday..");
			break;
			case Thursday:  System.out.println("Thursday..");
			break;
			case Friday:  System.out.println("Friday..");
			break;
			case Saturday:  System.out.println("Saturday..");
			break;
			default: System.out.println("Invalid Choice/....");
			
			
		}
	}

}
