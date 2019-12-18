import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
		  public static void main(String a[]){
		    ListIterator<String> litr = null;
		    List<String> test = new ArrayList<String>();
		    test.add("vipin");
		    test.add("vijay");
		    test.add("manu");
		    test.add("teena");
		    test.add("Kate");
		    litr=test.listIterator();
		 
		    while(litr.hasNext()){
		       System.out.println(litr.next());
		    }
		    while(litr.hasPrevious()){
		       System.out.println(litr.previous());
		    }
		  }
		}
		 

