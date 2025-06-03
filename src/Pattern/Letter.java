package Pattern;

public class Letter {

	public static void main(String[] args) {
		int n = 5;

        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 0; j < i; j++) {
                row += (char)(65 + j) + " ";
            }
            System.out.println(row);
        }
	}

}
