import java.util.HashMap;

public class MaximumFrequencyElement {
    public static void elementOfMaxFreq(int [] arr){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);

        }

        int element = arr[0];
        int maxFreq = 0;
        for(int x : map.keySet()){
          if(map.get(x) >maxFreq){
            maxFreq = map.get(x);
           element = x;
          }
        }
   System.out.println(element);

    }
    public static void main(String []  args){
        int[] arr = {6,5,3,5,9,6,5};
        elementOfMaxFreq(arr);
    }
}
