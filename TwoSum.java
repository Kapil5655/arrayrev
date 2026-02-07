
// import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    // 1. //by using loop time-O(n*n) space - O(1)
    // public static boolean sumPresent(int[] arr, int target){
    // for(int i = 0; i<arr.length; i++){
    // for( int j = i+1; j<arr.length; j++){
    // int sum = arr[i]+ arr[j];
    // if(target==sum){
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // By Sorting+two-pointer time-O(nlogn) space - O(1)
    // public static boolean sumPresent(int[] arr, int target){
    // Arrays.sort(arr);
    // int i = 0;
    // int j = arr.length-1;
    // while(i<j){
    // int sum = arr[i]+ arr[j];
    // if(sum==target){
    // return true;
    // }
    // else if(sum<target){
    // i++;
    // }
    // else{
    // j--;
    // }
    // }
    // return false;
    // }

    // 3. using hashSet time - O(n)
    public static boolean sumPresent(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            int complement = target - x;
            if (set.contains(complement)) {
                return true;
            }
            set.add(x);
            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 6, 8, 5, 4 };
        int target = 9;
        System.out.println(sumPresent(arr, target));
    }
}
