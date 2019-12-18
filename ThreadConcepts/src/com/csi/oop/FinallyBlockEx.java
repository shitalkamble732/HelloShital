package com.csi.oop;

public class FinallyBlockEx {
	  public static void main(String args[]){  
		  try{  
		   int data=25/0;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){
			 e.printStackTrace();
			 }  
		 // finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  

}
