package Array;

public class CheckSorted {
	
	public static void main(String[] args) {
		int[] numbers = {5, 3, 9, 2, 10, 4};
		boolean isSorted = true;
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i] < numbers[i-1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted.");
		}
	}
}
