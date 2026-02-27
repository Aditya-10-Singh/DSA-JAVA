package Lec18_TEST_3;

public class Q4 {

    public static void main(String[] args) {

        int[] arr = {1,0,0,1,0,1,1};
        int n = arr.length;

        int index = 0;

        // Move all non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining with zero
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
