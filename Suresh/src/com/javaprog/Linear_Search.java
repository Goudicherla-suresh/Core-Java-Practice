package com.javaprog;

public class Linear_Search {

	public static int L_search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,44,17,18,33,92};
		int key=18;
		int ind=L_search(arr,key);
		System.out.println(ind);
	}

}
