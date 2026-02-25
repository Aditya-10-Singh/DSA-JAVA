package Lec8;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;

        for(int i=2; i<n; i++){
            if(n%i==0){
                prime=0;
                break;
            }
        }
        if(prime==1){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
