import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args){
        int[] arr ={1,2,1,3,4,5,2,4,5};
      // 1. //basic logic Time-O(n) Space-O(1);
        //if we want to store duplicate and then return all duplicates we use list
        ArrayList<Integer>duplicates = new ArrayList<>();
        // for(int i = 0; i<arr.length - 1; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i]==arr[j] && !duplicates.contains(arr[i])){
        //            duplicates.add(arr[i]);
        //         }
        //     }
        // }
        // for(int x : duplicates){
        //     System.err.print(x+" ");
        // }

      //2. by using sorting  Time - O(nlogn) space - O(n)
        //  Arrays.sort(arr);
        //  for(int i = 0; i<arr.length - 1; i++){
        //    if(arr[i]==arr[i+1]){
        //     duplicates.add(arr[i]);
        //    }
        //  }
        //    for(int x : duplicates){
        //     System.out.print(x+" ");
        //    }

     //3.By using hashmap time O(n) space - O(n)
    //  HashMap<Integer,Integer>map = new HashMap<>();
    //  for(int x : arr){
    //     map.put(x,map.getOrDefault(x,0)+1);
    //  }  
     
    //  for(Integer key : map.keySet()){
    //              if(map.get(key)>1){
    //                 duplicates.add(key);
    //              }
    //  }
    //     System.out.println(duplicates);
         

    // 4. using HashSet time - O(n) time O(n3)

    HashSet<Integer>set = new HashSet<>();
    for(int x : arr){
        if(!set.add(x)){
        duplicates.add(x);
        }
    }
  System.out.println(duplicates);
    }
}
