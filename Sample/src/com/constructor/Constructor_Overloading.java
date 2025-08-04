package com.constructor;

public class Constructor_Overloading {
	int x;
	double y;
	//default method
	public Constructor_Overloading() {
		x=2;
		y=1.5;
	}
	public Constructor_Overloading(int x) {
		x=1;
		
	}
	public Constructor_Overloading(int x, double y) {
		x=10;
		y=2.5;
	}
	public void display() {
		//System.out.println("int x=" + x "\n  double y=" + y);
	}
	public static void main(String[] args) {
		Constructor_Overloading c1=new Constructor_Overloading();
	}

}
