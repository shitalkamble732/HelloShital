package com.csi.oop;

public class StringBufferConcepts {
	public static void main(String[] args) {
		
		
		StringBuffer sbb=new StringBuffer("StringBuffer is Mutable");
		System.out.println(sbb);
	    StringBuffer sb= new StringBuffer("String");
	    System.out.println(sb.append("Buffer"));
	    System.out.println(sb.length());
	    System.out.println(sb.substring(6));
	    System.out.println(sb.substring(3,6));    
	   // System.out.println(sb.delete(3, 5));
	    System.out.println(sb.capacity());
	    System.out.println(sbb.capacity());
	    System.out.println(sb.equals(sbb));
	    System.out.println(sbb.indexOf("B"));
	    System.out.println(sb.charAt(3));
	    System.out.println(sb);
	    System.out.println(sb.insert(1, 'P'));
	    System.out.println(sb.reverse());
	    System.out.println(sb.indexOf("B"));
	    System.out.println(sb.append('M'));
	    System.out.println(sb.reverse());
	    System.out.println(sbb);
	    System.err.println(sbb.replace(0, 4, "The"));
	  //  System.out.println(sbb.);
	}

}
