package com.csi.staticConcept;

class Employee11
{
	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee11 ee=new Employee11();
		ee.setEmpId(12);
		ee.setEmpName("Rohini");
		System.out.println("\n EmpId : "+ee.getEmpId()+"\n Emp Name : "+ee.empName);

	}

}
