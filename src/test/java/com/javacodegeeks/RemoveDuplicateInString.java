package com.javacodegeeks;

import java.util.HashMap;
import java.util.Map;



public class RemoveDuplicateInString {
	
	public static void main (String[] args){
		String input = "jagannathan";
		String output = removeDup(input);
		System.out.println("The input string after removing dups "+output);
	}
	
	
	public static String removeDup(String input){

		StringBuffer output = new StringBuffer();
		HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();
		char[] charArray = input.toCharArray();
		boolean[] flag = new boolean[256];
		for(char c : charArray){
			if (flag[c]){
				System.out.println("The duplicate character in the string "+c);
				countMap.put(c,countMap.get(c)+1);
			}
			else
			{
				output.append(c);
				flag[c]=true;
				countMap.put(c,1);
			}
		}
		
		//printing the map
		for (Map.Entry<Character, Integer> m : countMap.entrySet()){
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		return output.toString();
		
		
	}

}
