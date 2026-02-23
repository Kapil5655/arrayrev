public class RemoveDuplicatedFromSortedArray {

    public static int removeDuplicate(int [] arr){
        int i = 0;
        int j = i+1;
        while(j<=arr.length-1){
            if(arr[j]==arr[i]){
                j++;
            }
            else{
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4,4,5,5};
        int len = removeDuplicate(arr);
        for(int i = 0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
