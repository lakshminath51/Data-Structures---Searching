package com.lakshminath.LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {

		int[] num = {18, 12, -7, 3, 14, 28};
		int target = 12;
		int start = 1;
		int end = 4;
		
		int ans  = search(num, target, start, end);
		System.out.println(ans);
		
	}
	
	static int search(int[] arr, int target, int start, int end) {
		if(arr.length == 0 ) {
			return -1;
		}
		
		for(int i = start; i<=end ; i++) {
			int element = arr[i];
			if(element == target) {
				return i;
			}
		}
		return -1;
		}

}
