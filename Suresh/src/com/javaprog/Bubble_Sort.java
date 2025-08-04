package com.javaprog;
import java.util.*;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  int arr[]= {20,60,45,-55,12,-3,10};
			  for(int i=0; i<arr.length;i++) {
				  for(int j=0; j<arr.length-1; j++) {
					  if(arr[j]>arr[j+1]) {
						  int temp=arr[j+1];
						  arr[j+1]=arr[j];
						  arr[j]=temp;
					  }
				  }
			  }
			  System.out.println(Arrays.toString(arr));
	}

}
