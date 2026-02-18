public class MaximumSubarrayOfSizeK {

    public static int  subArraySum(int[] arr,int k){
        int windowSum = 0;
        for(int i = 0; i<k; i++){
            windowSum+= arr[i];
        }
        int maxSum = windowSum;
        for(int i = k; i<arr.length; i++){
                 windowSum+=arr[i]-arr[i-k];

                 maxSum= Math.max(maxSum,windowSum);

        }
        return maxSum;

    }
    public static void main(String[] args){
     int [] arr ={-2,-5,6,4,3,8,-1,0,9};
     int k = 4;

    int maxSum =  subArraySum(arr,k);
    System.err.println("Maximum sum is : "+maxSum);
    }
}
