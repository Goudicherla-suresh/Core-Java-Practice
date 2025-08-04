package com.javaprog;

public class recursion {
	
			public static int rev_rec(int num, int res) {
				if(num==0) {
					return res;
				}
				return rev_rec(num/10,(res*10)+(num%10));
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=352;
		int res=0;
		int rev=rev_rec(num,res);
		System.out.println(rev);
	}

}
