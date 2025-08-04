package com.javaprog;

import java.util.Arrays;

public class Delete_arr_ele {
		
			public static void dil_ind(int[] arr,int ind) {
				int[] res=new int[arr.length-1];
				for(int i=0;i<ind;i++) {
					res[i]=arr[i];
					
				}
				
				for(int i=ind+1;i<arr.length;i++) {
					res[i-1]=arr[i];
				}
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(res));
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		int ind=3;
	dil_ind(arr,ind);
		
	}

}
