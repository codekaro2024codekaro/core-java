package com.code.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	static Consumer<List<Person1>> nameConsumer = (person) -> {
		for (Person1 perList : person) {
			if (perList.getName().toUpperCase().contains("RAM")) {
				perList.setName(perList.getName());
			}
		}
	};

	static Consumer<List<Person1>> ageConsumer = (person) -> {
		for (Person1 perList : person) {
			if (perList.getAge() < 10) {
				perList.setAge(perList.getAge() + 9);
			}
		}
	};

	public static void main(String[] args) {
		List<Person1> personList = new ArrayList<Person1>();
		personList.add(new Person1("rahul", 10));
		personList.add(new Person1("sarita", 20));
		personList.add(new Person1("Ram", 8));
		personList.add(new Person1("Alic", 14));
		personList.add(new Person1("Mark", 16));

		
		nameConsumer.accept(personList);
		ageConsumer.accept(personList);
	}
}

class Person1 {

	private String name;

	private int age;

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name =" + name + "age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
