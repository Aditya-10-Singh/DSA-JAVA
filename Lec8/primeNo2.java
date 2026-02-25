package Lec8;

import java.util.Scanner;

public class primeNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;

        for(int i=3; i<n; i++){
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }        
            if(prime==1){
                System.out.println(i);

            }
        }
        sc.close();
    }
}
