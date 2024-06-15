package com.code.Lambda;

public class Example1 {

	FunctionalInterface1 ft = (String message) -> {
		System.out.println(message.toUpperCase());
	};

	// you can remove data type from argument
	FunctionalInterface1 ft1 = (message) -> {
		System.out.println(message.toUpperCase());
	};

	// if you have only on one line in the body of method then
	// you can also remove the parenthies for the body
	FunctionalInterface1 ft2 = (message) ->
	System.out.println( message.toUpperCase());

	public static void main(String[] args) {

		Example1 obj =  new Example1();
		obj.ft2.message("hello to java 8 ");
		
	}
}
