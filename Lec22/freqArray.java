//count frequency, then return the element whose frequency = 1

package Lec22;

public class freqArray {
        public static void main(String[] args) {

        int[] arr = {2,2,3,3,1,1,6};
        int[] freq = new int[100];   

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(freq[arr[i]] == 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
