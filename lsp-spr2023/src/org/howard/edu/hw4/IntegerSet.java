package org.howard.edu.hw4;

import java.io.*;
import java.util.*;

public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	/**
	 * Default Constructor for IntegerSet
	 * 
	 */
	public IntegerSet(ArrayList set) {
		this.set = set;
		
	}

		// Clears the internal representation of the set
	public void clear() {
		 for (int i = 1; i <= set.size(); i++)
	            set.remove(i);
};

	// Returns the length of the set
	public int length() {
		return set.size();
}; // returns the length

	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		
		ArrayList<Integer> set2 = b.set;
		
		ArrayList<Integer> temp = set;
	    ArrayList<Integer> temp2= set2;
	         
	    Collections.sort(temp);
	    Collections.sort(temp2);
	         
	    for(int i=0;i<temp.size();i++)  
	    	if(temp.get(i)!=temp2.get(i)) 
	    		return false;
	    
	    return true;
		

	}; 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if(set.contains(value))
			return true;
		else
			return false;

	};    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest()throws IntegerSetException  {
		if (set.isEmpty() == true) {
			IntegerSetException e = new IntegerSetException();
        	throw e;
		}
        else
        	Collections.sort(set, Collections.reverseOrder());
			int largest = set.get(0);
			Collections.sort(set);
			return largest;
		
}; 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest()throws IntegerSetException {
		if (set.isEmpty() == true) {
			IntegerSetException e= new IntegerSetException();
        	throw e;
		}
        else
        	Collections.sort(set);
			int smallest = set.get(0);
			return smallest;
		
	};

		// Adds an item to the set or does nothing it already there	
	public void add(int item) {
			if(set.contains(item))	
				set = set;
			else
				set.add(item);
}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		set.remove(item);
}; 
	public ArrayList<Integer> printset(){
	    return set;
	}
	
	// Set union
	public IntegerSet union(IntegerSet intSetb) {
	       ArrayList<Integer> temp = intSetb.printset();
	       
	       Set<Integer> set = new HashSet<>();
	       set.addAll(set);
	       set.addAll(temp);
	      
	       ArrayList<Integer> set3= new ArrayList<>(set);
	      
	       IntegerSet result = new IntegerSet(set3);
	       return result;
};
	
	// Set intersection
	public IntegerSet intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.printset();
	    set.retainAll(temp);
	    IntegerSet result = new IntegerSet(set);
	    return result;
	      

}; 
	
	// Set difference, i.e., s1 –s2
	public IntegerSet diff(IntegerSet intSetb) {
		 ArrayList<Integer> temp=intSetb.printset();
	     set.removeAll(temp);
	     IntegerSet result = new IntegerSet(set);
	     return result;

	     
	}; // set difference, i.e. s1 - s2
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		boolean ans = set.isEmpty();
		if(ans == true)
			return true;
		else
			return false;

			
		
	}; 
	

}

class IntegerSetException extends Exception {

}
