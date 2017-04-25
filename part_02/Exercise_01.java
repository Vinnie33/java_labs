package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */
public class Exercise_01 {

    public static void main(String[] args) throws java.io.IOException {
        System.out.println();
        System.out.println("Provide the degrees in Celsius and this program will convert to Fahrenheit.");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}
