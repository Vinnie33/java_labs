package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {

    public static void main(String[] args) throws java.io.IOException {
        char x;
        x = 'z';

        do {
            System.out.print(x-- + " ");
        }
        while (x <= 'z' && x >= 'a'); {
            System.out.print(x);
        }
    }
}
