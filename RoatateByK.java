class RotateByK{

    public static void rotateLeftByK(int[] arr, int i , int j){
   
 
        //reverse whole array
       while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
      
        }
     


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        k = k%n;
         for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateLeftByK(arr,0,k-1);
          rotateLeftByK(arr,k,n-1);
            rotateLeftByK(arr,0,n-1);
              for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
        }
