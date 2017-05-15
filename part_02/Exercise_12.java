package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) throws java.io.IOException {

        System.out.println("The following program calculates the fuel cost for a road trip");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of miles in driving distance to your destination: ");
        double milesDriven = input.nextDouble();

        System.out.print("Enter the MPG of your car: ");
        double mpg = input.nextDouble();

        System.out.print("Enter the current price per gallon of fuel: ");
        double gallonPrice = input.nextDouble();

        double cost = (milesDriven * gallonPrice) / mpg;

        System.out.println("$" + cost + " is the total cost in fuel for your destination");

    }
}
