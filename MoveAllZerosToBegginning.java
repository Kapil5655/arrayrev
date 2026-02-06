public class MoveAllZerosToBegginning {
    public static void moveToBegggining(int [] arr){
           int i = 0; 
           int j = arr.length-1;
           while(i<j){
            if(arr[i]==0){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--; 
            }
           }


    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,2,0,0,3,0,0,5,0};
        moveToBegggining(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
