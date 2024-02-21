package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList l  =	new ArrayList();
				
		List<Integer> s=new ArrayList<Integer>();
		List<Integer> s1=new ArrayList<Integer>();
		
		s.add(5);
		s.add(5);
		s.add(5);
		s.add(5);
		
		
		s.add(34);
		s.add(64);
		s.add(24);
		s.add(94);
		
		s.add(134);
		s.add(334);
		s.add(234);
		s.add(634);
		
		s.add(5534);
		s.add(3234);
		s.add(1334);
		s.add(8934);
		
		
		System.out.println(s);
		System.out.println("copy the ArrayList");
		s1.addAll(s);
		System.out.println(s1);
		
		
		
		System.out.println("Before Sorting");
		
// qns		
		
//		for(int n:s) {
//			if( n==5534) {
//				
//				System.out.println(s.indexOf(n));
//			}
//			
//			else {
//				System.out.println("-1");
//			}
//		}
		
		
		
		
		
		for(int numbers: s)  
	    {  
			
		  //System.out.println(numbers);  
		}
		
		
		
		
		Collections.sort(s); 
		System.out.println("After Sorting");
		for(int numbers: s)  
		{  
		  //System.out.println(numbers);  
		} 
		System.out.println(s);
		
		Collections.reverse(s);
		System.out.println("After Reverse");
		System.out.println(s);
		
		
		 // Initialize max with the first element of the ArrayList
        int max = s.get(0);

        // Iterate through the ArrayList to find the maximum element
        for (int i = 1; i < s.size(); i++) {
            int current = s.get(i);
            if (current > max) {
                max = current;
            }
        }

        // Print the maximum element
        System.out.println("Maximum element in the ArrayList: " + max);
		
		
		int min= s.get(0);
		
		for (int i = 1; i < s.size(); i++) {
			
            int current = s.get(i);
            if (current < min) {
            	min = current;
            }
        }
		
		
		System.out.println("Maximum element in the ArrayList: " + min);
		
		 // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Create an ArrayList to store duplicate elements
        ArrayList<Integer> duplicates = new ArrayList<>();

        // Iterate through the ArrayList to find duplicates
        for (Integer element : s) {
            // If the element is already in the set, it's a duplicate
            if (!set.add(element)) {
                duplicates.add(element);
            }
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements in the ArrayList: " + duplicates);
        //System.out.println(duplicates.indexOf(set));
		
		
		
		
		
		
//		s.add("Avijit");
//		s.add("8249232268");
//		s.add("avijitkumarlenka@gmail.com");
//		s.add("27");
//		s.add("Male");
//		s.add(4, "Good Afternoon");
//		
//		
//		//System.out.println(s);
//		s.add(3, "Gulu");
//		s.add("67");
//		s.add("304");
//		s.add("39");
//		System.out.println(s);
//		System.out.println("Before");
//		//Collections.sort(s);
//		System.out.println("After");
//		System.out.println(s.indexOf("39"));
	}

}
