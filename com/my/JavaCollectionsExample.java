package com.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaCollectionsExample {

	public static void main(String[] args) 
	{
	
		/*
		 * Java collections contain below interfaces
		 * 
		 * List
		 * Queue
		 * Set
		 * 		 
		 * 
		 * */

		//// ArrayList
		
		System.out.println("*******************ArrayList Example starts here *******************************");
		ArrayList<String> studentslist = new ArrayList<String>();  
		studentslist.add("Michael");//Adding object in arraylist  
		studentslist.add("Bruno");  
		studentslist.add("David");  
		studentslist.add("Eliska");  
		
		//Looping the list through Iterator  
		Iterator<String> iterator = studentslist.iterator();  
		
		while(iterator.hasNext())
		{  
			System.out.println("Student name is "+iterator.next());  
		}
		
		System.out.println("*******************ArrayList Example ends here *******************************");
		
		System.out.println("\n\n");
		
		System.out.println("*******************HashSet Example starts here *******************************");
		
		HashSet<String> citySet=new HashSet<String>();  
		citySet.add("Sydney");  
		citySet.add("Zurich");  
		citySet.add("Ravi");  
 
		//Traversing elements  
		Iterator<String> itr = citySet.iterator();  
		while(itr.hasNext()){  
			System.out.println("City is "+itr.next());  
		}
		
		System.out.println("*******************HashSet Example ends here *******************************");
		
		System.out.println("*******************Map Example starts here *******************************");
		
		Map map = new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Green");  
	    map.put(5,"Red");  
	    map.put(2,"Yellow");  
	    map.put(6,"Blue");  
	    //Traversing Map  
	    Set set = map.entrySet();//Converting to Set so that we can traverse  
	    Iterator mapItr=set.iterator();  
	    while(mapItr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)mapItr.next();  
	        System.out.println("Color is : "+entry.getKey()+" -  "+entry.getValue());  
	    }  
		
	    System.out.println("*******************Map Example ends here *******************************");
	}  
}
