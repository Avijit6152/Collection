package com.practice;

import java.util.LinkedList;


public class ListIterator {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
        l.add("Baala");
        l.add("Venki");
        l.add("Chiru");
        l.add("Naag");
        System.out.println(l);
        java.util.ListIterator<String> ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = ltr.next();
            if (s.equals("Venki"))
                ltr.remove();
            if (s.equals("Naag"))
                ltr.add("Chaitu");
            if (s.equals("Chiru"))
                ltr.add("Charan");
        }
        System.out.println(l);
		}
}

