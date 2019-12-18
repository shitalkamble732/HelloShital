package com.csi.staticConcept;


class Customer1
{
	 int custId;
	 String  custName ;
	 double salary;
	 
/*	 void get(int id, String name, double d)     //without using this keyword
	 {
		 custId=id;
		 custName= name;
		 salary=d;
	 }
	 
	 */
	 
	 void set(int custId, String custName, double salary)   //using this keyword in the method
	 {
		 this.custId=custId;
		 this.custName=custName;
		 this.salary=salary;
	 }
	 
	 
	 
      
	 void display()
	 {
		 System.out.println("Cust Id : "+custId+"\n Cust Name : "+custName+"\n Cust Salary : "+salary);
	 }
}
public class ThisConcept {

	public static void main(String[] args) {
		
		Customer1 cc=new Customer1();
	//	cc.get(1, "Pooja", 250.0);
		Customer1 cc2=new Customer1();
		cc.set(111, "Amit", 45000);
		cc2.set(222, "Pranali", 453.2);
		cc.display();
		cc2.display();
		
		
	}
}
