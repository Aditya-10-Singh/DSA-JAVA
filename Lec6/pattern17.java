package Lec6;
public class pattern17 {
    public static void main(String[] args) {

        int i = 4;

        while (i >= 1) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }

            int space = 10 - (2 * i);
            while (space >= 0) {
                System.out.print(" ");
                space--;
            }

            j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }

            System.out.println();
            i--;
        }
        System.out.println();

        i = 1;
        while (i <= 4) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }

            int space = 10 - (2 * i);
            while (space >= 0) {
                System.out.print(" ");
                space--;
            }

            j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }

            System.out.println();
            i++;
        }
    }
}
