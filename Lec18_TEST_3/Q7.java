package Lec18_TEST_3;

public class Q7 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int s = 0; s < 2 * i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
