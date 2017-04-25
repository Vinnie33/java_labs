package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */
public class Exercise_02 {

    public static void main(String[] args) throws java.io.IOException {

        System.out.println();
        System.out.println("Provide the Radius & Length of a Cylinder and this program will calculate Area & Volume.");
        System.out.println();

        double area, volume;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        area = radius * radius * 3.1415;
        volume = area * length;
        System.out.println("Area of a Cylinder: " + area);
        System.out.println ("Volume of a Cylinder: " + volume);
    }
}
