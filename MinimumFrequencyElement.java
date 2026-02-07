import java.util.HashMap;

public class MinimumFrequencyElement {
    public static void elementOfMinFreq(int [] arr){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);

        }

        // int element = arr[0];
        int minFreq = Integer.MAX_VALUE;
        for(int x : map.keySet()){
          if(map.get(x) <minFreq){
            minFreq = map.get(x);
        //    element = x;
          }
        }
        //if interviewer asks all minimum frequency elements
        for(int num : arr){
            if(map.get(num) ==minFreq){
                System.out.println(num);
            }
        }
//    System.out.println(element);

    }
    public static void main(String []  args){
        int[] arr = {6,5,3,5,9,6,5};
        elementOfMinFreq(arr);
    }
}
