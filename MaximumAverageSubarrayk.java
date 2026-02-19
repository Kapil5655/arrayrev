public class MaximumAverageSubarrayk {
    public static double subArraySum(int[] arr, int k) {
        long windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        long maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);

        }
        return (double) maxSum / k;

    }

    public static void main(String[] args) {
        int[] arr = { -2, -5, 6, 4, 3, 8, -1, 0, 9 };
        int k = 4;

        double maxAvg = subArraySum(arr, k);
        System.err.println("Maximum avg is : " + maxAvg);
    }
}
