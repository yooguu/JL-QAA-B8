package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> idNumber = new TreeSet<>();
		idNumber.add(101);
		idNumber.add(102);
		idNumber.add(100);
		
		
		for (Integer item : idNumber) {
			System.out.println(item);
		}
		
		TreeMap<Integer,String> favoriteAngka = new TreeMap<>();
		favoriteAngka.put(666, "Fahri");
		favoriteAngka.put(555, "Ika");
		favoriteAngka.put(777, "Fajar");

		for (Integer key : favoriteAngka.keySet()) {
			System.out.println("Favorite angka dari " + favoriteAngka.get(key) + " adalah " + key);
		}
		
	}

}
