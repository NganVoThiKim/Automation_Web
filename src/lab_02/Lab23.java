package lab_02;

import java.util.Scanner;

public class Lab23 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Lab 2.1 + Suggest user to increase/decrease weight
         */

        /* ANSWER
         * 1. Re-run Lab21
         * 2. If BMI < 18.5 -> Underweight
         * 3. BMI = weight / (height x 2) -> If BMI increase -> weight increase
         *
         * 4. Declare variable 'weightPlus' = 0.5 (kg)
         * 5. Declare variable 'currentWeight' = weight
         * 7. Calculate current BMI based on weight, height
         * 8. If current BMI > 24.9 then weight decrease (weight + weightPlus * (-1))
         * 9. If current BMI < 18.5 then weight increase (weight + weightPlus)
         * 10. While (currentBMI < 18.5 && currentBMI > 24.9) then
         *   10.1 weight = weight + weightPlus
         *   10.2 Re-calculate current BMI = weight / (height x 2)
         */
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
        if (calBMI >= 18.5 && calBMI <= 24.9) {
            System.out.print("You mustn't change your weight");
        } else {
            double weightPlus = 0.5;
            double currentWeight = inputWeight;
            boolean isIncrease = true;
            if (calBMI > 24.9) {
                weightPlus = weightPlus * (-1);
                isIncrease = false;
            }
            while (calBMI < 18.5 || calBMI > 24.9) {

                currentWeight = currentWeight + weightPlus;
                calBMI = currentWeight / (inputHeight * 2);

                if (calBMI >= 18.5 && calBMI <= 24.9) {
                    break;
                }
            }

            double weightCal = 0;
            if (isIncrease) {
                weightCal = currentWeight - inputWeight;
                System.out.println("You must increase your weight: " + weightCal + " (kg)");
            } else {
                weightCal = inputWeight - currentWeight;
                System.out.println("You must decrease your weight: " + weightCal + " (kg)");
            }
        }
    }
}
