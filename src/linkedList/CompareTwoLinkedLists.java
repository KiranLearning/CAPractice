package linkedList;

import java.util.LinkedList;

public class CompareTwoLinkedLists {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
			l.add("Hello");
			l.add("Hi");
			l.add("Kiran");
			
		LinkedList k =new LinkedList<>();
			k.add("Hello");
			k.add("Hi");
			k.add("Ram");
		
			
			LinkedList m=new LinkedList<>();
			
			for(Object e : l)
				
				m.add(k.contains(e) ? "Yes" : "No");
				
				System.out.println(m);
			
		
		
	
		
//		 LinkedList<String> c1= new LinkedList<String>();
//         c1.add("Red");
//         c1.add("Green");
//         c1.add("Black");
//         c1.add("White");
//         c1.add("Pink");
//
//         LinkedList<String> c2= new LinkedList<String>();
//         c2.add("Red");
//         c2.add("Green");
//         c2.add("Black");
//         c2.add("Orange");
//
//         //comparison output in linked list
//         LinkedList<String> c3 = new LinkedList<String>();
//         for (String e : c1)
//            c3.add(c2.contains(e) ? "Yes" : "No");
//         System.out.println(c3);         
    }
}


