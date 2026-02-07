public class EvenOdd {

    public static void countEvenOdd(int[] arr){
                   //n&1 = 0 even
                   //n&1 = 1 odd

        int evenCount = 0;
        int oddCount = 0;
        for(int i =0; i<=arr.length-1; i++){
            if((arr[i]&1) == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count "+evenCount);
            System.out.println("Odd count "+oddCount);


    }
    public static void main(String[] args){
        int[] arr = {1,25,35,84,78,65,32,23,63,36};

        countEvenOdd(arr);
    }
}
