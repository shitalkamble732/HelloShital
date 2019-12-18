package com.csi.oop;

class Customer
{
	int amount=10000;
	synchronized public void withdraw(int amount)
	{
		System.out.println("Going to withdraw Money....");
		if(this.amount<=amount)
		{
			System.out.println("Insufficient balance,please wait to deposit money...");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	this.amount -=amount;
	System.out.println("Money withdraw Successfully...");
	}
	synchronized public void deposit(int amount)
	{
		System.out.println("Going to deposit money...");
		this.amount +=amount;
		System.out.println("Amount Deposited successfully");
		notify();
	}
}
public class InterThreadComm {
	
	public static void main(String[] args) {
		
		Customer cc=new Customer();
		new Thread()
		{
			public void run() 
			{
			   cc.withdraw(15000);	
			}
		}.start();
		
		new Thread()
		{
			public void run() {
				cc.deposit(10000);
				
			}
		}.start();
	}

}
