// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
       public static void main(String[] args){
        int [] arr = {1,2,3,4,1,3,5,6,2,6,7,7};
        // ArrayList<Integer>list = new ArrayList<>();
    //    1. //by using sorting time O(nlogn) space - O(n)
        // Arrays.sort(arr);
        // for(int i = 0; i<arr.length-1; i++){
        //       if(arr[i]!=arr[i+1]){
        //         list.add(arr[i]);
        //       }
        // }
        // list.add(arr[arr.length-1]);
        // System.out.println(list);
        

        // 2. by using hashset time - O(n) space - O(n)
        HashSet<Integer>set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }

        System.out.println(set);




       }
}
