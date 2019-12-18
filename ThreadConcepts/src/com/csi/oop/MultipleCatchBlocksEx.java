package com.csi.oop;

public class MultipleCatchBlocksEx {
	
	public static void main(String[] args) {  
        
        try{    
       //      int a[]={0,10,20,30,40,50}; 
       //    int b=a[6]/0;  
        	String s=null;
        	System.out.println(s.length());
            }  
       
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
                e.printStackTrace();
               }  
        catch (NullPointerException e) {
			// TODO: handle exception
        	System.out.println("Null Pointer exception occurs");
        	e.printStackTrace();
		}
       catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }  
        
                   
            //System.out.println("rest of the code will be executed  .....");    
 }  
}  



