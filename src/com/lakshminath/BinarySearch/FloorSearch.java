package com.lakshminath.BinarySearch;

public class FloorSearch {

	public static void main(String[] args) {

		int[] arr = {2,3,5,9,14,16,18}; //ascending
		int target = 1;
		
		int ans  = floorSearch(arr, target);
		System.out.println(ans);
	}

	//return the index of greatest no <=target
		static int floorSearch(int[] arr, int target) {
			
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
			return end;
			
		}
}
