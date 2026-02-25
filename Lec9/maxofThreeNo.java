package Lec9;

import java.util.Scanner;

public class maxofThreeNo 

//VOID

/*{
    public static void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        sc.close();
    }
}*/

//RETURN

{
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a, b, c));
        sc.close();
    }
}
