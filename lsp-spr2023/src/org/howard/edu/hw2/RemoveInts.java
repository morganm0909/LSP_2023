package org.howard.edu.hw2;

public class RemoveInts {

	public static String removeIntegers(String input)
    {
	      char[] arr = input.toCharArray();
	        String answer = "";
	 
	        for (int i = 0; i < arr.length; i++) {
	
	            if (!Character.isDigit(arr[i])) {
	                answer += arr[i];
	            }
	          
	        }
	        return answer;
    }
	
	public static void main(String args[])
    {

        String str = "Testing123";
        System.out.println(removeIntegers(str));
    }
}
