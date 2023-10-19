package homeworks.lab_03;

import java.util.Scanner;

public class Lab32 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Finding maximum value/minimum value from an integer array
         *   int[] intArr = {1, 2, 3, 4, 5};
         *   Minimum: 1
         *   Maximum: 5
         * */

        /* ANSWER
         * Declare a integer array from keyboard
         * Declare minValue
         * Declare maxValue
         * Run from index 0 to end of array -> Set minValue = arr[0]
         * loop each element of array
         * Compare minValue with value of element
         * If minValue > value of element -> Set minValue = value of element
         * If maxValue < value of element -> Set maxValue = value of element
         * End loop
         * Print minValue, maxValue
         * */

        System.out.print("Please input length of array: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArr = scanner.nextInt();
        int[] intArr = new int[lengthArr];
        for (int element = 0; element < lengthArr; element++) {
            System.out.printf("Please input array[%d]: ", element);
            intArr[element] = scanner.nextInt();
        }
        int minValue = intArr[0];
        int maxValue = intArr[0];
        for (int element = 1; element < lengthArr; element++) {
            if (minValue > intArr[element]) {
                minValue = intArr[element];
            }
            if (maxValue < intArr[element]) {
                maxValue = intArr[element];
            }
        }
        System.out.println("Minimum value of array: " + minValue);
        System.out.println("Maximum value of array: " + maxValue);
    }
}
