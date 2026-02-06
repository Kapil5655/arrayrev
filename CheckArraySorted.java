public class CheckArraySorted {

    public static boolean sortedOrNot(int[]arr){

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        
        if(sortedOrNot(arr)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
        
    }
}
