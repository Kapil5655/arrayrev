public class LargestElement {
    public static void main(String[] args){
        int[] arr ={25,645,465,2032,0,84};
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
}
