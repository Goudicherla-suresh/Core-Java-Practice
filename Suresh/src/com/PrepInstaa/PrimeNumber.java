package com.PrepInstaa;

public class PrimeNumber {

	

	public static void main(String[] args) {
	     
	      int n=97;
	      boolean isprime=true;
	      
	      if(n<2){
	          isprime=false;
	      }
	      else{
	          for(int i=2;i<n;i++){
	              if(n%i==0){
	                  isprime=false;
	                  break;
	              }
	          }
	      }
	      String Result=isprime?"Prime":"Not a Prime";
	      System.out.println("The Number " + n + " a " + Result );
	}

}
