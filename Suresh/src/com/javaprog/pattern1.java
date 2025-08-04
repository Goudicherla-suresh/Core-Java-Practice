package com.javaprog;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//
//			for(int j=1; j<=5; j++) {
//				
//				System.out.print("*"+" ");
//		
//			}
//			System.out.println();
//		}
		
		
//			

		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=5;j++) {
				
				if(i==0|| j==0 || i==4 || j==4) {
					System.out.print(" * ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
		
	}


}
