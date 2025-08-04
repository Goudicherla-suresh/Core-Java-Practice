package com.practice;

public interface A {
	int display();
	
	default int  display1() {
		return 10;
	}
}
