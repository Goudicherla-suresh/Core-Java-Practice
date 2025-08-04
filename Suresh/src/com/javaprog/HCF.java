package com.javaprog;

public class HCF {
	
	public static int find_hcf(int a, int b) {
		int hcf= 1;
		int s=(a<b)?a:b;
		for(int i=1; i<s;i++) {
			if(a%i==0 && b%i==0) {
				 hcf=i;
			}
		}
		return hcf;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int res= find_hcf(12 ,24);
		 System.out.println(res);
	}

}
