package Lec5;   
import java.util.Scanner;
class pattern12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row = 1;
        int space = 2*n-3;
        int star = 1;
        while (row <= n){
            int k = 1;
            while (k <= star){
                System.out.print("* ");
                k++;
            }
            int i=1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            if(row == n) star--;
            int j = 1;
            while (j <= star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space-=2;
            star++;
            row++;
        }
        sc.close();        
    }
}
