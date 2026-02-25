package Lec14;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();   

        int n = input.length();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        // Selection Sort
        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}