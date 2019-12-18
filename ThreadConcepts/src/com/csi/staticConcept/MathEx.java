package com.csi.staticConcept;

public class MathEx {
   
		    public static void main(String[] args)     
		    {    
		        double x = 28.4;    
		        double y = 4.5;    
		          
		        System.out.println("Floor Value of x is : "+Math.floor(x));
		        System.out.println("Ceil value of x is  : "+Math.ceil(x));
		        System.out.println("abs value of x is : "+Math.abs(x));
		        System.out.println("sin value of x is : "+Math.sin(x));
		        System.out.println("round value of x is : "+Math.round(x));
		        // return the maximum of two numbers  
		        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
		          
		        // return the square root of y   
		        System.out.println("Square root of y is: " + Math.sqrt(y));   
		          
		        //returns 28 power of 4 i.e. 28*28*28*28    
		        System.out.println("Power of x and y is: " + Math.pow(x, y));      
		  
		        // return the logarithm of given value       
		        System.out.println("Logarithm of x is: " + Math.log(x));   
		        System.out.println("Logarithm of y is: " + Math.log(y));  
		          
		        // return the logarithm of given value when base is 10      
		        System.out.println("log10 of x is: " + Math.log10(x));   
		        System.out.println("log10 of y is: " + Math.log10(y));    
		          
		        // return the log of x + 1  
		        System.out.println("log1p of x is: " +Math.log1p(x));    
		  
		        // return a power of 2    
		        System.out.println("exp of a is: " +Math.exp(x));    
		          
		        // return (a power of 2)-1  
		        System.out.println("expm1 of a is: " +Math.expm1(x));  
		    }    
		   
}
