import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[])
	{  
      int i;
	ArrayList<Integer> al=new ArrayList<Integer>();  // creating arraylist
	for(i=1;i<=10;i++)
	{
	  al.add(i);
	}

	Iterator itr=al.iterator();    
	while(itr.hasNext())
	{  
	  Integer I=(Integer)itr.next(); 
	if(I%2==0){
	  System.out.println(I); 
	  }  
	else{

	itr.remove();
	 }  
	} 
	}
}
