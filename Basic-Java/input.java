import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //how to take input in java
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //inputs only the first word or token from a line
        //String name = sc.nextLine(); //inputs the entire line 
        //String name = sc.nextInt(); //inputs integer 
        //String name = sc.nextFloat(); //inputs floating type of numbers (decimal numbers)
        System.out.println(name);
    }    
}
