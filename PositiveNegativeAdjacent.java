public class PositiveNegativeAdjacent {

    public static int[]  postivenegativeAdjacent(int[] arr){
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        int[] res = new int[n];
        for(int num : arr){
            if(num>0){
                res[pos] = num;
                pos+=2;
            }
            else{
                res[neg] = num;
                neg+=2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
          int[] arr = {2,-5,3,4,-6,-8,-4,8};
   
  
      for(int num : arr){
        System.out.print(num+" ");
    }
    System.out.println();
    int[] nums =  postivenegativeAdjacent(arr);
    for(int num : nums){
        System.out.print(num+" ");
    }
    }
  
}
