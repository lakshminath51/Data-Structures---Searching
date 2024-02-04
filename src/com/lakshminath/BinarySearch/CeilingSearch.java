package com.lakshminath.BinarySearch;

public class CeilingSearch {

	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18}; //ascending
		int target = 8;
		
		int ans  = ceilingSearch(arr, target);
		System.out.println(ans);


	}

	//return the index of smallest no >=target
	static int ceilingSearch(int[] arr, int target) {
		//but what if the target is greater than the greatest number in the array
		if(target > arr[arr.length-1]) {
			return -1;
		}
		
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
		return start;
		
	}
}
