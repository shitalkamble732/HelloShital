package com.csi.staticConcept;

interface Depart
{
	void get(int deptId, String deptName);
	
	default void show()
	{
		System.out.println("I'm from default method in interface.");
	}
	static void put()
	{
		System.out.println("I'm from Static method..");
	}
}

interface Employee10
{
	void set(int empId, String empName);
}

abstract class Company10
{
	void show1()
	{
		System.out.println("I'm from show method of abstract class");
	}
	
	public Company10() {
		// TODO Auto-generated constructor stub
		
		System.out.println("it's an abstract class constructor......");
	}
	abstract void display(int prodId);
}
class Product extends Company10 implements Depart, Employee10
{

	@Override
	public void set(int empId, String empName) {
		
		System.out.println("\n Employee Id : "+empId+"\n Employee Name : "+empName);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Dept Id : "+deptId+"\n Dept Name : "+deptName);
	}

	@Override
	void display(int prodId) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Product Id : "+prodId);
	}
	
}
public class AbstractInterfaceConcept {
	
	public static void main(String[] args) {

		Product pp=new Product();
		pp.get(121, "HR");
		pp.set(12, "Rohini");
		pp.show();
		pp.show1();
		pp.display(678);
		
		
	
	}
}
