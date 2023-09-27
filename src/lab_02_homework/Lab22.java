package lab_02_homework;

import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        /* REQUIREMENT
        Allow user to input a number, print out it’s an odd or even number
        **/

        /* ANSWER
         * 1. Input any number from keyboard
         * 2. If inputNumber = 0 -> Print out "the number 0 is either even or odd"
         * 3. Else inputNumber != 0 -> Continue check
         * 4. If inputNumber is divisible by 2 -> Print out "even number"
         * 3. Else -> Print out "odd number"
         **/

        System.out.print("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int isNumberEvenOrOdd = inputNumber % 2;
        if (inputNumber == 0) {
            System.out.println("The number 0 is either even or odd");
        } else {
            if (isNumberEvenOrOdd == 0) {
                System.out.printf("%d is even number", inputNumber);
            } else {
                System.out.printf("%d is odd number", inputNumber);
            }
        }

    }
}
