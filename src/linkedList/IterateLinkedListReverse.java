package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateLinkedListReverse {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add("Hello");
		al.add("Kiran");
		al.add("How");
		al.add("Are");
		al.add("You");
		
		
		System.out.println("Before reversing list :: "+al);
		
		Iterator it =al.descendingIterator();
		while(it.hasNext()) {
			System.out.println("After reversing list :: "+it.next());
		}

	}

}
