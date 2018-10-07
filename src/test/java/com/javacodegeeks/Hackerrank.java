package com.javacodegeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hackerrank {
	
	public static void main ( String args[]){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		
		int r = findShortestSubArray(arr);
		System.out.println("result is " + r);
		
		
	}
		public static int findShortestSubArray(List<Integer> nums) {
		    int n = nums.size();
		    int degree = 0;
		    HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
		    HashMap<Integer,Integer> left = new HashMap<Integer,Integer>();
		    HashMap<Integer,Integer> right = new HashMap<Integer,Integer>();
		    for(int i = 0;i<n;i++){
		        count.put(nums.get(i),count.getOrDefault(nums.get(i),0)+1);
		        if(!left.containsKey(nums.get(i)))left.put(nums.get(i),i);
		        right.put(nums.get(i),i);
		        degree = Math.max(degree,count.get(nums.get(i)));
		    }
		    int len ;
		    int result = n;
		    for(int c : count.keySet()){
		        if(count.get(c)==degree){
		            len = right.get(c)-left.get(c)+1;
		            if(len < result)
		                result = len;
		        }

		    }
		    return result;

		}
		
		
		
		
	}

	
