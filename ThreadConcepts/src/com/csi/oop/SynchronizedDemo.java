package com.csi.oop;

class Display
{
	public void  displaynum()
	{int i;
	    for(i=1; i<=10; i++)
	    {
		System.out.println("i : "+i);
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	    }
	}
	public void displayChar()
	{
		int i;
		for(i=65; i<=80; i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}

class MyThreads1 extends Thread
{
	Display d;

	public MyThreads1(Display d) {
		//super();
		this.d = d;
	}
	public void run()
	{
		d.displaynum();
	}
	
	
}
class MyThreads2 extends Thread
{
	Display d;
	public MyThreads2(Display d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayChar();
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d=new Display();
		MyThreads1 t1=new MyThreads1(d);
		MyThreads2 t2= new MyThreads2(d);
		t1.start();
		t2.start();
		
	}
}
