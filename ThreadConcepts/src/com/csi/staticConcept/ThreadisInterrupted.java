package com.csi.staticConcept;

public class ThreadisInterrupted extends Thread{
  
		public void run(){  
		for(int i=1;i<=2;i++){  
		if(Thread.interrupted()){  
		System.out.println("code for interrupted thread");  
		}  
		else{  
		System.out.println("code for normal thread");  
		}  
		  
		}//end of for loop  
		}  
		  
		public static void main(String args[]){  
		  
		ThreadisInterrupted t1=new ThreadisInterrupted();  
		ThreadisInterrupted t2=new ThreadisInterrupted();  
		t1.start(); 
		t1.interrupt();   
		t2.start(); 
		  
		}  
 
}
