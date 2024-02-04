package com.lakshminath.BinarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		//int[] arr = {-18, -12, -4, 0 , 4, 12, 22, 34, 45, 56, 79};
		int[] arr = {99, 80, 75, 63, 22, 11, 5, 2, -3, -23};
		int target = 22;
		
		int ans = orderAgnosticBS(arr, target);
		System.out.println(ans);
		
	}
	
	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
//		boolean isAsc;
//		if(arr[start]<arr[end]) {
//			isAsc=true;
//		}else {
//			isAsc=false;
//		}
		
		//find whether the array is sorted in ascending or descending order
		boolean isAsc = arr[start]<arr[end];
			
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target< arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else {
				if(target> arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
	}
		return -1;
	}

}
