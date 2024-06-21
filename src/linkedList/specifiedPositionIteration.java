package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class specifiedPositionIteration {

	public static void main(String[] args) {
		LinkedList al=new LinkedList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cat");
		al.add("Dog");
		al.add("Elephant");
		
		System.out.println(al);
		//Iterating through specified element
		
		Iterator it=al.listIterator(1);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
