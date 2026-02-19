public class SortColors {

    public static int[] sortColors(int[] arr){
            int i = 0;
            int j = arr.length-1;
            int index = 0;
            while(index <= j){
                if(arr[index]==0){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    i++;
                    index++;
                }
                else if(arr[index]==1){
                    index++;
                }
                else{
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    j--;
                }

            }
            return arr;
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,0,0,1,1,2,2,0,1,2,0};
       arr =  sortColors(arr);
     for(int x : arr){
        System.out.print(x+ " ");
     }

    }
}
