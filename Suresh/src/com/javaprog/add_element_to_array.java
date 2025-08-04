package com.javaprog;
import java.util.*;

public class add_element_to_array {

	public static void insert_ele(int[] arr,int ele,int ind) {
		int[] res=new int[arr.length+1];
		for(int i=0;i<ind;i++) {
			res[i]=arr[i];
			
		}
		res[ind]=ele;
		
		for(int i=ind;i<arr.length;i++) {
			res[i+1]=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,40,50,60};
int ele=35;
int ind=3;
insert_ele(arr,ele,ind);
	}

}
