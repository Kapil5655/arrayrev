public class SegregateEvenOdd {

    public static void evenLeftOddRight(int[] arr) {

        // Time - O(n) space - O(1)
        // one more method is while traversing array if event counter then store temp
        // array and increase index
        // then for odd then copy values from temp to original array
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 0) {
                i++;
            } else if (arr[j] % 2 != 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 35, 24, 65, 45, 32, 63, 36, 12, 85 };
        evenLeftOddRight(arr);

    }
}
