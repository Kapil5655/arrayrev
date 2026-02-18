class PivotIndex {

    public static int pivotIndex(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };

     int index =    pivotIndex(arr);
     System.out.println("Pivot Index is : "+index);
    }
}