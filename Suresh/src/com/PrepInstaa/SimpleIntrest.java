package com.PrepInstaa;
import java.util.*;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle Amount:");
		int P=sc.nextInt();		
		System.out.println("Enter the Tenure Amount:");
		double T=sc.nextDouble();
		System.out.println("Enter the Rate Amount:");
		double R=sc.nextDouble();
//		int p;
//		double t;
//		double r;
		
		System.out.println("The Principle Amount is " + P);
		System.out.println("The Tenure Amount is " + T);
		System.out.println("The Rate Amount is " + R);

		double res=(P*T*R)/100;
		System.out.println("The Total Amount Is " + res);
		double total=res+P;
		System.out.println("The Total Due Amount:" + total);

	}

}
