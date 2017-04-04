package part_01;

/**
 * Part 1 Exercise 5:
 *      Write the necessary code to print the result of the following formula:
 *
 *      (10.5 * 4.2 - 3.4 * 2) / (86.9 - 12.1)
 *
 */
public class Exercise_05 {

    public static void main(String[] arg) {
        double a = 10.5;
        double b = 4.2;
        double c = 3.4;
        double d = 86.9;
        double e = 12.1;

        System.out.println(((a*b)-(c*2)) / (d-e));
    }
}
