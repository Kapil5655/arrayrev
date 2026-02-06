import java.util.HashMap;

public class FrequencyOfElements {

    public static void frequencyCount(int [] arr){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
                }

                for(int key : map.keySet()){
                    System.out.println(key+"-->"+map.get(key));
                }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,3,2,2,1,5,4,3};
        frequencyCount(arr);
    }
}
