package com.csi.staticConcept;

public class StaticConcepts {
	
	 static String studname ="JERRY";
	 int rollno=15;	
	
	public static void main(String[] args) {
		
		StaticConcepts sc=new StaticConcepts();
		System.out.println("Wow.?/..");
		sc.get();
		net();
		sc.set();
	}

	void get()
	{
		System.out.println("Hey...");
		System.out.println("Student Name : "+studname);
	}
	static void net()
	{
		System.out.println("Pune");
	//	System.out.println("Roll No : "+roll);
	}
	static
	{
		System.out.println("it is a static block..");
	}
	void set()
	{
		System.out.println("Roll No : "+rollno);
	}

}


