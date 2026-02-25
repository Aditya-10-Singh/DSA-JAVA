package Lec14;
import java.util.*;
public class insertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int n = input.length();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        // Insertion Sort
        for(int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}

