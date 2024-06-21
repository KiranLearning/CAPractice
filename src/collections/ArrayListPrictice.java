package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrictice {

	public static void main(String[] args) {
		//Ways of creating a arraylist Object
//		ArrayList al=new ArrayList<>();  // This is for heterogenous object
//		ArrayList<Integer> al1=new ArrayList<Integer>(); // This is for Homogenous Object
//		List al2=new ArrayList<>();
		
		ArrayList al=new ArrayList();
		al.add("Apple");
		al.add("Mango");
		al.add("Cat");
		al.add("Dog");
		
		System.out.println(al);
		
		//To find no of elements in an arrayList
		System.out.println(al.size());
		//To remove an element
		 System.out.println(al.remove(1));
		 System.out.println("After Removing an elements "+al);
		 
		// to add an element to an array
		 al.add("Elephant");// This will add an object to at last of an array this method comes from Collection Interface
		 System.out.println("After adding an element to an array : "+al); //
		 
		 //How to add an element to specific index
		 al.add(1, "Ball");
		 System.out.println("After using index method : "+al);
		 
		 //To get specific elemenent from an array
		 System.out.println(al.get(3));
		 
		 //To replace existing element with new element
		 System.out.println(al.set(3, "Money"));
		 
		 System.out.println("After replacing an element the array is : "+al);
		 
		 // To serach an element in an arrayList
		 System.out.println(al.contains("Money")); // If exitsts returns true else false
		 
		 System.out.println(al.isEmpty()); //If EMpty return true
		 
		 // Read data from an array List (3 Ways)
		 // 1) Using For Loop
		 // 2) Using for each Loop
		 // 3) Using Iterator interface
		 
		 // 1) Using For Loop
		 for(int i=0;i<al.size(); i++) {
			 System.out.println("Read ArrayList values using for loop : "+al.get(i));
		 }
		 System.out.println("*************************************************************");
		  
		// 2) Using for each Loop
		 for(Object a : al) {
			 System.out.println("Read values using for each loop : "+a);
		 }
		 System.out.println("**************************************************************");
		 
		 // 3) Using Iterator interface
		 System.out.println("Read values using iterator method");
		 Iterator it=al.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		
		

	}

}
