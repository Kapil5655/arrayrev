public class MisssingSortedArray {

    public static int  missinginSortedArray(int[] arr){
        int s = 0;
        int e = arr.length -1;
        int ans = arr.length +1;
      while(s<=e){
        int mid = s+(e-s)/2;
        int diff = arr[mid] - (mid+1);
        if(diff==0){
            s= mid+1;
        }
        else{
            ans = mid+1;
            e= mid-1;
        }

      }
      return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7};
   


        System.out.println(missinginSortedArray(arr));

    }
}
