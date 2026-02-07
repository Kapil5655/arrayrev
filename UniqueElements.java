import java.util.HashMap;

public class UniqueElements {

    public static void uniqueNumber(int [] arr){

        // 1 .ya tabhi work kargega jab uniue 1 baar ho aur baaki sab exactly 2 baar aye
    //     int unique = 0;
    //     for(int i  = 0; i<arr.length; i++){
    //         unique^=arr[i];
    //     }
    //   System.out.println(unique);
    // }

     // 2. using hashmap
      HashMap<Integer,Integer>map = new HashMap<>();
      for(int num : arr){
        map.put(num,map.getOrDefault(num,0)+1);

      }
      //print unique elements
      for(int x : arr){
        if(map.get(x) == 1){
            System.out.println(x);
        }
      }

    }
    public static void main(String[] args){
        int[] arr = {6,5,3,5,9,6,5};


        uniqueNumber(arr);
    }
}
