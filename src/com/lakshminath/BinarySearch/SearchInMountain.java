package com.lakshminath.BinarySearch;

public class SearchInMountain {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,4,3,2};
		int target = 6;
		System.out.println(search(arr, target));
	}

	static int search(int[] arr, int target) {
	
		int peak = peakIndexMountainArray(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peak);
		if(firstTry != -1) {
			return firstTry;
		}
		//try to search in second half
		return orderAgnosticBS(arr, target, peak+1, arr.length-1);
	}
	
	public static int peakIndexMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid+1]) {
				//You are in decreasing part of array
				//this may be the answer, but look at left
				//this is why end!= mid-1
				end = mid;
			}else {
				//You are in ascending part of array
				start = mid+1; //bcz we know mid+1 element > mid element. Hence we are ignoring mid element
			}
		}
		
		//In the end, start==end and pointing to the largest number bcz of 2 checks
		//start and end are always trying to find max element in the above 2 checks
		//hence when they are pointing to just one  element, that is the max one bcz that is what the checks say
		//more elaboration : At every point of start and end, they have the best possible answer till that time.
		//and if we are saying that only one item is remaining , hence bcz of above line that is the best possible answer.
		return start; //or return end as both are equal
	}
	
	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
	//	int start = 0;
	//	int end = arr.length-1;
		
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
