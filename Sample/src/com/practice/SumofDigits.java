package com.practice;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the digits");
		int num=Sc.nextInt();
		int sum=0;
		
		 while(num!=0) {
			 sum+=num%10;
		 num/=10;	 
			 
		 }
		 System.out.println("the sum of digits " + sum);

	}

}
