public class ConvertToBinary {

    public static String converttoBinary(int num){
        int n = num;
    //    int count = 0;
      String result="";
        while(n!=0){
            int rem = n%2;
             result+=rem;
             n/=2;
        }
        return new StringBuilder(result).reverse().toString();

    }
    public static void main(String[] args){
        int num = 10;
       String ans =  converttoBinary(num);
       System.out.println(ans);
    }
}
