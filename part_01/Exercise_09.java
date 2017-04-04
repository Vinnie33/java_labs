package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double height = 6.4;
        double width = 2.4;
        double perimeter = (height*2) + (width*2);
        double area = height * width;

        System.out.println("Rectangle height = " + height);
        System.out.println("Rectangle width = " + width);
        System.out.println("Rectangle perimeter = " + perimeter);
        System.out.println("Rectangle area = " + area);

    }
}
