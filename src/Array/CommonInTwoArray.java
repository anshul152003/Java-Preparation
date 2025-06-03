package Array;

//import java.util.HashSet;

public class CommonInTwoArray {
	public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 9};
        int[] arr2 = {2, 4, 5, 8, 10};

        System.out.println("Common elements:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

//	public static void findCommon(int[] arr1, int[] arr2) {
//		HashSet<Integer> set = new HashSet<>();
//		for(int num : arr1) set.add(num);
//		for(int num : arr2) {
//			if(set.contains(num)) {
//				System.out.println("Common Element: " + num);
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr1 = {1,4,2,5,7,9};
//		int[] arr2 = {4,5,1,7,2,6};
//		
//		findCommon(arr1, arr2);
//	}