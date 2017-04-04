package part_09;

/**
 * Created by nhavinh on 4/3/17.
 */
import java.io.*;

public class SelfTest10_8 {

        public static void main(String[] args)
                throws IOException
        {
            int a;

            if (args.length !=2) {
                System.out.println("Usage: CopyFile From To");
                return;
            }
            try (FileReader fin = new FileReader(args[0]);
                 FileWriter fout = new FileWriter(args[1]);)
            {
                do {
                    a = fin.read();

                    if ((char) a == ' ') a = '-';

                    if (a != -1) fout.write(a);
                }
                while (a != -1);
        }   catch(IOException exc) {
                System.out.print("I/O Error: " + exc);
            }
        }
}