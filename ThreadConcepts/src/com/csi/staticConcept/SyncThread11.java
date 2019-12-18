package com.csi.staticConcept;

class SyncThread11 extends Thread
{
	int n=5;
	synchronized void printTable(int i)
	{
		for(i=1; i<=5; i++)
		{
			System.out.println("i : "+i*n);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		SyncThread11 obj=new SyncThread11();
		Thread t1=new Thread()
				{
			public void run()
			{
				obj.printTable(5);
			}
				};
		Thread t2=new Thread()
				{
			public void run()
			{
				obj.printTable(100);;
				
			}
				};
		Thread t3= new Thread()
				{
			public void run ()
			{
			 obj.printTable(1000);	
			}
			};
		t1.start();
		t2.start();
		t3.start();
	}
	
}
