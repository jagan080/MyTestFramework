package com.javacodegeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class practo {
	
	public static void main (String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		long result = subarraySum(arr);
		System.out.println(result);
	}

	  public static long subarraySum(List<Integer> arr) {
		    // Write your code here
		  long result = 0;
	        int n = arr.size();
	        for (int i = 0; i < n; i ++)
	                {
	                    // Pick ending point
	                    for (int j = i; j < n; j ++)
	                    {
	                        // sum subarray between current
	                        // starting and ending points
	                        for (int k = i; k <= j; k++)
	                            result += arr.get(k);
	                    }
	                }
	                return result ;
	    }
	  
	  static int countDuplicates(int[] numbers) {
		int result = 0;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for ()


	    }
}