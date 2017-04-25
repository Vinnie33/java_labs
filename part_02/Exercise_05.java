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

        System.out.print("Please input a number between 0 and 10: ");

        int number = input.nextInt();

        if (number >= 1 || number <= 9) {
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

            if (number <= 0 || number >= 10)
                System.out.println("Input Error. You entered an out-of-range number");
        }

        else // what statement here would capture inputs of non-numbers (char, string etc)?
            System.out.println("Input Error. You did not enter a number");
    }
}


/**
 *      Below program uses an If Else statement to execute the above.
 */
//        if (number == 1)
//            System.out.println("You entered: One");
//
//        else if (number == 2)
//            System.out.println("You entered: Two");
//
//        else if (number == 3)
//            System.out.println("You entered: Three");
//
//        else if (number == 4)
//            System.out.println("You entered: Four");
//
//        else if (number == 5)
//            System.out.println("You entered: Five");
//
//        else if (number == 6)
//            System.out.println("You entered: Six");
//
//        else if (number == 7)
//            System.out.println("You entered: Seven");
//
//        else if (number == 8)
//            System.out.println("You entered: Eight");
//
//        else if (number == 9)
//            System.out.println("You entered: Nine");
//
//        else
//            System.out.println("You have an input error");
//    }





