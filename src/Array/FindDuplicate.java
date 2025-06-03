package Array;

//import java.util.HashSet;

public class FindDuplicate {
	
	public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 5, 1, 7};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
	
//	public static void findDuplicate(int[] arr) {
//		HashSet<Integer> set = new HashSet<>();
//		for(int num : arr) {
//			if(!set.add(num)) {
//				System.out.println("Duplicate found: " + num);
//				return;
//			}
//		}
//		System.out.println("No duplicate");
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {1,2,4,5,2,1,3};
//		findDuplicate(arr);
//	}

}
