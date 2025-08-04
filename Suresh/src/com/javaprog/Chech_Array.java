package com.javaprog;

public class Chech_Array {
	
		public static boolean check_arr(int[] arr1,int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,20,30,40,50};
		boolean res=check_arr(arr1,arr2);
	System.out.println(res);
		
	}

}
