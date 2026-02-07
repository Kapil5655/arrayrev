import java.util.ArrayList;

public class IndexOfElement {

    public static  int    indexOfElement(int [] arr, int element){

        //Time - O(n) space - O(1)  we use this
            //    for(int i = 0; i<arr.length; i++){
            //     if(arr[i] == element){
            //         return i;
            //     }
            //    }
            //    return -1;

            //by using arrayList indexOf() time - O(n) space - O(n)
            ArrayList<Integer>list = new ArrayList<>();
            for(int num : arr){
                list.add(num);
            }
      return list.indexOf(element);



    }
    public static void main(String [] args){
        int [] arr = {1,6,3,8,7};
        int element = 7;

        System.out.println(indexOfElement(arr,element));
    }
}
