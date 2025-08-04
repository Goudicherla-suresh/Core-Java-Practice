package com.oop;

public class Main1 {

     	public static void main(String[] args) {
		Restaurant obj=new Restaurant();
//		obj.order_name="biryani";
//		System.out.println(obj.order_name);
		
		obj.setToken_no(2);
		System.out.println(obj.getToken_no());
		
		obj.setTable_no(5);
		System.out.println(obj.getToken_no());
		
		obj.display()	;
	   }
      }
