package com.csi.staticConcept;

public class ClassLevelLock implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Lock();
		
	}

	 void Lock() {
		// TODO Auto-generated method stub
		 System.out.println(Thread.currentThread().getName());
		 synchronized (ClassLevelLock.class)
		 {
			System.out.println("In Block "+Thread.currentThread().getName());
			System.out.println("In Block "+Thread.currentThread().getName()+" at end. ");
		}
		 
		
	}
	public static void main(String[] args) {
		
		ClassLevelLock c1= new ClassLevelLock();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c1);
		
		ClassLevelLock c2=new ClassLevelLock();
		Thread t3=new Thread(c2);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
