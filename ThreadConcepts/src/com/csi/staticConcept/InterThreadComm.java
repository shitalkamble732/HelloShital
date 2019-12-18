package com.csi.staticConcept;

class Customer
{
	int amount=10000;
	synchronized public void withdraw(int amt)
	{
		System.out.println("Going to withdraw money."+"\n proceed....");
		if(this.amount<=amt)
		{
			System.out.println("Insufficient Balance in your account, please to deposit the money... ");
		}
		try
		{
			wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		this.amount -=amount;
		System.out.println("Money withdraw successfully...");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit the money..");
		this.amount +=amount;
		System.out.println("Amount Deposited Successfully...");
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
			cc.withdraw(2000000);
		}
	}.start();
	new Thread()
	{
		public void run()
		{
			cc.deposit(5000);
		}
	}.start();
		
	}
}

