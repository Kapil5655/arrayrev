import java.util.ArrayList;
import java.util.HashSet;

public class MultipleMissing {

    public static ArrayList<Integer> missingNumbers(int[] arr, int n){
        // boolean[] visited = new boolean[n+1];
        // for(int num : arr){
        //     visited[num] = true;
        // }

        // for(int i = 1; i<=n; i++){
        //     if(!visited[i]){
        //         System.out.println("missing " + i);
        //     }
        // }

        //using hashset
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i = 1; i<=n; i++){
            if(!set.contains(i)){
               list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int [] arr = {1,2,4,6,7};
        int n = 7; 

      ArrayList<Integer>result =   missingNumbers(arr, n);
      System.out.println("Missing numbers are : "+result);
    }
}
