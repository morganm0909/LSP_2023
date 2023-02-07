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
	
	static void wordCount(String inputfile) throws FileNotFoundException 
	{
		String s = removeIntegers(inputfile);
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		Map<String,Integer> wc= new HashMap<String, Integer>();
		String[] wordlist = s.split(" ");
		List<String> numbers = new ArrayList<String>();
		for (int i = 0; i < 10; i++){
			String str_i = String.valueOf(i);
			numbers.add(str_i);
		}

		//System.out.println(numbers);
		for(String word : wordlist) {
			word = word.toLowerCase();
			Integer current = wc.get(word);
			if(current != null)
				wc.put(word, current + 1);
			else
				wc.put(word, 1);
			if(word.length() < 3)
				wc.remove(word);
			
		}
		

				
		
		for (Map.Entry<String, Integer> e : wc.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

	}
	private static String removeIntegers(String input) {
		// TODO Auto-generated method stub
		char[] arr = input.toCharArray();
        String answer = "";
 
        for (int i = 0; i < arr.length; i++) {

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
