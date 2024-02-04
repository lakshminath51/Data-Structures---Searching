package com.lakshminath.LinearSearch;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 10, 12, 28, 14, 15 };

		int target = 14;

		int ans = search2(nums, target);
		System.out.println(ans);

	}

	static int search2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		// This line will execute if none of the return statements above have executed
		// hence the target not found
		return -1;

	}

	static int search(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		} 
		// This line will execute if none of the return statements above have executed
		// hence the target not found
		return -1;

	}

	static boolean search3(int[] arr, int target) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return true;
			}
		}
		// This line will execute if none of the return statements above have executed
		// hence the target not found
		return false;

	}
}
