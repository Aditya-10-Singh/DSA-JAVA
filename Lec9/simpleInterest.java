package Lec9;

import java.util.Scanner;

public class simpleInterest 

//VOID

/*{
    public static void SI(int p, int r, int t){
       System.out.println(p*r*t/100); 
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        SI(p, r, t);
        sc.close();
    }    
}*/

//RETURN

{
    public static int SI(int p, int r, int t){
       return p*r*t/100; 
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(SI(p, r, t));
        sc.close();
    }  
}
