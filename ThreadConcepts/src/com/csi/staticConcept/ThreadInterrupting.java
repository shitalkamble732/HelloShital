package com.csi.staticConcept;

public class ThreadInterrupting extends Thread {

			public void run(){  
			try{  
			Thread.sleep(1000);  
			System.out.println("task");  
			}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
			}  
			  
			}  
			  

			public static void main(String args[]){  
			ThreadInterrupting t1=new ThreadInterrupting();  
			t1.start();  
			try{  
			t1.interrupt();  
			}catch(Exception e)
			{
				System.out.println("Exception handled "+e);
			}  
			  
			}  
			
	

}
