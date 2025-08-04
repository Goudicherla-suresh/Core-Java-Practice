package com.inheritance;

public class Multilevelinheritance {

	void eat() {
		System.out.println("eating..");
	}
}   
    class dog extends Multilevelinheritance{
    	void bark() {
    		System.out.println("barking...");
    	}
    }
     class cat extends dog{
    	 void meow() {
    		 System.out.println("meow...");
    	 }
     }