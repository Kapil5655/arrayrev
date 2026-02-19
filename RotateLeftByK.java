class RotateLeftByK{

    public static void rotateleftByK(int[] arr, int a , int j){
   
 
        //reverse whole array
       while(a<j){
         int temp = arr[a];
         arr[a] = arr[j];
         arr[j] = temp;
         a++;
         j--;
       }
      
        }
     


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int k = 3;
        int n = arr.length;
        k = k%n;
         for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateleftByK(arr,0,k-1);
          rotateleftByK(arr,k,n-1);
            rotateleftByK(arr,0,n-1);
              for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
        }

