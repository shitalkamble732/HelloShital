package com.csi.staticConcept;


class Student12
{
	int rollno;
	String name;
	float fee;
	
	public Student12(int rno, String n) {
		// TODO Auto-generated constructor stub
		this.rollno=rno;
		this.name=n;
	}
	public Student12(int rno, String n, float f) {
		// TODO Auto-generated constructor stub
		this(rno, n);
		this.fee=f;
		
	}
	void display()
	{
		System.out.println("Roll No : "+rollno+"\n Name : "+name+"\n Fee : "+fee);
	}
}

public class ThisConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student12 s=new Student12(11, "Amith", 45000);
		s.display();

	}

}
