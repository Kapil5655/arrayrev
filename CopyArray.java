

public class CopyArray {
    public static void main(String [] args){
    //    1. //for loop interview preffered
        int [] arr1 = {1,2,3,4,5,35};
        // int[] arr2 = new int[arr1.length];
        // for(int i = 0; i<arr1.length; i++){
        //     arr2[i] = arr1[i];

        // }
        // for(int x : arr2){
        //     System.out.print(x+" ");
        // }
     
    // 2. System.arrcopy() method
    //syntax - System.arraycopy(source,srcPos,dest,destPOs, length);
    // System.arraycopy(arr1,0,arr2,0,arr1.length);

    // for(int x : arr2){
    //      System.out.print(x+" ");
    // }

  // 3.clone method
  int []arr2 = arr1.clone();
  for(int x  : arr2){
    System.out.print(x + " ");
  }



    

    }
}
