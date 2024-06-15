package com.code.Lambda;

import java.util.function.Function;

/*
 * there we are making our own Function 
 * Function is 
 * 
 */
public class FunctionConcept {

	//it take string as a input and  return output also in string
	static Function<String, String> mergeString = (str1) -> str1.toUpperCase().concat("sarita");

	//input as string :: output as boolean
	static Function<String , Boolean> contains = (str1) -> str1.contains("sarita");
	
	// this check the value is greater then 100 or not 
	 static Function<Integer , Boolean> greater = (value) -> value > 100;
	
	public static void main(String[] args) {
		
		System.out.println(mergeString.apply("rahul"));
		System.out.println(contains.apply("sarita"));
		System.out.println(greater.apply(101));
		System.out.println(greater.apply(100));

		
	}
}
