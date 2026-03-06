//A sorted array representing squares of elements of nums array

package Lec21;

import java.util.Scanner;
import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
