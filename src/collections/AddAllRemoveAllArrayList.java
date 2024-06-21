package collections;

import java.util.ArrayList;
import java.util.Collections;

public class AddAllRemoveAllArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add("Apple");
		al.add("Zebra");
		al.add("Mango");
		al.add("Orange");
		al.add("Dog");
		
		//To add an arrayList into another arrayList or to create a duplicate copy
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		
		System.out.println("After adding : "+al_dup);
		
		al_dup.removeAll(al);
		System.out.println("After Removing : "+al_dup);
		
		// to sort an arraylist
		Collections.sort(al);
		System.out.println("Sorted using ascending order : "+al);
		
		// Sort in Descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted using descending order : "+al);
		
		// To Shuffle the elements
		Collections.shuffle(al);
		System.out.println("Elements after shuffling : "+al);

	}

}
