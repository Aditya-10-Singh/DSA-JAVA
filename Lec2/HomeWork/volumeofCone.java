package HomeWork;

import java.util.Scanner;

public class volumeofCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * r * r * h;
        System.out.println(volume);
    }
}
