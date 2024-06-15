package com.code.ListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Class will do CRUD operation on ArrayList
 * Author :Rahul.patni
 * 
 */
public class ArrayListCRUD {

	// variable declare
	public List<Integer> list;

	{
		System.out.println("init block");
		list = new ArrayList<Integer>();

		/*   i > 10 i is greater then
		 * ensureCapacity method to ensure that the ArrayList can hold a specified this
		 * method was introduce in java 1.2
		 */
		((ArrayList<Integer>) list).ensureCapacity(100);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("element in arraylist :" + list.toString());
	}

	// update the element in the array list
	public List<Integer> updateElementList(Integer index, Integer element) {

		if (index != null && list.size() - 1 > index) {
			list.set(index, element);
			System.out.println("list after update  :" + list.toString());
		} else {
			System.out.println("list not updated particular index not found" + index);
		}
		return list;
	}

	// add element in the array list
	public List<Integer> addElement(Integer index, Integer element) {

		if (index != null) {
			list.add(index, element);
		} else {
			list.add(element);
		}
		System.out.println("list after add  :" + list.toString());

		return list;
	}

	// remove element from specific index
	public List<Integer> removeElement(Integer index) {

		if (!list.isEmpty() && list.size() - 1 > index && index != null) {
			list.remove(index);
			System.out.println("list after remove  :" + list.toString());
		}
		return list;
	}

	public List<Integer> removeSpecificElement(Integer element, String expression) {

		if (!list.isEmpty()) {
			
			switch (expression) {
			// concurrent modification exception
			case "USING_ITERATOR":
				Iterator<Integer> itr = list.iterator();
				while (itr.hasNext()) { // hasNext will check is element is present in list or not
					if (itr.next() == element) {
						itr.remove(); // if you use list.remove method you will get concurrent modification exception
						break;
					}
				}
				System.out.println("remove specific element using iterator interface  :" + list.toString());
				break;
			case "USING_FOR":
				List<Integer> copy = new ArrayList<>(list);
				for (Integer e : copy) {
					if (list.contains(element)) {
						list.remove(list.indexOf(element));
						break;
					}
				}
				System.out.println("remove specific element using for loop  :" + list.toString());
				break;
			case "REMOVE_FROM_EVERY_WHERE":
				list.removeIf(el -> element.equals(el));
				System.out.println("remove specific element if duplicate value found   :" + list.toString());
				break;

			default:
				System.out.println("element  does not exits in Array list ");
			}
		}

		return list;
	}

	public static void main(String[] args) {
		ArrayListCRUD obj = new ArrayListCRUD();
		obj.addElement(null, 5);
		obj.addElement(null, 5);
		obj.addElement(null, 5);
		obj.addElement(null, 5);
		obj.addElement(null, 5);
		
		obj.updateElementList(9, 5);
		obj.updateElementList(100, 5);
		obj.removeElement(99);
		obj.removeElement(4);
		obj.removeSpecificElement(5, "USING_ITERATOR");
		obj.removeSpecificElement(5, "USING_FOR");
		
		obj.removeSpecificElement(5, "REMOVE_FROM_EVERY_WHERE");

	}

}
