//sum of n natural no.

package Lec9;

import java.util.Scanner;

public class naturalNo 

//RETURN

/*{
    public static int num(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++)
            sum+=i;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
        sc.close();
    }
}*/

//VOID

{
    public static void num(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++) sum+=i;
            System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
        sc.close();
    }
}
