package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverArray_To_ArrayList {

	public static void main(String[] args) {
		String arr[] = {"a","b","c","d","e"};
		for(String a : arr) {
			System.out.println(a);
		}
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
