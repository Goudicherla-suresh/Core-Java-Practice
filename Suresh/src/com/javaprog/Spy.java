package com.javaprog;

public class Spy {
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=1124;		
		int product=1;
		int sum=0;
		
		
		while(num!=0) {
			int rem= num%10;
		
			sum+=rem;
			product*=rem;
			
			num/=10;
		
			
		}
		if(sum==product) {
			System.out.println("spy");
		}
		else {
			System.out.println("not a spy");
		}
	}

}
