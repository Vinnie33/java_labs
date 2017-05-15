package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 */

public class Exercise_05 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number between 1 and 9: ");

        int number = input.nextInt();

        if (number == 1)
            System.out.println("You entered: One");

        else if (number == 2)
            System.out.println("You entered: Two");

        else if (number == 3)
            System.out.println("You entered: Three");

        else if (number == 4)
            System.out.println("You entered: Four");

        else if (number == 5)
            System.out.println("You entered: Five");

        else if (number == 6)
            System.out.println("You entered: Six");

        else if (number == 7)
            System.out.println("You entered: Seven");

        else if (number == 8)
            System.out.println("You entered: Eight");

        else if (number == 9)
            System.out.println("You entered: Nine");

        else {
            if (number < 1 && number > 9);
            System.out.println("Input Error. Please try again and enter a number between 1 and 9.");
        }
    }
}






