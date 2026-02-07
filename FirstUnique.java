import java.util.HashMap;

public class FirstUnique {
     public static void uniqueNumber(int [] arr){

       
  
      HashMap<Integer,Integer>map = new HashMap<>();
      for(int num : arr){
        map.put(num,map.getOrDefault(num,0)+1);

      }
      //print unique elements
      for(int x : arr){
        if(map.get(x) == 1){
            System.out.println(x);
            break;
        }
      }

    }
    public static void main(String[] args){
        int[] arr = {6,5,3,5,9,6,5};


        uniqueNumber(arr);
    }
}
