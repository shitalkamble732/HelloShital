package com.csi.staticConcept;

public class ThisPassAsArgu {
	
	/*
	void m(ThisPassAsArgu obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
		  public static void main(String args[]){  
			  ThisPassAsArgu s1 = new ThisPassAsArgu();  
		  s1.p();  
		  }  
*/
		  //this keyword return stmt from method using this keyword  
		  
		  ThisPassAsArgu getA(){  
			  return this;  
			  }  
			  void msg()
			  {
				  System.out.println("Hello java....");
			  }  
			  void m()
			  {
				  
			  }
			  public static void main(String args[]){  
			  new ThisPassAsArgu().getA().msg();  
			  ThisPassAsArgu a5=new ThisPassAsArgu();
			  a5.getA();
			  System.out.println(a5);
			  System.out.println("proving Reference ID of this Keyword : "+a5);
			  }  		  
}
