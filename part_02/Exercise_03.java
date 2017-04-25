package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Provide the length in feet and this program will convert to meters.");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in feet: ");
        double feet = input.nextDouble();

        double meter = feet * .305;
        System.out.println(feet + " feet is equal to " + meter + " meters");
    }
}
