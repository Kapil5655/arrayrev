import java.util.ArrayList;

public class DuplicateAndMissing {

    public static ArrayList<Integer> duplicateAndMissingNumbers(int[] arr) {
        int duplicate = -1;
        int missing = -1;
        ArrayList<Integer> list = new ArrayList<>();
        // duplicate
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i] - 1);

            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);



                
                list.add(duplicate);
            } else {
                arr[index] = -arr[index];
            }
        }
        // missing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                list.add(missing);

            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5 };
        ArrayList<Integer> result = duplicateAndMissingNumbers(arr);
        System.out.println(result);
    }
}
