package com.csi.staticConcept;

public class EnumConcept {
/*	public enum Months
	{
		JANUARY, FEBRUARY, MARCH, APRIL,  MAY, JUNE, JULY, 
		AUGUST, SEPTEMBER,  OCTOBER, NOVEMBER, DECEMBER;
	}
	public static void main(String[] args) {
		
		for(Months m: Months.values())
		{
			System.out.println(m);
		}
	} 
	
	*/
	public enum Days
	{
		Sunday, Monday, Tuesday, Wednesday, Thuresday, Friday, Saturday ;
	};
	
	public static void main(String[] args) {
		
		for(Days day: Days.values())
		{
			 System.out.println(day);
			
			if(day.toString().equals("Saturday"))
					{
				System.out.println("4TH day of the week");
					}
					
					
		}
	
	
		
		System.out.println("Value of the Tuesday is : "+Days.valueOf("Tuesday").ordinal());
		
		System.out.println("Value of the Saturday is : "+Days.valueOf("Saturday").ordinal());
	}

}
