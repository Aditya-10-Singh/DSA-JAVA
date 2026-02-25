package Lec4;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        /*int row = 1;

        while (row <= n) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }*/
    }
}
