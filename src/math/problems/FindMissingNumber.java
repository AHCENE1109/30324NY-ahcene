package math.problems;

import java.util.Arrays;

public class FindMissingNumber<total, sum> {

//    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */

//        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

    // Find the missing number in a given array
    public static int getMissingNumber(int[] arr)
    {
        // get the array's length
        int n = arr.length;

        // the actual size is `n+1` since a number is missing from the array
        int m = n + 1;

        // get a sum of integers between 1 and `n+1`
        int total = m * (m + 1) / 2;

        // get an actual sum of integers in the array
        int sum = Arrays.stream(arr).sum();

        // the missing number is the difference between the expected sum
        // and the actual sum
        return total - sum;
    }

    public static void main(String[] args)
    {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

        int[] arr = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number is " + getMissingNumber(arr));
    }
}









