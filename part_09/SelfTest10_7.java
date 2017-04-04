package part_09;

/**
 * Created by nhavinh on 4/3/17.
 */

import java.io.*;

public class SelfTest10_7 {
    public static void main(String[] args)
    {
        int a;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length !=2) {
            System.out.println("Usage: Copying File From To");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                a = fin.read();

                if ((char) a == ' ') a = '-';

                if (a != -1) fout.write(a);
            }
            while (a != -1);
        }   catch (IOException exc) {
            System.out.print("I/O Error: " + exc);
        }   finally {
            try {
                if (fin != null) fin.close();
            }   catch (IOException exc) {
                System.out.print("Error closing input file");
            }
            try {
                if (fin != null) fout.close();
            }   catch (IOException exc){
                System.out.print("Error closing output file");
            }
            }
        }
    }
