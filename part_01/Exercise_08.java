package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        double radius = 3.14;
        double area = 3.14 * (radius*radius);
        double perimeter = 3.14 * (radius*2);

        System.out.println("A circle with a radius of " + radius + ", has an area of " + area + ", and perimeter of "
        + perimeter);
    }
}
