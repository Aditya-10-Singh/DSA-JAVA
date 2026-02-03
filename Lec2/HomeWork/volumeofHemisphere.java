package HomeWork;

import java.util.Scanner;

public class volumeofHemisphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double volume = (2.0 / 3) * Math.PI * r * r * r;
        System.out.println(volume);
    }
}


