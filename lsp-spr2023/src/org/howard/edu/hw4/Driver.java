package org.howard.edu.hw4;

import java.util.*;


public class Driver {

   public static void main(String[] args) throws IntegerSetException {
      
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		  

		IntegerSet set1= new IntegerSet(list1);
		IntegerSet set2= new IntegerSet(list2);
		IntegerSet set3 =  new IntegerSet(null);
		  
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
	
		set2.add(4);
		set2.add(5);
		  
		System.out.println("Set 1: " + set1.printset());
		System.out.println("Set 2: " + set2.printset());  
		System.out.println("Is equal: " + set1.equals(set2));
		System.out.println("Contains: " + set1.contains(2));
		System.out.println("Contains: " + set1.contains(7));
		System.out.println("Smallest in set2: "+ set2.smallest());
		System.out.println("Largest in set1: " + set1.largest());
		System.out.println("Difference: " + set1.diff(set2));
		
		
		set1.remove(0);
		System.out.println("Set 1 after removing 1: " + set1.printset());
		  
		IntegerSet setunion = set1.union(set2);  
		System.out.println("Union : " + setunion.printset() );
		IntegerSet setint= set1.intersect(set2);	
		set1.add(4);
		System.out.println("Intersection : " + setint.printset() );
		  
		
		      
		   }
		
		}
		
		
