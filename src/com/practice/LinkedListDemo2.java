package com.practice;
import java.util.*;
public class LinkedListDemo2 {

	
	public static void main(String args[]){  
		
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");
		al.add("Avijit");
		
		
		Iterator<String> itr=al.iterator(); 
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		}  
}


  
 