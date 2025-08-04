package com.PrepInstaa;

public class Greatestof2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=90,num2=10,temp;
		
		
		
//		if(num1==num2) {
//			System.out.println("Both Are Same");
//		}
//		else if(num1>num2) {
//			System.out.println(num1 + " is Greater");
//		}
//		else {
//			System.out.println(num2 + " is Greater");
		
		if(num1==num2) {
			System.out.println("Both Are Same");
	}
		else {
			temp=num1>num2? num1 : num2 ;
			System.out.println(temp + " is greater");
		}

	}

}
