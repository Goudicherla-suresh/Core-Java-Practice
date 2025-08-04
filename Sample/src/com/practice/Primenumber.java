package com.practice;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Sc.nextInt();
		boolean isprime=true;
		
		if(num<=1) {
			isprime=false;
		}
		
		else {
			for(int i=2; i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num + " is a prime.");
		}else {
			System.out.println(num + " is not a prime");
		}
	}

}
