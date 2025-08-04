package com.practice;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the value:");
	      	int num1= Sc.nextInt();
	        System.out.println("enter the value");
	      	int num2= Sc.nextInt();

		num1=num1+num2;
		num2= num1-num2;
		num1=num1-num2;
		
		System.out.println("AFTER SWAPPING");
		System.out.println("the first number is " + num1 );
		System.out.println("the second number is " + num2 );
	}

}
