public class SecondLargest {

//Time - O(n) space - O(1)
    public static void main(String[] args){
        int [] arr = {211,6655,222,15,258,145};
        int largest = arr[0];
        int secondLargset = Integer.MIN_VALUE;
        for(int i = 1; i<=arr.length - 1; i++){
            if(arr[i]>largest){
                secondLargset = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargset){
             secondLargset = arr[i];
            }
        }
        System.out.println("Second largset :"+secondLargset);
    }
}
