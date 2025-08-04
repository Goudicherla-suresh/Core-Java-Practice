package com.practice;

public class instanceoverload {
	public  void cls() {
		System.out.println("this is class");
	}
	public void cls(int z) {
		System.out.println("this is cls(int)");
	}

	public  void cls(double a) {
		System.out.println("this is cls(double)");
	}

	public static void main(String[] args) {
		instanceoverload a1=new instanceoverload();
		a1.cls();
		a1.cls(8);
		a1.cls(2.5);
	}

}
