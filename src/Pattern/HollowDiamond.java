package Pattern;

public class HollowDiamond {

    public static void main(String[] args) {
    	int size = 5;
        // Upper half
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size - row; col++)
                System.out.print(" ");
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower half
        for (int row = size-1; row >= 1; row--) {
            for (int col = 1; col <= size - row; col++)
                System.out.print(" ");
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
