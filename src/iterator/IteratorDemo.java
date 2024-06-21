package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<>();
		
		for(int i=0; i<=10 ; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Integer I =(Integer)it.next();
			if(I%2==0) {
				System.out.println(I);
			}else {
				it.remove();
			}
		}
		System.out.println(al);
		

	}

}
