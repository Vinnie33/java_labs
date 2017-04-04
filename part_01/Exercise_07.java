package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula:
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 1000000000; i += 4) {
            pi += 8.0 / (i * (i + 2L));
        }
        System.out.println(pi);
            }
        }