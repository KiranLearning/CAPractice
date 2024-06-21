package linkedList;

import java.util.LinkedList;

public class InsertSomeElementsAtTheSpecifiedPosition {

	public static void main(String[] args) {
		LinkedList al=new LinkedList<>();
		
		al.add("Hello");
		al.add("Hi");
		al.add("Kiran");
		
		System.out.println("List 1 : "+al);
		
		LinkedList al2=new LinkedList<>();
		al2.add("How");
		al2.add("Are");
		al2.add("You");
		
		System.out.println("List 2 : "+al2);
		
		al.addAll(2, al2);
		System.out.println(al);
		
		
	}

}
