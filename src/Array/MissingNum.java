package Array;

public class MissingNum {
	
	public static int missingNum(int[] arr, int n) {
		int sum1 = (n * (n + 1)/2); //sum of first n numbers
		int sum2 = 0;
		for(int i=0; i<n-1; i++) {
			sum2 += arr[i];
		}
		
		int result = sum1 - sum2;
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,6,7,8,9};
		int n = 8;
		
		int ans = missingNum(array,n);
		System.out.println(ans);
	}

}
