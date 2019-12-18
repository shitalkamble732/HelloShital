package com.csi.staticConcept;

public class Student15 implements Cloneable {
	int rollno;
	String Studname;
	
	public Student15(int rno, String n) {
		// TODO Auto-generated constructor stub
		this.rollno=rno;
		this.Studname=n;
	}
	void display()
	{
		System.out.println("\n Roll No : "+rollno+"\n Name : "+Studname);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student15 s1=new Student15(18, "Pooja");
		Student15 s2=(Student15)s1.clone();
		s1.display();
		s2.display();

	}

}
