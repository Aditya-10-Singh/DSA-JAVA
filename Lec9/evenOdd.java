package Lec9;
import java.util.Scanner;
public class evenOdd 

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}

//VOID
/*{
    public static void evenOdd(int n) {
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
}/*

//RETURN

{
    public static boolean evenOdd(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenOdd(n));
        sc.close();
    }
}*/
