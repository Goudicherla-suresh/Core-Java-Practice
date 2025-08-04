package com.practice;
import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String Str1=sc.nextLine();
		
		System.out.println("enter the String:");
		String Str2=sc.nextLine();
		
	String	concatenated= Str1+ Str2;
		
		System.out.println(concatenated);
	}

}
