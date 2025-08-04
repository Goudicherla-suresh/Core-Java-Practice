package com.oop;

public class Student {

	private String Voter_name;
	private int Voter_id ;
	public int Age;
	public String getVoter_name() {
		return Voter_name;
	}
	public void setVoter_name(String voter_name) {
		Voter_name = voter_name;
	}
	public int getVoter_id() {
		return Voter_id;
	}
	public void setVoter_id(int voter_id) {
		Voter_id = voter_id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public String run() {
		if(Voter_name.equals("Suresh") && Age==18 && Voter_id==16926) {
			return"VOTER IS ELGIBLE";
		}
		else {
		return"NOT ELGIBLE";
		}
		
	}
	
	
}