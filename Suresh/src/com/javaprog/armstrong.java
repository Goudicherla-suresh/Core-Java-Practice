package com.javaprog;
import java.util.*;


public class armstrong {
	// no.of digit code
	public static int f_digit(int num) {
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
			
		}
		return count;
	}
	
	
	
	 public static int f_arm(int num) {
		 int digit=f_digit(num);
		 int res=0;
		 while(num!=0) {
			 int rem=num%10;
			  res=(int) Math.pow(rem,digit)+res;
			 num/=10;
			 
		 }
		 return res;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int arm=f_arm(num);
		if( num == arm) {
			System.out.println("its armstrong");
		}
		else {
			System.out.println("not");
		}

	}

}
