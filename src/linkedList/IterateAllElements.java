package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAllElements {

	public static void main(String[] args) {
		
		LinkedList al =new LinkedList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cat");
		al.add("Dog");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
