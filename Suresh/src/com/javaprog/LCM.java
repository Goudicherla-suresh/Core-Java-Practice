package com.javaprog;

public class LCM {

		public static int find_lcm(int a, int b) {
			int lcm=1;
			
			int h=(a>b)?a:b;
			for(int i=h;i<=(a*b);i++) {
				if(i%a==0 && i%b==0) {
				lcm=i;
					break;
				}
			}
			return lcm;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int res=find_lcm(10,15);
			
			System.out.println(res);
	}

}
