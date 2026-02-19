public class CountSetBits {

    public static int countSetbits(int num){

        int n = num;
        int count = 0;
        while(n!=0){
            int rem = n%2;
            if(rem==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
    public static void main(String[] args){
        int num = 15;

        int count = countSetbits(num);
        System.out.println("Total no. of 1's in number is :"+count);

    }
}
