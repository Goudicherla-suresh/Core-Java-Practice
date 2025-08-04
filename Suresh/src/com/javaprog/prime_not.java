package com.javaprog;

public class prime_not {
	
	 public static int find_fact(int num) {
		 int count=0;
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 count ++;
			 }
		 }
		 return count;
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=10000;i++) {
			int num=i;
			int res=find_fact(num);
			if(res==2) {
				System.out.println(num);
		}
		
		
		}
		
	}

}
