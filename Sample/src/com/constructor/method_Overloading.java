package com.constructor;

public class method_Overloading {
	double add(int x , double y) {
		return(x+y);
	}
	double sub(double x, int y) {
		return(x-y);
	}
	double mul(int x,double y, float z) {
		return(x*y*z);
		
	}
	public static void main(String[] args) {
		int a=10;
		double b=1.5;
		float c=3.2f;
		double result;
		method_Overloading m1=new method_Overloading();
		result=m1.add(a,b);
		System.out.println("addition is:"+ result );
		result=m1.sub(b,a);
		System.out.println("substraction is:"+ result );
		result=m1.mul(a,b,c);
		System.out.println("multiplication is:"+ result );

	}
}
