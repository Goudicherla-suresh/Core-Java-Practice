package com.practice;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the String:");
	String Str=sc.nextLine();
	
	String reversedstr= "";
	for(int i=Str.length()-1; i>=0;i--) {
		reversedstr+= Str.charAt(i);
	}
	if(Str.equals(reversedstr)) {
		System.out.println( Str +" is palindrome");
	}else {
		System.out.println( Str +" is not a palindrome");
	}
}
}