package com.javaprog;

public class no_of_digits {

	public static int f_digit(int num) {
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int num=456;
			 int res=f_digit(num);
			 System.out.println(res);
	}

}
