package com.constructor;

public class Default {
	int num;
	
	public Default() {
		num=3;
	}

	public static void main(String[] args) {
		Default d1=new Default();
		System.out.println("the num is:" + d1.num);
	}

}
