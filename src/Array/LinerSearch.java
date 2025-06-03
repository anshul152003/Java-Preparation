package Array;

public class LinerSearch {
	
	public static int linearSearch(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10, 25, 30, 45, 50, 65};
		int key = 30;
		int index = linearSearch(arr, key);
		
		if(index != -1) {
			System.out.println(index);
		}
		else {
			System.out.println("Not found");
		}
	}

}
