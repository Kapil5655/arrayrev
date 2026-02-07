import java.util.Arrays;

public class ThreeSum {
    //using sorting+loop time - O(n*n) space - O(1);
    //this can also be done by hashset + loop But it also take time - O(n) 
    // so we prefer sorting because it is easy
         public static boolean threeSum(int []arr,int target){
            int n = arr.length;
            Arrays.sort(arr);
              for(int i=0; i<n-2; i++){
                    int left = 0; 
                    int right = arr.length - 1;
                    while(left<right){
                        int sum = arr[left] + arr[right];
                        if(sum==target){
                            return true;
                        }
                        else if(sum<target){
                            left++;
                        }
                        else{
                            right--;
                        }
                    }   
              }
              return false;
         }
    public static void main(String[] args) {
        int[] arr = {1,2,-1,0,-2,1};
        int target = 5;
        System.out.println(threeSum(arr,target));
    }
}
