package com.csi.oop;
class Customer25
{
	int amount=3000;
	synchronized public void withdraw(int amount)
	{
		System.out.println("Going to withdraw Money...");
		if(this.amount<=amount)
		{
			System.out.println("Insufficient Balance. please to deposit the money in your account..");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount -=amount;
		System.out.println("Money withdraw Successfully...");
		}
	
	synchronized public void  deposit(int amount)
	{
		System.out.println("Going to deposit the money..");
		
		this.amount +=amount;
		System.out.println("Deposited amount Successfully........");
		notify();
	}
}
public class ITCThread2 {
	
	public static void main(String[] args) {
		
		Customer25 cc=new Customer25();
		new Thread()
		{
			public void run()
			{
				cc.withdraw(25000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				cc.deposit(15000);
			}
		}.start();
	}

}
