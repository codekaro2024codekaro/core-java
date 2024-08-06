package com.code.function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/*
 * it will not return any thing it just process your data
 */
public class ConsumerBasicExample1 {
	
	static List<Integer> list2 = new ArrayList<Integer>();
	
	static Set<Integer> set = new HashSet<Integer>();
	
	static Consumer<Integer> listprocess = a -> {
		 if (a != null) {
		     list2.add(a);
		 }
	};

	static Consumer<Integer> duplicateprocess = a -> {
		set.add(a);
	};
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		
		
	  list.forEach(listprocess);
	  System.out.println(list2);
	  
	  //in java 8 consumer refernce will passed 
	  list.forEach(duplicateprocess);
	  System.out.println(set);
		
	}
}
