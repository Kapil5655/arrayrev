public class ThirdLargest {
    public static void main(String[] args){
        int[] arr={625,302,411,512,32,64,28};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>largest){
           thirdLargest = secondLargest;
           secondLargest = largest;
           largest = arr[i];
              }

              else if(arr[i]>secondLargest && arr[i]<largest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];

              }
              else if(arr[i]>thirdLargest && arr[i]<secondLargest){
                    thirdLargest = arr[i];
              }
        }
        System.out.println("third largset is :"+thirdLargest);
    }
}
