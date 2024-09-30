package collectionsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
	
	/*
	 * HashSet: Same as set in c++
	 * Stores unique elements
	 * we cannot sort the elements directly
	 * -- To sort we have to convert it into a list first
	 */
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(9);
		hs.add(0);
		hs.add(1);
		hs.add(8);
		hs.add(67);
		hs.add(78);
		
		System.out.println(hs);
		
		List<Integer> list = new ArrayList<>(hs);
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
