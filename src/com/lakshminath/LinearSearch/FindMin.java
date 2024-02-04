package com.lakshminath.LinearSearch;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = {13, 7, 4, 59, 1, -5, 100};
		System.out.println(min(arr));

	}
	
	static int min(int[] arr) {
		int ans = arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			
			if(arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
