package com.oop;

public class Main {
	public static void main(String[] args) {
	Student obj=new Student();
	obj.setAge(18);
		System.out.println(obj.getAge());
		
	obj.setVoter_name("Suresh");
	System.out.println(obj.getVoter_name());
	
	obj.setVoter_id(16926);
	System.out.println(obj.getVoter_id());
	
	obj.run();
		
	
	

}
}