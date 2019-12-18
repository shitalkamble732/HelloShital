package com.csi.staticConcept;

public class StaticOuterClass {
	
   public int d=30;
	void put()
	{
		System.out.println("Data : "+d);
	}
	static class Inner
	{
		int d=40;
		void display()
		{
			System.out.println("The data is : "+d);
		}
	}
 public static void main(String[] args) {
	
	 StaticOuterClass.Inner obj=new StaticOuterClass.Inner();
	 obj.display();
	 Inner obj2=new Inner();
	 obj2.display();
}
}
