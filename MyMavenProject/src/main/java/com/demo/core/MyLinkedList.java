package com.demo.core;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	/*
	 * This Program demonstrate the Linked list general operations
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ListofList();
		ListOfStrings();
		
	}

	private static void ListofList() {
		// TODO Auto-generated method stub
		List<String> list1=new LinkedList<String>();
		list1.add("A");
		list1.add(1, "B");
		list1.add("C");
		list1.add("5");
		list1.add("A");
		list1.remove(1);
		//list1.remove(5);
		list1.add(0, "First");
		
		System.out.println(list1);
		System.out.println(list1.contains("F"));
		System.out.println(list1.get(3));
		System.out.println(list1.hashCode());
		System.out.println(list1.lastIndexOf("C"));
		System.out.println(list1.size());
		System.out.println(list1.set(1, "New"));
		System.out.println(list1);
		list1.add(1, null);
		System.out.println(list1);
		
	}

	private static void ListOfStrings() {
		// TODO Auto-generated method stub
		
		LinkedList<LinkedList<String>> list2 =new LinkedList<LinkedList<String>>();
		System.out.println("--------------------------------------");
		System.out.println(list2.isEmpty());
//		list2.add("A");
//		list2.add(1, "B"); These statements through error
		LinkedList<String> list3= new LinkedList<String>();
//		list3.add(1,"H"); Throws IndexoutofBoundException since array has size 0 at this point.
		list3.add("one");
		list3.add(1,"Z");
		list3.add("Two");
		list3.add(1,"X");
		list3.add("Three");
		list3.add("D");
		list3.add("K");
		System.out.println(list3.size());
		System.out.println("list 3: "+ " "+list3);
		System.out.println("----------------------------------------");
		list2.add(list3);
		System.out.println(list2);
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
	}

}
