package Day05;//Find the maximum sum subarray of size k
//use sliding window when asked for subarray with k value



public class Slidingwindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        for(int i = 0; i < k; i++) {//2
            windowSum += arr[i];//8
        }

        int maxSum = windowSum;//8

        for(int i = k; i < arr.length; i++) {//5
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);//10
        }

        System.out.println(maxSum);
    }
}