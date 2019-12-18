package com.csi.staticConcept;

class Student1
{
	int rollNo;
	static String collegeName;
	String name;
	
	static void change()
	{
		collegeName="MSBECL";
	}
	public Student1(int r, String n) {
		// TODO Auto-generated constructor stub
		rollNo=r;
		name=n;
	}
	void display()
	{
		System.out.println("\n RollNo : "+rollNo+"\n Name : "+name+"\n College Name : "+collegeName);
	}
}


/*
class CubeCalculation

{
	static void calculate(int x )
	{
		int z=(x*x*x);
		System.out.println("Cube of "+x+" is  "+z);
	}
}

*/
public class StaticMethod {
	public static void main(String[] args) {
	
		 Student1 s=new Student1(12, "Pooja");
		s.change();
		s.display();
		
		Student1 s2=new Student1(11,"Snehal");
	    s2.display();
		
		Student1 s3=new Student1(13,"Rohini");
		s3.display();
		
	
	}


	
	// to calculate the cube of 5
	
	/*	CubeCalculation c=new CubeCalculation();
	    c.calculate(5);
	    
	    */
}

