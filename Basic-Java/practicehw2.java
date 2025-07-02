import java.util.Scanner;

public class practicehw2 {
    public static void main(String[] args) {
        //make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(radius);
        System.out.println(3.14 * radius);
    }
    
}
