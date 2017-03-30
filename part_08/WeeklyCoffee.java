package part_08;

/**
 * Created by nhavinh on 3/29/17.
 */
public class WeeklyCoffee {
        public static void main (String args []) {
            int cups [] = {2, 27, 38, 19, 31, 23, 3, 3};
            int guests [] = {0, 25, 33, 16, 29, 21, 0};

                for (int count = 0; count < cups.length; count++);

                try {
                    System.out.println (cups + " / " + guests+ " is " + cups/guests);
                }

                catch (ArithmeticException exc) {
                    System.out.println ("Cannot divide by Zero!");
                }

                catch (ArrayIndexOutOfBoundsException exc) {
                    System.out.println ("Index is out-of-bounds ");
                }
        }
}

