package com.practice;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();

		s.push("Avijit");
		s.push("Kumar");
		s.push("Lenka");
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		
		for(int i=1;i<=10;i++) {
			
			s.push(i);
		}
		
		System.out.println(s);
		//System.out.println(s.search("Avijit"));
	}

}
