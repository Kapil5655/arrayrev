public class MaximumVowelSubstringk {
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
       public static int maximumVowels(String s, int k){
              int count = 0;
              for(int i = 0; i<k; i++){
                if(isVowel(s.charAt(i))) count++;
              }

              int maxVowels = count;
              for(int i = k; i<s.length(); i++){
                if(isVowel(s.charAt(i))) count++;
                if(isVowel(s.charAt(i-k))) count--;
              }

              maxVowels = Math.max(maxVowels,count);
              return maxVowels;
       }

    public static void main(String[] args){
     String s = "thisisalongx";
    int k = 4;
    int max = maximumVowels(s,k);
    System.out.println(max);
    }
   

}
