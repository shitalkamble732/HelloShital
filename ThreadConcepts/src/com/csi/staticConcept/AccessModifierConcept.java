package com.csi.staticConcept;

class AccessModifier
{
/*	private int id=121;
	private void msg()
	{
	
		System.out.println("Hello..........");
	}
	
	*/
	
  int data=40;               //bydefault data type is Default
  
}
public class AccessModifierConcept extends 

	public static void main(String[] args) {
		
	
	AccessModifier aa=new AccessModifier();
//	System.out.println("ID : "+id);       //Compiletime error
//	aa.msg();                             //Compiletime error
	System.out.println("value : "+aa.data);// Default access modifier
	
	
	aa.msg();
}

}