import java.util.Scanner;

public class practicehw1 {
    public static void main(String[] args) {
        //try to declare meaningful variables of each type. eg - a variable named age should be a numeric type (int or float) not byte
        Scanner sc = new Scanner(System.in); 
        int age = 10;
        int num = sc.nextInt();
        float value = sc.nextFloat();
        double price = sc.nextDouble();
        String name = sc.nextLine();
        System.out.println(num);
        System.out.println(age);
        System.out.println(value);
        System.out.println(price);
        System.out.println(name);

    }
    
}
