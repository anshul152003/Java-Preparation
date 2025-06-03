package Array;

public class LeftRotateByOne {
	
//	public static void solve(int[] arr, int n) {
//		int temp = arr[0];
//		for(int i=0; i < n-1; i++) {
//			arr[i] = arr[i+1];
//		}
//		arr[n-1] = temp;
//		for(int i=0; i<n; i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		System.out.println();
//	}
//
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11};
		int n = arr.length;
		solve(arr,n);
	}
	
	//Optimal approach
	public static void solve(int[] arr, int n) {
		int temp = arr[0];
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
