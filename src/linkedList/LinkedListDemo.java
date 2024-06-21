package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add("Hello");
		al.add("Kiran");
		al.add("How");
		al.add("Are");
		al.add("You");
		
		System.out.println(al);
		//Add First
		al.addFirst("Hey");
		System.out.println(al);
		
		//Add Last 
		al.addLast("All Good?");
		System.out.println(al);
		
		al.removeFirst();
		System.out.println(al);
		
		al.removeLast();
		System.out.println(al);
		
		
		System.out.println(al.getFirst());
		
		System.out.println(al.getLast());
		

	}

}
