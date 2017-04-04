package part_09;

/**
 * Created by nhavinh on 4/3/17.
 */

import java.io.*;

public class SelfTest10_7 {
    public static void main(String[] args)
    {
        int a;
        FileInputStream spaceFile = null;
        FileOutputStream hyphenFile = null;

        if (args.length !=2) {
            System.out.println("Usage: Copying File From To");
            return;
        }

        try {
            spaceFile = new FileInputStream(args[0]);
            hyphenFile = new FileOutputStream(args[1]);

            do {
                a = spaceFile.read();

                if ((char) a == ' ') a = '-';

                if (a != -1) hyphenFile.write(a);
            }
            while (a != -1);
        }   catch (IOException exc) {
            System.out.print("I/O Error: " + exc);
        }   finally {
            try {
                if (spaceFile != null) spaceFile.close();
            }   catch (IOException exc) {
                System.out.print("Error closing input file");
            }
            try {
                if (spaceFile != null) hyphenFile.close();
            }   catch (IOException exc){
                System.out.print("Error closing output file");
            }
            }
        }
    }
