package com.practice;
import java.util.*;

public class Largestnumber {

	public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter the number");
      	int num1= Sc.nextInt();
        System.out.println("enter the number");
      	int num2= Sc.nextInt();
        System.out.println("enter the number");
      	int num3= Sc.nextInt();

      	int largest;
      	if(num1>=num2 && num1>=num3) {
      		System.out.println(num1 + " is larger");
      		
      	}else if(num2>=num1 &&num2>=num3) {
      		System.out.println(num2 +" is larger");
      	}else {
      		System.out.println(num3 + " is larger");
      	}
      	
      	
      	
      	
      	
      	
	}
	

}
