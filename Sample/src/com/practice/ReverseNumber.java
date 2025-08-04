package com.practice;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Sc.nextInt();
		
		int reversenumber=0;
		int digit= num  %  10;
		reversenumber=reversenumber*10+digit;	
		reversenumber/=10;
	System.out.println(reversenumber);
	}
	

}
