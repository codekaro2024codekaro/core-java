package com.code.Lambda;

public class Example2 {

	FunctionalInterface2 add = (a, b) -> {
		return a + b;
	};

	FunctionalInterface2 sub = (a, b) -> {
		return a - b;
	};

	FunctionalInterface2 multi = (a, b) -> a * b;

	FunctionalInterface2 div = (a, b) -> {
		return a % b;
	};

	public static void main(String[] args) {

		Example2 obj = new Example2();
		System.out.println(obj.add.operation(1, 2));
		System.out.println(obj.sub.operation(1, 2));
		System.out.println(obj.multi.operation(1, 2));
		System.out.println(obj.div.operation(1, 2));
	}

}
