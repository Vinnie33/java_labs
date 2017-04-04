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
                System.out.println("Usage: Copying File From To");
                return;
            }
            try (FileReader spaceFile = new FileReader(args[0]);
                 FileWriter hyphenFile = new FileWriter(args[1]);)
            {
                do {
                    a = spaceFile.read();

                    if ((char) a == ' ') a = '-';

                    if (a != -1) hyphenFile.write(a);
                }
                while (a != -1);
        }   catch(IOException exc) {
                System.out.print("I/O Error: " + exc);
            }
        }
}