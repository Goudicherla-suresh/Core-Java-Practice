package com.oop;

public class Restaurant {
	
	private int token_no;
	private int table_no;
	public String order_name;
	public int getToken_no() {
		return token_no;
	}
	public void setToken_no(int token_no) {
		this.token_no = token_no;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	
	
	
	public void  display() {
		if(token_no==2 && table_no==5) {
	  System.out.println("Table is booked");		
		}
		else {
			System.out.println("Table is Not Reserved");
		}
	}
}


