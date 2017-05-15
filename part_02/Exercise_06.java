package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */
public class Exercise_06 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number between 1 and 9: ");

        try {
            int number = input.nextInt();

            if (number >= 1 && number <= 9) {
                switch (number) {
                    case 1:
                        System.out.println("You entered: One");
                        break;
                    case 2:
                        System.out.println("You entered: Two");
                        break;
                    case 3:
                        System.out.println("You entered: Three");
                        break;
                    case 4:
                        System.out.println("You entered: Four");
                        break;
                    case 5:
                        System.out.println("You entered: Five");
                        break;
                    case 6:
                        System.out.println("You entered: Six");
                        break;
                    case 7:
                        System.out.println("You entered: Seven");
                        break;
                    case 8:
                        System.out.println("You entered: Eight");
                        break;
                    case 9:
                        System.out.println("You entered: Nine");
                        break;
                }
            } else
                System.out.println("Input Error. Please try again and enter a number between 1 and 9");

        } catch (Exception e) {
            System.out.println("It looks like you did not enter a number.");
            System.out.println("Please try again and enter a number between 1 and 9.");
        }
    }
}
