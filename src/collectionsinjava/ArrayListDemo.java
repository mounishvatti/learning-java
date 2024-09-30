package collectionsinjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // similar to a vector in c++
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0);
		
		System.out.println(list);
		
		Collections.sort(list);  // sort the elements of the ArrayList in ascending order.
		
		System.out.println(list);
		
		list.add(2, 5); // appends the value at the position mentioned
		
		System.out.println(list);
		
		list.set(2, 4); // overrides the existing value
		
		System.out.println(list);
		
		System.out.println("Size of the list: "+list.size());
		
	}
}
