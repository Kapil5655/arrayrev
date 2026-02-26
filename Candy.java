public class Candy {

    public static int distributeCandies(int [] ratings){
       int n = ratings.length;
       int[] candies = new int[n];


       //step 1: fill array with initial 1
       for(int i = 0; i<candies.length; i++){
        candies[i] = 1;
       }

       //step 2 : Left to right
        for(int i = 1; i<n; i++){
        if(ratings[i]>ratings[i-1]){
            candies[i] = candies[i-1]+1;
        }
        }

       //step 3 : right to left
       for(int i = n-2; i>=0; i--){
        if(ratings[i]>ratings[i+1]){
         candies[i] = Math.max(candies[i],candies[i+1]+1);
        }
       }

       //step 4 : sum of candies
       int sum = 0;
       for (int i : candies) {
            sum+=i;
       }

       return sum;

    }
    public static void main(String[] args){
        int[] ratings ={1,3,2,2,1};

        int totalCandy = distributeCandies(ratings);
        System.out.println("Total candies are : "+ totalCandy);
    }
}