package collectionsinjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	/*
	 * HashMap - key, value pairs
	 * keys must be unique
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Mounish"); // (key, value)
		map.put(1, "Rahul");
		map.put(2, "Madhu");
		map.put(3, "Susan");
		map.put(4, "Raj");
		
		System.out.println(map);
		
		// putIfAbsent
		
		map.putIfAbsent(1, "KP Sai Rahul"); // adds a value only if it's not present at the given key
		System.out.println(map);
		
		// fetch all keys and print them
		Set<Integer> keys = map.keySet();
		System.out.println("Keys: "+keys);
		
		// get all values
		Collection<String> values = map.values(); // collection instead of list provides more flexibility especially when dealing with map/HashMap
		System.out.println("Values: "+ values);
		
	}
}
