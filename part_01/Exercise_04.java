package part_01;

import sun.tools.jconsole.Tab;

/**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {

     public static void main(String[] args) {
        int i;

         System.out.println ("a\t" + "a*2\t" + "a*4");
         for (i = 1; i <= 4; i++) {
            System.out.println(i + "\t" + i*2 + "\t" + i*4);
         }
     }
}

