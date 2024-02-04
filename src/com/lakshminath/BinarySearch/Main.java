package com.lakshminath.BinarySearch;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {-9, -3, 1, 6, 12, 21, 36, 48, 59}; //ascending
		int target = 21;
		
		int ans  = binarySearch(arr, target);
		System.out.println(ans);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target< arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else
				return mid;
		}
		return -1;
		
	}
}
