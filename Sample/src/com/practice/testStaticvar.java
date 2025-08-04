package com.practice;

public class testStaticvar {

	public static void main(String[] args) {
		
		System.out.println("the static var is:" + Staticvar.a);
		
		Staticvar v1=new Staticvar();
		System.out.println("the inst var is:" + v1.b);
		
	}

}
