package com.practice;

public class staticoverload {
	public static void cls() {
		System.out.println("this is class");
	}
	public static void cls(int z) {
		System.out.println("this is cls(int)");
	}

	public static void cls(double a) {
		System.out.println("this is cls(double)");
	}
	public static void main(String[] args) {
		
		staticoverload.cls();
		staticoverload.cls(10);
		staticoverload.cls(4.5);
	}

}
