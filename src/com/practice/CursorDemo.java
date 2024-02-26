package com.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CursorDemo  {

	public static void main(String args[]) {
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		java.util.ListIterator<String> litr = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
		}
}


