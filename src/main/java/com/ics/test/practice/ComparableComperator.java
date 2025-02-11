package com.ics.test.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * comparable is an inteface which is used to sort an object on the basic of
 * there attribute it has compare to method
 * 
 */
public class ComparableComperator {
	/**
	 * In TreeMap it returns the data in sorted form
	 * 
	 **/

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<>();
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };

		/***
		 * for (int i = 0; i < arr.length; i++) { tm.put(arr[i], tm.getOrDefault(arr[i],
		 * 0) + 1); }
		 **/

		/**
		 * It does not allow key as null but it allows multiple null values. when we
		 * pass null key it gives null pointer exception. TreeMap uses the concept of
		 * redBlack tree to insert the elements
		 */
//		tm.put(15, null);
		// tm.put(null, 15);
//		for (Map.Entry m : tm.entrySet()) {
//			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
//		}

		/**
		 * hashmap allow a null key and multiple null values . hashmap doesnot maintain
		 * insertion order
		 * 
		 */
		/**
		 * for (int i = 0; i < arr.length; i++) { hm.put(arr[i], hm.getOrDefault(arr[i],
		 * 0) + 1); } for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
		 * System.out.println("Frequency of " + map.getKey() + " is " + map.getValue());
		 * }
		 ***/

		/**
		 * Linked Hashmap Maintains the insertion order
		 */
		/**
		 * for (int i = 0; i < arr.length; i++) { lhm.put(arr[i],
		 * hm.getOrDefault(arr[i], 0) + 1); } for (Map.Entry<Integer, Integer> map :
		 * lhm.entrySet()) { System.out.println("Frequency of " + map.getKey() + " is "
		 * + map.getValue()); }
		 **/

		/**
		 * concurrent hashmap is a thread safe and it used concept of hashtable to store
		 * the data in key value pair.
		 **/
		for (int i = 0; i < arr.length; i++) {
			chm.put(arr[i], chm.getOrDefault(arr[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> map : chm.entrySet()) {
			System.out.println("Frequency of " + map.getKey() + " is " + map.getValue());
		}

	}

}
