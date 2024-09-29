package com.lmsDay8;
import java.util.HashMap;
import java.util.Map;

	public class HashMapDemo {
	    public static void main(String[] args) {
	        // Create a HashMap to store Integer keys and String values
	        HashMap<Integer, String> map = new HashMap<>();

	        // Associate specified values with specified keys
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");
	        map.put(4, "Date");
	        map.put(5, "Mango");

	        // Display the contents of the HashMap
	        System.out.println("HashMap contents:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Associating a new value with an existing key
	        map.put(3, "Coconut"); // This will replace the previous value for key 3

	        // HashMap after modification
	        System.out.println("\nHashMap contents after updating key 3:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}