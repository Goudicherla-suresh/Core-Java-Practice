package com.javaprog;

public class reversenumber {
	
	public static int reverse(int num) {
		
		int res=0;
		while(num!=0) {
			int rem= num%10;
			 res=(res*10)+rem;
			num=num/10;
	}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++) {
		int num=i;
		int res= reverse(num);
			if(num==res) {
				System.out.println(num);
			}
		}
			


}
}