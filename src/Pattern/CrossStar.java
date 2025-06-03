package Pattern;

public class CrossStar {

	    public static void main(String[] args) {
	        int n = 7;

	        for (int i = 0; i < n; i++) {
	            StringBuilder str = new StringBuilder();
	            for (int j = 0; j < n; j++) {
	                if (i == j || i + j == n - 1) {
	                    str.append("* ");
	                } else {
	                    str.append("  ");
	                }
	            }
	            System.out.println(str.toString());
	        }
	    }
}
