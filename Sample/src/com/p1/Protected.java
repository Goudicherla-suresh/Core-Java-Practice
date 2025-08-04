package com.p1;

public class Protected {

  protected	void display() {
		System.out.println("This is protected class");
	}

}
 
	 class TNS extends Protected{
	public static void main(String[] args) {
		
		Protected a1=new Protected();
		a1.display();
	}
	 }