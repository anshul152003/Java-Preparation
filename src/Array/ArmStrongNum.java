package Array;

public class ArmStrongNum {

//	 static boolean isArmstrong(int num) {
//	        int original = num;
//	        int sum = 0;
//	        int digits = String.valueOf(num).length();
//
//	        while (num > 0) {
//	            int digit = num % 10;
//	            sum += Math.pow(digit, digits);
//	            num /= 10;
//	        }
//
//	        return sum == original;
//	    }
	
		static boolean isArmstrong(int num) {
			int originalNum = num;
			int numDigits = 0;
			int temp = num;
			while(temp > 0) {
				temp = temp/10;
				numDigits++;
			}
			
			int sum = 0;
			temp = num;
			while(temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, numDigits);
				temp = temp / 10;
			}
			return sum == originalNum;
		}

	    public static void main(String[] args) {
	        System.out.println("Armstrong numbers between 1 and 1000:");
	        for (int i = 1; i <= 1000; i++) {
	            if (isArmstrong(i)) {
	                System.out.println(i);
	            }
	        }
	    }

}
