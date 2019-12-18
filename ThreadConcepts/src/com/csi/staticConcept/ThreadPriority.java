package com.csi.staticConcept;
class MyThread11 extends Thread
{
	int i=1;
	public void run()
	{
		for(i=1; i<=5; i++)
		{
			System.out.println(" i = "+i);
		}
	}
}
class MyThread12 extends Thread
{
	int j;
	public void run()
	{
		for(j=1; j<=5; j++)
		{
			System.out.println("J = "+j);
		}
	}
}
public class ThreadPriority {
	
public static void main(String[] args) {
	
	MyThread11 m1=new MyThread11();
	m1.setName("ABCD");
	System.out.println("ThreadName of m1 : "+m1+"\n priority of m1 : "+m1.currentThread().getPriority());
	System.out.println( "M1 ThreadName : "+m1.currentThread().getId());
	
	System.out.println("Current thread alive or not : "+Thread.currentThread().isAlive());
	System.out.println("Current thread name : "+Thread.currentThread().getName()+"current thread id : "+Thread.currentThread().getId());
	System.out.println("Current thread hash code : "+Thread.currentThread().hashCode());
	
	MyThread12 m2=new MyThread12();
	System.out.println("M2 threadname : "+m2.currentThread().getName()+"\n M2 ThreadState : "+m2.currentThread().getState());
	m1.start();
	m2.start();
}
}
