package com.practice;

public class StudentTest {

	public static void main(String[] args) {

		Student[] arr;
		arr=new Student[5];
		arr[0]=new Student(26,"Suresh");
    	arr[1]=new Student(29,"Naveen");
  		arr[2]=new Student(39,"koushik");
   		arr[3]=new Student(14,"Uday");
    	arr[4]=new Student(53,"Chintu");
		
		for(int i=0; i<=arr.length;i++) {
			System.out.println("element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
		}
	}

}
