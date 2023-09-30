package lab_03_homework;

import java.util.Scanner;

public class Lab34 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Merge 2 SORTED integer array into one SORTED array
         *   Array 01: {1, 12, 16, 28, 34}
         *   Array 02: {1, 13, 16, 27, 99}
         *   Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
         * */


        /* ANSWER
         * Create the common sort method
         * Declare array 01 from keyboard
         * Using the sort method -> Sort array 01 from min to max
         * Declare array 02 from keyboard
         * Using the sort method -> Sort array 02 from min to max
         * Declare new array with length = length of array 01 + length of array 02
         * Declare index variable of new array
         * Loop array 01 from index 0 to the end of array -> Assign element of array 01 to new array
         * Increase index of new array
         * Loop array 02 from index 0 to the end of array -> Continue assign element of array 02 to new array
         * Increase index of new array which start from the end index of array 01
         * Loop new array from index 0 to the end of new array
         * Print new array after merging array 01 + array 02
         * Using sort method -> Sort new array from min to max
         * Loop new array from index 0 to the end of new array
         * Print new array which sorted from min to max
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input length of array 01: ");
        int lengthArr01 = scanner.nextInt();
        int[] intArr01 = new int[lengthArr01];

        for (int indexArr01 = 0; indexArr01 < lengthArr01; indexArr01++) {
            System.out.printf("Please input element[%d] of array 01: ", indexArr01);
            intArr01[indexArr01] = scanner.nextInt();
        }
        int[] sortedArr01 = new int[lengthArr01];
        bubble_sort(intArr01);
        System.out.print("Sorted array 01: ");
        for (int num : intArr01) {
            System.out.print(num + " ");
        }

        /************/

        System.out.println(" ");
        System.out.print("Please input length of array 02: ");
        int lengthArr02 = scanner.nextInt();
        int[] intArr02 = new int[lengthArr02];

        for (int indexArr02 = 0; indexArr02 < lengthArr02; indexArr02++) {
            System.out.printf("Please input element[%d] of array 02: ", indexArr02);
            intArr02[indexArr02] = scanner.nextInt();
        }
        int[] sortedArr02 = new int[lengthArr02];
        bubble_sort(intArr02);
        System.out.print("Sorted array 02: ");
        for (int num : intArr02) {
            System.out.print(num + " ");
        }

        /***********/

        int[] mergedArr = new int[lengthArr01 + lengthArr02];
        int indexMergeArr = 0;
        for (int indexElement1 = 0; indexElement1 < intArr01.length; indexElement1++) {
            mergedArr[indexMergeArr] = intArr01[indexElement1];
            indexMergeArr++;
        }
        for (int indexElement2 = 0; indexElement2 < intArr02.length; indexElement2++) {
            mergedArr[indexMergeArr] = intArr02[indexElement2];
            indexMergeArr++;
        }
        System.out.println(" ");
        System.out.print("Merged array from array 01 and array 02: ");
        for (int element : mergedArr) {
            System.out.print(element + " ");
        }
        bubble_sort(mergedArr);
        System.out.println(" ");
        System.out.print("Merged array is sorted ascending: ");
        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }

    public static void bubble_sort(int[] arr) {
        int length = arr.length;
        for (int firstElement = 0; firstElement <= arr.length - 1; firstElement++) {
            for (int nextElement = firstElement + 1; nextElement < arr.length; nextElement++) {
                if (arr[firstElement] > arr[nextElement]) {
                    int tamp = arr[firstElement];
                    arr[firstElement] = arr[nextElement];
                    arr[nextElement] = tamp;
                }
            }
        }
    }
}
