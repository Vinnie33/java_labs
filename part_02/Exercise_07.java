package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 1,000,000,000 in minutes, to get a rounded conversion in years and days: ");
        int minutes = input.nextInt();
        // numberOfYears * 365 days * 24 hours * 60 minutes = total minutes in a year
        // 1 year = 525,600 minutes
        int years = minutes / 525600;
        int remainderMinutes = minutes % 525600;
        // numberOfDays * 24 hours * 60 minutes = total minutes in a day
        // 1 day = 1,440 minutes
        int days = remainderMinutes / 1440;

        System.out.println(minutes + " minutes is equal to " + years + " years, and " + days + " days.");
    }
}

