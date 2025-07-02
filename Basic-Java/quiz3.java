import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        //take two variables a & b and print their sum using scanner
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);//if we write sum within double quotes then it prints sum not the value after addition; so no double quotes is required 
    }
    
}
