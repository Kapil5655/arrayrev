import java.util.ArrayList;

public class ElementExists {

    public static boolean  existsOrNot(int [] arr,int element){
        

        //array does not use direct contains we use arraylist for that

            // for(int i = 0; i<arr.length; i++){
            //  if(arr[i] == element){
            //     return true;
            //  }
            // }
            //   return false;

            ArrayList<Integer>list = new ArrayList<>();
            for(int num : arr){
                list.add(num);
            }
         return list.contains(element);
    }
    public static void main(String [] args){
        int [] arr = {1,4,3,8,5};
        int element = 8;
        System.out.println(existsOrNot(arr,element));

    }
}
