package com.practice;
import java.util.*;
public class ChocolatePackets {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter an array:");
		int n=Sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=Sc.nextInt();
			
			}
			for(int i=0;i<n;i++) {
				if(arr[i]!=0);
				int count=0;
				arr[count++] = arr[i];	
			}
			//arr[count++]=arr[i];
			for(int i=0;i<n;i++) {
				System.out.println(arr[i] + " ");
			}
	}
		

}
