package org.howard.edu.hw2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * 
 * @author morganmartin
 *
 */
public class WordCounting {
	/**
	 * 
	 * @param takes in file as string
	 * @throws FileNotFoundException
	 */
	static void wordCount(String inputfile) throws FileNotFoundException 
	{
		/**
		 * this method removes all non-letter characters from a string and puts
		 * them into a hashmap. The hashmap's keys contain the word and the value
		 * is how many times the word appears in the string. This info is output.
		 */
		String s = removeIntegers(inputfile);
		//method removes all symbols from string
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		Map<String,Integer> wc= new HashMap<String, Integer>();
		//words in string are separated by spaces and put into array
		String[] wordlist = s.split(" ");
		//for loop loops through each word in the array
		for(String word : wordlist) {
			//converts word to lowercase so capitalized words are put in same key
			word = word.toLowerCase();
			Integer current = wc.get(word);
			//checks if current as a value != " "
			if(current != null)
				wc.put(word, current + 1);
			else
				wc.put(word, 1);
			//if word is less than 3 characters long it is removed from hashmap
			if(word.length() < 3)
				wc.remove(word);
			
		}	

		//prints out each key and its value on a new line		
		for (Map.Entry<String, Integer> e : wc.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

	}
	private static String removeIntegers(String input) {
		/**
		 * this method returns a string without numbers
		 */
		char[] arr = input.toCharArray();
		//creates an empty string
        String answer = "";
        //loops through entire string
        for (int i = 0; i < arr.length; i++) {
        	//checks if the current character is a number
            if (!Character.isDigit(arr[i])) {
                answer += arr[i];
            }
        }
        return answer;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader fr = new FileReader();
		try {
			String s = fr.readToString("main/java/resources/words.txt");
			wordCount(s);
		} catch (FileNotFoundException e) {
			
		
		}
	}

} 
