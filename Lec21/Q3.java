//A single integer denoting the number of ways to make target amount

package Lec21;

import java.util.Scanner;

public class Q3 {

    public static int countWays(int[] coins, int n, int target) {
        int[] dp = new int[target + 1];

        dp[0] = 1; 

        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= target; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = countWays(coins, n, target);

        System.out.println(result);

        sc.close();
    }
}