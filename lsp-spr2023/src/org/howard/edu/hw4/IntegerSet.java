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

	/**
	 * 	Clears the internal representation of the set
	 */
	public void clear() {
		 for (int i = 1; i <= set.size(); i++)
	            set.remove(i);
};
	/**
	 * 
	 * // Returns the length of the set
	 */

	public int length() {
		return set.size();
}; 

	/**
	  Returns true if the 2 sets are equal, false otherwise;
	 	Two sets are equal if they contain all of the same values in ANY order.
	 	1 Parameter: integerSetb which is another IntegerSet class instance
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

	/** 
	 * 
	 * @param value
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		if(set.contains(value))
			return true;
		else
			return false;

	};    
	
	/** 
	 * 
	 * @return the largest item in the set; Throws a IntegerSetException if the set is empty 
	 * @throws IntegerSetException
	 */
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

		/** Adds an item to the set or does nothing it already there	
		 * 
		 * @param item
		 */
	public void add(int item) {
			if(set.contains(item))	
				set = set;
			else
				set.add(item);
}; 

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
	       
	       Set<Integer> s = new HashSet<>();
	       s.addAll(set);
	       s.addAll(temp);
	      
	       ArrayList<Integer> set3= new ArrayList<>(s);
	      
	       IntegerSet result = new IntegerSet(set3);
	       return result;
	       
	       
	
};
	
	/** 
	 * 
	 * @param intSetb(another IntegerSet)
	 * @return intersection of set1 and set2(parameter)
	 */
	public IntegerSet intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = intSetb.printset();
	    set.retainAll(temp);
	    IntegerSet result = new IntegerSet(set);
	    return result;
	      

}; 
	
	/** 
	 * 
	 * @param intSetb
	 * @return Set difference, i.e., s1 –s2
	 */
	public IntegerSet diff(IntegerSet intSetb) {
		 ArrayList<Integer> temp=intSetb.printset();
	     set.removeAll(temp);
	     IntegerSet result = new IntegerSet(set);
	     return result;

	     
	}; 
	
	/** 
	 * 
	 * @return Returns true if the set is empty, false otherwise
	 */
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
