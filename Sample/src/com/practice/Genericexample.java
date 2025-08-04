package com.practice;

public class Genericexample {
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + "=" + element);
	}

	public static void main(String[] args) {
		genericDisplay(11);
		genericDisplay("TNS SESSION");
		genericDisplay(1.0);

	}

}
