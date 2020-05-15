
package com.resource.profie.test;

import java.text.DecimalFormat;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable.PrintMode;

import java.io.*;
//import java.util.*;
//import java.io.*;
//import java.math.*;
import java.security.*;
import java.text.*;
//public class NumberToWord {
import java.util.*;
//import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

class NumberToWord {
	/*
	 * public static void main (String[] args) { Map<String,String> unsortMap= new
	 * HashMap<String, String>(); unsortMap.put("Z","109");
	 * unsortMap.put("V","898"); unsortMap.put("G","567"); unsortMap.put("C","999");
	 * unsortMap.put("A","101"); unsortMap.put("X","1233"); unsortMap.put("D","33");
	 * System.out.println("Unsort Map..."); printMap(unsortMap);
	 * System.out.println("\nSorted Map..By key"); Map<String,String> treeMap = new
	 * TreeMap<String,String>(unsortMap); printMap(treeMap); }
	 * 
	 * //private static void printMap(Map<String, String> treeMap) { //} public
	 * static <K,V> void printMap(Map<K,V>map) {
	 * 
	 * for (Map.Entry<K, V> entry : map.entrySet()) { System.out.println("Key :"+
	 * entry.getKey() + "Value :" + entry.getValue());
	 * 
	 * // TODO Auto-generated method stub
	 * 
	 * } } }
	 */

	public static void main(String args[]){
		for(int i = 1; i <= 15; i++) { 
			if(i % (3*5) == 0) System.out.println("FizzBuzz");
			else if(i % 5 == 0) System.out.println("Buzz"); 
			else if(i % 3 == 0) System.out.println("Fizz"); 
			else System.out.println(i); 
			}
		}

	}
