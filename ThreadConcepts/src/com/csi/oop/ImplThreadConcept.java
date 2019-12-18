package com.csi.oop;


class ImplementThreadEx implements Runnable
{
int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
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

public class ImplThreadConcept {

	public static void main(String[] args) {
		
		ImplementThreadEx tt= new ImplementThreadEx();
		Thread th=new Thread(tt);
		th.start();
	}
}
