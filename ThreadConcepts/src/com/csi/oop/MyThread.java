package com.csi.oop;

 class dontOverrideRun  extends Thread{
	
		  //don't override run() method
	

		}

		public class MyThread {

		 public static void main(String[] args) {

		 System.out.println("main has started.");

		 dontOverrideRun thread1=new dontOverrideRun();

		 thread1.start();

		 System.out.println("main has ended.");

		 }

		

}
