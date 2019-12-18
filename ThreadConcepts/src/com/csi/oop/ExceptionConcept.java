package com.csi.oop;

public class ExceptionConcept {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  
		String s=null;
		String l="abc";
		int i=10;
		try
		{
			//System.out.println(s.length());
			int j=i/0;
             System.out.println(j);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	}
}
