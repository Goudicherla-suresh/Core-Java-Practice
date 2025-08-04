package com.constructor;

public class Paramaterized {
	int num;
	
	public Paramaterized(int x) {
		num=x;
		
	}

	public static void main(String[] args) {
		Paramaterized p1=new Paramaterized(10);
		System.out.println("the Paramaterized number is:" + p1.num);
	}

}
