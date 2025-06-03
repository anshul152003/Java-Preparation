package Array;

public class Largest {

//	public static void main(String[] args) {
//		int[] arr = {4,5,7,8,1,4,2};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr[arr.length-1]));
//	}
	
//	 public static void main(String[] args) {
//	     String[] names = {"Charlie", "Alice", "Bob"};
//	     Arrays.sort(names, Collections.reverseOrder());
//	     System.out.println(Arrays.toString(names));  // Output: [Charlie, Bob, Alice]
//	 }
	
	public static void main(String[] args) {
		int[] arr = {4,5,7,8,1,4,2};
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("Max Val: " + max);
	}

}
