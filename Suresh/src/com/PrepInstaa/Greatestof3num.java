package com.PrepInstaa;

public class Greatestof3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100,num2=200,num3=300,temp,result;
		
//		if(num1>=num2 && num1>=num3) {
//			System.out.println(num1 + " is greater");
//		}
//		else if(num2>=num1 && num2>=num3 ) {
//			System.out.println(num2 + " is greater");
//
//		}
//		else if(num3>=num1 && num3>=num2){
//			System.out.println(num3 + " is greater");

		temp=num1>num2?num1:num2;
		result=temp>num3?temp:num3;
		System.out.println(result + " is Greater");
		
		}
	}  


