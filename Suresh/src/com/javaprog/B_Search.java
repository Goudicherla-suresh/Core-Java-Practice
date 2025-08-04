package com.javaprog;

public class B_Search {
	
		public static int binary_search(int arr[],int key) {
			int left=0;
			int right=arr.length-1;
			
			while(left<=right) {
				
			
			int mid=(left+right)/2;
			if(arr[mid]==key) {
				return mid;
//				System.out.println(mid);
//				break;
			}
			else if(key>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
			return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,12,24,33,80,92};
		int key=33;
		int ind=binary_search(arr,key);
		System.out.println(ind);

	}

}
