package part_08;

/**
 * Created by nhavinh on 3/30/17.
 */
public class Warung {
    public static void main(String args[]) {
        int nasi;
        int daily;

        try {
            daily = 0;
            nasi = 28 / daily;

            System.out.println("Average plates of nasi goreng per day: " + nasi);
        }

        catch (ArithmeticException exc) {
            System.out.println("Cannot divide by Zero!");
        }
    }
}