package com.csi.staticConcept;

public class GcCollection {

		 public void finalize()
		 {
			 System.out.println("object is garbage collected");
		 } 
		 
		 public static void main(String args[]){  
		  GcCollection s1=new GcCollection();  
		 
		  s1=null;  
		  GcCollection s2=new GcCollection();  
	      s2=null; 
		  s1=s2;  
		  System.gc();  
		 
		 }  
		 
}
