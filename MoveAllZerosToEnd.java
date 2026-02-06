public class MoveAllZerosToEnd {
    public static void zerosToEnd(int[] arr){

        //time - O(n) space-O(1)
        int i = 0; 
        int j = arr.length-1;
        while(i<j){
            if(arr[i]!=0){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp;
                
                j--;
            }
        }
       
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,3,0,0,4,5};
        zerosToEnd(arr);
         for(int x : arr){
        System.out.print(x+" ");
        }
    }
}
