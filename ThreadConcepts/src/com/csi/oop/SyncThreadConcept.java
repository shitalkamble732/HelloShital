package com.csi.oop;

class Table
{
  synchronized void printable(int n)
   {
	   int i;
	   for(i=1; i<=5; i++)
	   {
		   try {
		Thread.sleep(100);
		System.out.println(i*n);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		   
	   }
   }
}
class MyThread1 extends Thread
{
	Table t;
	
	public MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	
	public MyThread2 (Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(100);
	}
	
}

class MyThread3 extends Thread
{
	Table t;
	public MyThread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(1000);
	}
}
class MyThread4 extends Thread
{
	Table t;
	public MyThread4(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
			t.printable(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class SyncThreadConcept {
	
	public static void main(String[] args) {
		
		Table t1=new Table();
		MyThread1  m1=new MyThread1(t1);
		MyThread2 m2= new MyThread2(t1);
		MyThread3 m3=new MyThread3(t1);
		MyThread4 m4=new MyThread4(t1);
		m1.start();
		m2.start();
		m3.start();
		m4.start();
	}

}
