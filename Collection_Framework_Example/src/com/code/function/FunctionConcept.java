package com.code.function;

import java.util.function.Function;

public class FunctionConcept {

	static Function<String, String> concatfunction = (element_value) -> element_value.toUpperCase().concat("Ram");

	static Function<String, Boolean> checkcontain = (element_value) -> element_value.contains("r");

	static Function<Integer, Boolean> greaterThen = (element_value) -> element_value > 10;

	public static void main(String[] args) {

		System.out.println(concatfunction.apply("rahul"));
		System.out.println(checkcontain.apply("rahul"));
		System.out.println(greaterThen.apply(100));
	}

}
