package part_08;

/**
 * Created by nhavinh on 3/29/17.
 */
public class CoffeeShop {

        public static void main (String args []) {
            int cups;
            int customers;

            try {
                customers = 0;
                cups = 78 / customers;

                System.out.println ("Average coffee consumption per customer: " + cups);
            }
            catch (ArithmeticException exc) {
                System.out.println ("Cannot divide by Zero!");
            }

            try {
                int coffeeOz [] = new int [16];
                coffeeOz [21] = 32;
            }

            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println ("Index is out-of-bounds ");
            }
            finally {
                System.out.println ("Exiting program");
            }
        }
}
