package com.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		int year=sc.nextInt();
		
	   if(year%4==0) {
	   System.out.println( "this is leap year");
	}else {
		System.out.println("not a leap year");
	}

}
}
