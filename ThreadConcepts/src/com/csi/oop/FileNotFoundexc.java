package com.csi.oop;

import java.io.*;

public class FileNotFoundexc {

	    public static void main(String[] args) {  
	           
	        PrintWriter pw;  
	        try {  
	            pw = new PrintWriter("jtp.txt"); //may throw exception   
	            pw.println("saved");  
	        }  
	// providing the checked exception handler  
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	    System.out.println("File saved successfully");  
	    }  
	}  


