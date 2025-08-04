package com.javaprog;

import java.util.*;

public class reverse_arr {
		Scanner sc=new Scanner(System.in);
			public static void reverse(int[] arr, int[] res) {
				
				int p=arr.length-1;
				
				for(int i=0; i<arr.length;i++) {
					  res[p]=arr[i];
					  p--;
				}
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(res));
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=  {10,20,30,40,50,60};
		int[] res=new int[arr.length];
		reverse(arr,res);
	}

}
