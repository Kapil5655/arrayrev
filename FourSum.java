import java.util.Arrays;

public class FourSum {
    //using sorting+loop time - O(n*n) space - O(1);
    //this can also be done by hashset + loop But it also take time - O(n) 
    // so we prefer sorting because it is easy
         public static boolean fourSum(int []arr,int target){
            int n = arr.length;
            Arrays.sort(arr);
              for(int i=0; i<n-3; i++){
                  for(int j = i+1; j<n-2; j++){
                      int left = j+1; 
                    int right = arr.length - 1;
                    while(left<right){
                        int sum = arr[left] + arr[right] + arr[i] + arr[j];
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
              }
              return false;
         }
    public static void main(String[] args) {
        int[] arr = {2,2,2,2};
        int target = 8;
        System.out.println(fourSum(arr,target));
    }
}

