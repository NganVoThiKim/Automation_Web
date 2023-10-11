package lab_06_homework;

import java.util.Scanner;

public class Lab62 {
    public static void main(String[] args) {
        /*
        LAB 6.2
        String myPassword = "password123";
        Allow user to input maximum 3 times
        */
        Scanner scanner = new Scanner(System.in);
        String myPassword = "password123";
        int count = 1;
        System.out.print("Please input password: ");
        do {
            String password = scanner.nextLine();
            boolean isCorrectPassword = myPassword.equals(password);
            if (isCorrectPassword) {
                System.out.println("Login successfully");
                break;
            } else {
                if(count == 3){
                    System.out.println("Only allow input password maximum = 3 times");
                    break;
                }
                System.out.print("Wrong password, please re-input password: ");
                count++;
            }
        } while (count <= 3);
    }
}
