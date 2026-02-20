public class PeakElement{
      public static int peakElement(int[] arr){
        int n = arr.length;
        int s= 0;
        int e = n-1;
        while(s<e){
            int mid = s+(e-s)/2;

            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s;
      }
    public static void main(String[] args){
        int [] arr = {1,2,1,3,5,6,4};
       System.out.println(peakElement(arr));
    }
}