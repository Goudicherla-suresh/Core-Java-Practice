package com.javaprog;

import java.util.Arrays;

public class Rotate_arr {

	
			
			public static void rotate_anti(int[] arr) {
				int temp=arr[0];
				
				for(int i=1; i<arr.length;i++) {
					arr[i-1]=arr[i];
				}
				arr[arr.length-1]=temp;
				
			}
			
				
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		for(int i=1; i<=455;i++) {
			rotate_anti(arr);
		}
		System.out.println(Arrays.toString(arr));

	}

}
