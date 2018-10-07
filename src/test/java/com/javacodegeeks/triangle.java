package com.javacodegeeks;

import java.util.ArrayList;

public class triangle {

	
	public static void main ( String args[]){
		System.out.println("im here");
		int arr1[]={5,2,3};
		int arr2[]={4,5,6};
		int arr3[]={7,8,9};
		
		String[] arr = find(arr1,arr2,arr3);
		for ( String s : arr){
			System.out.println(s);
		}
		
		//System.out.println("result is " + r);
	
	}
	
	public static String[] find (int[] a, int[] b, int[] c){
		
		String arr[] = {"No","No","No"};
		
		for (int i = 0 ; i < 3 ; i ++){
			if ( a[i] + b [i]> c[i]){
				if (b[i] + c [i]> a[i]){
					if (c[i] + a [i]> b[i]){
						arr[i] = "Yes";
					}
				}
			}
		}
		return arr;
		
	}
}
