//find missing no. [3, 1, 0]; OUTPUT: 2

package Lec18_TEST_3;

public class Q1 {
    public static void main(String[] args) {
        
        int[] nums = {3, 1, 0};
        
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        
        int missing = expectedSum - actualSum;
        
        System.out.println(missing);
    }
}
