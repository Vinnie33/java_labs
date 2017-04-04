package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in Pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println(pounds + " Pounds is equal to " + kilograms + " Kilograms");
    }
}
