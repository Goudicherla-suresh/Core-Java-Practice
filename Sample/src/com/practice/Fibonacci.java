package com.practice;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int count=Sc.nextInt();

		int num1=0,num2=1;
		System.out.println("fibonacci series of " + count +" numbers");
		
		for(int i=1 ;i<=count;i++) {
			System.out.println(num1 + "");
			int sum=num1+num2;
			num1= num2;
			num2=sum;
		}
		
	}

}
