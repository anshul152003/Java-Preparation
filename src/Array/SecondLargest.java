package Array;

public class SecondLargest {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 9, 2, 10, 4};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			if(num > first) {
				second = first;
				first = num;
			}
			else if(num > second && num != first) {
				second = num;
			}
		}
		
		if(second == Integer.MIN_VALUE) {
			System.out.println("No Sec. Largest element founf");
		}
		else {
			System.out.println("seoncd lagest " + second);
		}
	}

}
