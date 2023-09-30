package lab_03_homework;

import java.util.Scanner;

public class Lab33 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Sort an integer array from min to max
         *   Input: {12, 34, 1, 16, 28}
         *   Expected output: {1, 12, 16, 28, 34}
         */

        /* ANSWER
         * Declare an integer array from keyboard
         * Loop 1 from index = 0 to length - 1
         *   Loop 2 from the next index of loop 1 to the end of array
         * Compare value of element in loop 1 with value in loop 2
         * If value in loop 1 > value in loop 2 -> Change position of value
         * Print sorted array from min to max
         */

        System.out.print("Please input length of array: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArr = scanner.nextInt();
        int[] intArr = new int[lengthArr];
        for (int element = 0; element < lengthArr; element++) {
            System.out.printf("Please input element[%d]: ", element);
            intArr[element] = scanner.nextInt();
        }
        System.out.print("New array sorted asc: ");
        for (int firstElement = 0; firstElement <= lengthArr - 1; firstElement++) {
            for (int nextElement = firstElement + 1; nextElement < lengthArr; nextElement++) {
                if (intArr[firstElement] > intArr[nextElement]) {
                    int tamp = intArr[firstElement];
                    intArr[firstElement] = intArr[nextElement];
                    intArr[nextElement] = tamp;
                }
            }
            System.out.printf("%d, ",intArr[firstElement]);


        }
    }
}
