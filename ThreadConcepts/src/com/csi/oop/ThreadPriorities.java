package com.csi.oop;

class Thread12 extends Thread
{
	public void run()
	{
	for(int i=0; i<=5; i++)
	{
		System.out.println("I : "+i);
	}
}
}
class Thread13 extends Thread
{
	public void run()
	{
	for(int j=0; j<=5; j++)
	{
		System.out.println("J : "+j);
	}
}
}
public class ThreadPriorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread12 tt=new Thread12();
		tt.start();
		tt.setPriority(10);
		System.out.println("Thread tt : "+tt.getId()+"thread name of tt : "+tt.getName());
		System.out.println("Thread Priority : "+tt.currentThread().getPriority());

		Thread13 tt1=new Thread13();
		tt1.start();
		System.out.println(tt1.getState());
		System.out.println("Thread tt1 : "+tt1.getId()+"thread name of tt1 : "+tt1.getName());

		System.out.println("Thread Priority : "+tt1.currentThread().getPriority());

	}


}
