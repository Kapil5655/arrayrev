public class MissingNumber {
    public static void main(String[] args){

    //if it is given in question that array is 1-based indexing then loop start from 1 itself 
    //if
    //it is given that arary is 0-based indexing then loop start from 0 

        int [] arr = {1,2,3,4,6};
        int n = 6;
        //by formula
        // int totalSum = (n*(n+1))/2;
        // int sum = 0;

        // for(int x : arr){
        //     sum+= x;
        // }
        // int missingNumber = totalSum - sum;
        // System.out.println(missingNumber);

        //by using XOR
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 1; i<=n; i++){
            xor1^= i;

        }
        for(int x : arr){
            xor2^=x;
        }
        int missing = xor2^xor1;
        System.out.println(missing);
    }
}
