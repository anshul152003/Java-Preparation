package Searching;

public class In1Darray {
	
//	public static int binarySearch(int[] arr, int target) {
//		int left = 0;
//		int right = arr.length-1;
//		
//		while(left <= right) {
//			int mid = left + (right - left) / 2;
//			
//			if(arr[mid] == target) {
//				return mid;
//			} else if(arr[mid] < target) {
//				left = mid + 1;
//			} else {
//				right = mid -1;
//			}
//		}
//		
//		return -1;
//	}
	
	//Recursive approach
	
	public static int binarySearch(int[] arr, int left, int right, int target) {
		if(left > right) {
			return -1;
		}
		
		int mid = left + (right - left) / 2;
		
		if(arr[mid] == target) {
			return mid;
		} else if(arr[mid] < target) {
			return binarySearch(arr,mid+1,right,target);
		} else {
			return binarySearch(arr,left,mid-1,target);
		}
	}

	public static void main(String[] args) {
		int[] sortedArray = {2, 4, 7, 10, 15, 20, 25};
        int target = 10;
        
        int index= binarySearch(sortedArray,0,sortedArray.length-1,target);
        
        if(index != -1) {
        	System.out.println("Element found at index: " + index);
        }
        else {
        	System.out.println("Element not found.");
        }
	}
}