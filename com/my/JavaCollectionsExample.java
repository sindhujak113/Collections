package com.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

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
		
		//HashSet can also be instantiated using other collection objects.
		Set<String> studentsset = new HashSet<>(studentslist);
		System.out.println("This is students set instantiated from  list : "+studentsset);
		
		
		//LinkedHashSet maintains order of elements. Only unique elements are stored
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);
		Set<Integer> setNumbers = new LinkedHashSet<>(listNumbers);
		System.out.println("LinkedHashSet order "+setNumbers);
		
		
		//TreeSet can be instantiated using no argument constructor which sorts the elements using natural order.
		Set<Integer> ticketNumber = new TreeSet<>();
		ticketNumber.add(34);
		ticketNumber.add(22);
		ticketNumber.add(56);
		
		System.out.println(ticketNumber);
		
		//Using comparator to order the elements based on certain comparison
		Comparator<Integer> myComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer num, Integer numTwo) {
				if(num > numTwo) {
					return -1;
				}else {
					return 1;
				}
			}			
		};
		
		Set<Integer> uniqueNumbers = new TreeSet<>(myComparator);
		uniqueNumbers.add(122);
		uniqueNumbers.add(667);
		uniqueNumbers.add(345);
		
		System.out.println(uniqueNumbers);
		
		
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
	    
	    
	    //elements stored in a Java SortedMap map are sorted internally
	    SortedMap sortedMap = new TreeMap();

	    sortedMap.put("a", "one");
	    sortedMap.put("b", "two");
	    sortedMap.put("c", "three");

	    Iterator siterator = sortedMap.keySet().iterator();

	    while(siterator.hasNext()) {
	        String key   = (String) siterator.next();

	        String value = (String) sortedMap.get(key);
	    }
	    
	    
	    
	    //Comparator can be used to 
	    
		
	    System.out.println("*******************Map Example ends here *******************************");
	    
	    
	    
	    System.out.println("**********************************QUEUE Example starts here *******************************************************");
	    
	    Queue<String> monthQueue = new LinkedList<>();
	    
	    // We keep on adding months into the queue
	    monthQueue.add("Jan");
	    monthQueue.add("Feb");
	    monthQueue.add("Mar");
	    
	    System.out.println("Original Month Queue : " + monthQueue);
	    
	    // Lets remove an element from the queue using remove method
	    String name = monthQueue.remove();
	    
	    System.out.println("Removed this item from Month Queue : " + name);
	    System.out.println("ReNewed Queue  -  " + monthQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
	    System.out.println("Using Poll method -----");
        name = monthQueue.poll();
        System.out.println("Removed this item from Month Queue : " + name);
	    System.out.println("ReNewed Queue  -  " + monthQueue);
	    
        // Check if a Queue is empty
        System.out.println("is month queue empty? : " + monthQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of month queue : " + monthQueue.size());
        
        monthQueue.add("April");
        monthQueue.add("May");
        
        
        // Find the element in the front of the Queue using element method
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstItemInQueue =  monthQueue.element();
        System.out.println("First item in the month Queue (element()) : " + firstItemInQueue);

        // Find the element at the front of the Queue using peek method
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstItemInQueue = monthQueue.peek();
        System.out.println("First item in the month Queue (Peek()) : " + firstItemInQueue);
	    
	    System.out.println("*****************************QUEUE Example ends here ****************************************************************");
	}  
}
