package com.javaprog;

public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] array= {-12,-74,-7,-27,-15,-4};
		int max=array[0];
		
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
	}

}
