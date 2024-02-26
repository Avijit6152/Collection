package com.practice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l =	new LinkedList();
		
		l.add("Avijit");
		l.add(30);
		l.add(null);
		l.add("Kumar");
		l.set(0, "Lenka"); //Replace
		l.add(0, "Mr.");
        l.add("Avijit");
        l.removeLast();
        l.addFirst("Avi");
        l.addLast("Avijit");
		
		System.out.println(l);
	}

}
