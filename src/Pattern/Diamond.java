package Pattern;

public class Diamond {

	public static void main(String[] args) {
		int a, b;

        // Upper half
        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= 5 - a; b++)
                System.out.print(" ");
            for (b = 1; b <= 2 * a - 1; b++) {
                if (b == 1 || b == 2 * a - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower half
        for (a = 4; a >= 1; a--) {
            for (b = 1; b <= 5 - a; b++)
                System.out.print(" ");
            for (b = 1; b <= 2 * a - 1; b++) {
                if (b == 1 || b == 2 * a - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}
