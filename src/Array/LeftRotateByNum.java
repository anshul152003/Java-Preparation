package Array;

public class LeftRotateByNum {
	
	public static void Reverse(int[] arr, int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void RotateToLeft(int[] arr, int n, int k) {
		//reverse first k elements
		Reverse(arr, 0, k-1);
		//reverse last n-k elements
		Reverse(arr, k, n-1);
		//reverse whole array
		Reverse(arr, 0, n-1);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		int k = 2;
		RotateToLeft(arr,n,k);
		System.out.print("After rotatation: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
