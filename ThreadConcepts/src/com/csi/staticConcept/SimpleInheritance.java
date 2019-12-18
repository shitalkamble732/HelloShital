package com.csi.staticConcept;

class Customer12
{
	int custId;
	String CustName;
	
	void get(int Id, String name)
	{
		custId=Id;
		CustName=name;
	}
	void display()
	{
		System.out.println("\n Customer Id : "+custId+"\n Customer Name : "+CustName);
	}
}
class Company extends Customer12
{
	String CompName;
	int CompId;
	
	void get1(int cid, String cmpName)
	{
		CompId = cid;
		CompName = cmpName;
	}
	void display2()
	{
		System.out.println("\n CompanyId : "+CompId+"\n Company Name : "+CompName);
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		
		Company c=new Company();
	/*	c.get(1, "pp");
		c.get1(23, "TCS");
		c.display();
		c.display2(); 
		
		*/
		Company cc=(Company) new Customer12();
		cc.get(1, "pp");
		cc.get1(23, "TCS");
		cc.display();
		cc.display2(); 
	}
}
