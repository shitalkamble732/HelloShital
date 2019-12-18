package com.csi.oop;


class Chat
{
	Boolean flag=false;
	synchronized public void question(String msg) 
	{
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=true;
		notify();
	}
	synchronized public void answer(String msg)
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag= false;
		notify();
	}
}
class T1 implements Runnable
{

	Chat m;
	String[] s1={"Hi...", "How are you ?..", "I'm also doing fine.","Great..........."};
	
	
	public T1(Chat m1)
	{
		//super();
		this.m =m1;
		new Thread(this, "Question").start();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for( i=0; i<s1.length; i++)
		{
			m.question(s1[i]);
		}
		
	}
	
}
class  T2 implements Runnable
{
     Chat m;
     String[] s2={"Hi....","I'm  Fine..", "but what about you..."};
	
     public T2(Chat m2)
	{
		this.m=m2;
		new Thread(this, "Answer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<s2.length; i++)
		{
			m.answer(s2[i]);
		}
		
	}
	
}
public class ITCThread {
	
	public static void main(String[] args) {
		
		Chat m=new Chat();
		new T1(m);
		new T2(m);
		
	}

}
