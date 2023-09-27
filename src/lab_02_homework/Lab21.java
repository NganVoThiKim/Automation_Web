package lab_02_homework;

import java.util.Scanner;

public class Lab21 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Get input from user about height(m) and weight(kg) then calculate BMI
             * Underweight = <18.5
             * Normal weight = 18.5 – 24.9
             * Overweight = 25–29.9
             * Obesity = BMI of 30 or greater
         * BMI = weight / (height x 2)
         */

        /* ANSWER
         * 1. Request user input height (If user input = 0 or negative -> Request re-input)
         * 2. Request user input weight (If user input = 0 or negative -> Request re-input)
         * 3. Calculate BMI = weight / (height x 2)
         * 4. If BMI < 18.5 -> Underweight
         * 5. Else if 18.5 <= BMI <= 24.9 -> Normal weight
         * 6. Else if 25 <= BMI <= 29.9 -> Overweight
         * 7. Else -> Obesity
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input height(m): ");
        double inputHeight = scanner.nextDouble();
        while (inputHeight < 0 || inputHeight == 0) {
            System.out.print("Please re-input height(m): ");
            inputHeight = scanner.nextDouble();
        }
        System.out.print("Please input weight(kg): ");
        double inputWeight = scanner.nextDouble();
        while (inputWeight < 0 || inputWeight == 0) {
            System.out.print("Please re-input weight(kg): ");
            inputWeight = scanner.nextDouble();
        }
        double calBMI = inputWeight / (inputHeight * 2);
        if (calBMI < 18.5) {
            System.out.print("You are Underweight");
        } else if (calBMI >= 18.5 && calBMI <= 24.9) {
            System.out.print("You are Normal weight");
        } else if (calBMI >= 25 && calBMI <= 29.9) {
            System.out.print("You are Overweight");
        } else {
            System.out.print("You are Obesity");

        }
    }
}
