public class SumOfElements {
    public static int totalSum(int[] arr){
                   //n&1 = 0 even
                   //n&1 = 1 odd

        int sum = 0;
        for(int i =0; i<=arr.length-1; i++){
           sum+= arr[i];
        }
        return sum;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        System.out.println(totalSum(arr));
    }
}
