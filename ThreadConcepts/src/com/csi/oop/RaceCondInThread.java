package com.csi.oop;

 class RaceCondition implements Runnable 
{
int ticketsAvailable=1;

public void run(){
       
       System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
       if(ticketsAvailable>0){
              System.out.println("Booking ticket for : "+Thread.currentThread().getName());
              
              //Let's say system takes some time in booking ticket (here we have taken 1 second time)
              try{
                    Thread.sleep(1000); 
              }catch(Exception e){}
              ticketsAvailable --;
              System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName());
              System.out.println("currently ticketsAvailable = "+ticketsAvailable);
       }
       
       else{
              System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
       }
       
       
}

}

public class RaceCondInThread {
public static void main(String args[])
{
	RaceCondition obj1=new RaceCondition();
       
       Thread thread1=new Thread(obj1, "Passenger1 Thread");
       Thread thread2=new Thread(obj1, "Passenger2 Thread");
       
       thread1.start();
       thread2.start();
       
}



}
