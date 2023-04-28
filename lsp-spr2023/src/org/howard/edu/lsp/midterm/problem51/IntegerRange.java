package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range{

    private int lower;
   	private int upper;

  	IntegerRange(int lower, int upper) { 	// Constructor
       	this.lower = lower;
       	this.upper = upper;
  	}
	public boolean contains(int value) {
		if (value <= upper && value >= lower)
			return true;
		else
			return false;
				





}
