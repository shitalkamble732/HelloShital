package com.csi.oop;


class ExtendThread extends Thread
{
	public void run()
	{
		int i;
		for(i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("CSI Pune");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class ExtendThreadConcept {
	
	public static void main(String[] args) {
		
		ExtendThread tt=new ExtendThread();
		tt.start();
	}

}
