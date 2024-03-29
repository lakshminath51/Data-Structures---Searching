package com.lakshminath.BinarySearch;

public class StartingAndEndingPosition {

	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int[] ans = searchRange(nums, target);
		System.out.println(ans);
	}

	public static int[] searchRange(int[] nums, int target) {
		
		int[] ans = {-1, -1};
		//Check for first occurrence if target first
	//	int start = search(nums, target, true);
	//  int end  = search(nums, target, false);
		
		ans[0] = search(nums, target, true);
		if(ans[0] != -1) {
		ans[1] = search(nums, target, false);
		}
	//	ans[0] = start;
	//	ans[1] = end;
		
		return ans;
		
		
	}
	
	//this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]){
				start = mid + 1;
			}else {
				//potential answer found
				ans = mid;
				if(findStartIndex == true) {
					end = mid -1;
				}else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
