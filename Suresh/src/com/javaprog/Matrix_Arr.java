package com.javaprog;

import java.util.Arrays;

public class Matrix_Arr {

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int rows=3;
		int cols=4;
		int k=11;
		int [][] arr=new int [rows][cols];
		for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
		
			arr[i][j]=k;
			k++;
		}

		}
		System.out.println(Arrays.deepToString(arr));
	
   for(int i=0;i<rows;i++) {
	  for(int j=0;j<cols;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}

