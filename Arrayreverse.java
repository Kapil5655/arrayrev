import java.util.Stack;

public class Arrayreverse{

    public static void main(String[] args){

        // by Two -pointer Time complexity _ O(n) space : O(1)

        int[] arr={1,2,3,4,5};
       
        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;

        //     i++;
        //     j--;
        // }
        // for(int x : arr){
        //     System.out.print(x+" ");
        // }


        //bY - stack time - O(n) space - O(n)
        Stack<Integer>st =  new Stack<>();

        for(int i = 0; i<=arr.length - 1; i++){
            int element = arr[i];
            st.push(element);
        }
        while(!st.isEmpty()){
            int element = st.peek();
            st.pop();
            System.out.print(element+" ");

        }


    }
}

