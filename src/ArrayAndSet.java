import java.util.*;


public class ArrayAndSet {

	public static void main(String[] args) {
            System.out.println("Hi This is Chenthilraj");
		//ArrayList a = new ArrayList();
		
		//Set a = new LinkedHashSet(); // it gives as per our order in which we are adding
		//Set a = new TreeSet(); // sort the contents based on natural order
		Set a = new HashSet(); // no order 
		
		a.add("Diamond");
		a.add("Silver");
		a.add("Gold");
		a.add("Uma Gold");
		a.add("Platinum");
		a.add("Diamond");
		
		for(Object o: a){
			System.out.println("   " + o);
		}
		
		
		// Using Iterator
		Iterator i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		a.clear();
		
		a.add(1);
		a.add(20);
		a.add(15);
		a.add(30);
		a.add(25);
		
		for(Object o: a){
			System.out.println("   " + o);
		}
		
		//for(int i=0; i<a.size(); i++){
			//System.out.println("The list are " + a[i]);
		//}
		
		
	}

}
