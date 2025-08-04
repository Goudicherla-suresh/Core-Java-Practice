package com.PrepInstaa;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2020;
		if(n % 400 == 0 ) {
			System.out.println(n +" is Leap Year");
		}
		else if(n % 4 ==0 && n % 100!=0){
			System.out.println( n + " is a Leap Year");
		}
		else {
			System.out.println(n + " is Not a Leap Year");
		}

	}

}
