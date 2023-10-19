package lab_03;

import java.util.Scanner;

public class Lab31 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Count how many odd, even number(s) in an integer array
         *   int[] intArr = {1, 2, 3, 4, 5};
         *   Even numbers: 2
         *   Odd numbers: 3
         * */

        /* ANSWER
         * 1. Declare 1 integer array from keyboard
         * 2. Declare 2 variables 'evenNumCount', 'oddNumCount'
         * 3. Run from index = 0 to end of array -> Check every value is even or odd
         * 4. If value % 2 == 0 -> Increase 'evenNumCount'
         * 5. Else -> Increase 'oddNumCount'
         * 6. Print 'evenNumCount' and 'oddNumCount'
         * */


        System.out.print("Please input length of array: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArr = scanner.nextInt();
        int[] intArr = new int[lengthArr];
        for (int element = 0; element < lengthArr; element++) {
            System.out.printf("Please input array[%d]: ", element);
            intArr[element] = scanner.nextInt();
        }
        int evenNumCount = 0;
        int oddNumCount = 0;
        for (int element = 0; element < lengthArr; element++) {
            if (intArr[element] % 2 == 0) {
                evenNumCount++;
            } else {
                oddNumCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenNumCount);
        System.out.println("Count of odd numbers: " + oddNumCount);
    }
}
