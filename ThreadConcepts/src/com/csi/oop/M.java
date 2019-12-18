package com.csi.oop;

import java.io.IOException;

 class Mn {
	
	void method() throws IOException
	{
		throw new IOException("Device Error....");
	}
 }
 class M
 {
  public static void main(String[] args) throws IOException {
	
	  Mn m1=new Mn();
	  m1.method();
	  System.out.println("Rest of the code....");
}
}

