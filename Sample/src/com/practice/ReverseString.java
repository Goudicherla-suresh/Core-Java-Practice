package com.practice;

import java.util.Scanner;

public class ReverseString {


	public static void main(String[] args) {
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter the String:");
			String str=Sc.nextLine();
			String reversedStr="";
			
			for(int i= str.length()-1;i>=0;i--) {
			 reversedStr += str.charAt(i);
			}
				
				System.out.println("Reversed string: " + reversedStr);
		}

	}
