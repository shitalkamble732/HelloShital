package com.csi.oop;

public class JoinThreadEx extends Thread 
 {    
	    public void run()  
	    {    
	        for(int i=1; i<=5; i++)  
	        {    
	            try  
	            {    
	                Thread.sleep(500);    
	            }catch(Exception e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating three threads  
	    	JoinThreadEx t1 = new JoinThreadEx();    
	    	JoinThreadEx t2 = new JoinThreadEx();    
	    	JoinThreadEx t3 = new JoinThreadEx();    
	        // thread t1 starts  
	        t3.start();  
	        // starts second thread when first thread t1 is died.  
	        try  
	        {    
	            t1.join(1500);    
	        }catch(Exception e){System.out.println(e);}    
	        // start t2 and t3 thread   
	        t2.start();   
	        t1.start();    
	    }    
	} 


