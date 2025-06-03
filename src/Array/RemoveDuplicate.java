package Array;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 2, 5, 4, 6, 7};
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : numbers) {
			set.add(num); //duplicates automatically removed
		}
		
		int[] unique = new int[set.size()];
		int i = 0;
		for(int num : set) {
			unique[i++] = num;
		}
		
		System.out.println(Arrays.toString(unique));
	}

}
