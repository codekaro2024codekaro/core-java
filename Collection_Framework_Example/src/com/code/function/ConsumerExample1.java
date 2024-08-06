package com.code.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {

	static Consumer<Person1> nameConsumer = (person) -> {
		if (person.getName().toLowerCase().contains("ram")) {
			person.setName(person.getName().toLowerCase());
		}
	};

	static Consumer<Person1> ageConsumer = (person) -> {
		if (person.getAge() < 20) {
			person.setAge(person.getAge() + 10);
		}

	};

	public static void main(String[] args) {

		List<Person1> personList = new ArrayList<Person1>();
		personList.add(new Person1("rahul", 10));
		personList.add(new Person1("sarita", 20));
		personList.add(new Person1("Ram", 8));
		personList.add(new Person1("Alic", 14));
		personList.add(new Person1("Mark", 16));
		
		personList.forEach(ageConsumer);
		personList.forEach(ageConsumer);

	}
}

class Person {

	private String name;

	private int age;

	public Person(String name, int age) {
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