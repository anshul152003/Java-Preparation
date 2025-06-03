package Array;

import java.util.*;

public class MoveZeroToEnd {
	
	public static int[] moveZeros(int[] arr, int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				temp.add(arr[i]);
			}
		}
		
		int nz = temp.size();
		
		for(int i=0; i<nz; i++) {
			arr[i] = temp.get(i);
		}
		
		for(int i=nz; i<n; i++) {
			arr[i] = 0;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,2,0,0,4,5,1,2};
		int n = arr.length;
		int[] ans = moveZeros(arr, n);
		for(int i=0; i<n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

}
