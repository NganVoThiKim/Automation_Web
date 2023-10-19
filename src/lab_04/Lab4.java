package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        /* REQUIREMENT
         * Lab 4: Create a simple menu with 4 options:
         * Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
         * After that, have a menu (You can use while loop) to have below options
         *   =====MENU======
         *   1. Print all numbers
         *   2. Print maximum value
         *   3. Print minimum value
         *   4. Search number
         * Explaination
         *   Option 01: We print all the numbers that we have in the array list
         *   Option 02: We need to find out the maximum number from array list and print out that value
         *   Option 03: We need to find out the minimum number from array list and print out that value
         *   Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index. Otherwise, print that number is not in the list
         * Suggestion
         *   If you can, create methods to support the logic!
         * */

        /* ANSWER
         * 1. Require user input quantity of elements in Array List (Get from keyboard)
         * 2. Create 'generateArrayList' function to generate ArrayList with random elements from keyboard (Quantity of elements)
            * Declare 1 array list
            * Loop each element from index = 0 to less than quantity of elements
                * Declare random variable (less than 1000)
                * Add each random variable into Array list
                * Return 1 arraylist with random elements
         * 3. Create 'printMenu' function
            * Print all menus
         * 4. Call 'printMenu' function
         * 5. Require user input option from keyboard
         * 6. Using switch (option)
            * Case 1:
                * Print all element in array list
                * break;
            * Case 2:
                * Call 'findMaxValue' function
                * break;
            * Case 3:
                * Call 'findMinValue' function
                * break;
            * Case 4:
                * Call 'searchNumber' function
                * break;
            * Default:
                * Print: Wrong option
         * 7. Create 'findMaxValue' function
            * Declare max variable = the first element
            * Loop all elements of array list
                * if value of element >= max
                    * value of element = max
            * Return max
         * 8. Create 'findMinValue' function
            * Declare min variable = the first element
            * Loop all elements of array list
                * if value of element <= min
                    * value of element = min
            * Return min
         * 9. Create 'searchNumber' function
            * Declare searchNum variable from keyboard
            * If array list contains searchNum
                * Loop from index = 0  and less than size of array list
                    * If searchNum == array[index]
                        * Print searchNum is existing in array
                        * Print searchNum
                        * Print index of searchNum
            * Else
                * Print: SearchNum not exist
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input element quantity of array list: ");
        int quantityElement = scanner.nextInt();
        List<Integer> myList = generateArrayListWithRandomNumber(quantityElement);

        boolean isContinuing = true;
        printMenu();
        while (isContinuing) {
            System.out.print("\nPlease input your option: ");
            int userInputOption = scanner.nextInt();
            switch (userInputOption) {
                case 1:
                    System.out.println("All numbers in array list: " + myList.toString());
                    break;
                case 2:
                    int maxValue = findMaxValue(myList);
                    System.out.println("Maximum value is: " + maxValue);
                    break;
                case 3:
                    int minValue = findMinValue(myList);
                    System.out.println("Minimum value is: " + minValue);
                    break;
                case 4:
                    System.out.print("Please input number which need to search: ");
                    int searchedNum = scanner.nextInt();
                    searchNumber(myList, searchedNum);
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Wrong option, please re-input: ");
            }
            if (isContinuing == false) {
                break;
            }
        }

    }

    public static List<Integer> generateArrayListWithRandomNumber(int quantityElement) {
        List<Integer> myList = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        for (int element = 0; element < quantityElement; element++) {
            int randomNum = random.nextInt(1000);
            myList.add(randomNum);
        }
        System.out.println("All numbers in array list: " + myList.toString() + "\n");
        return myList;
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("0. Exit");
    }

    public static int findMaxValue(List<Integer> myList) {
        int maxValue = myList.get(0);
        for (int num : myList) {
            if (maxValue <= num) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static int findMinValue(List<Integer> myList) {
        int minValue = myList.get(0);
        for (int num : myList) {
            if (minValue >= num) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static void searchNumber(List<Integer> myList, int searchedNum) {
        if (myList.contains(searchedNum)) {
            for (int index = 0; index < myList.size(); index++) {
                if (searchedNum == myList.get(index)) {
                    System.out.printf("%d is existing in array", searchedNum);
                    System.out.println("\nNumber is searched: " + searchedNum);
                    System.out.printf("Index of %d number: %d", searchedNum, index);
                }
            }
        } else {
            System.out.println("Searched number is not in the list");
        }

    }
}

