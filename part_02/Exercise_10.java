package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) throws java.io.IOException {

        int prime;

        for (prime = 2; prime >= 2 && prime <= 100; prime++) {
            if (prime % prime == 0) {
                System.out.print(prime + " ");
            }
        }
    }
}


//        int i =0;
//        int num =0;
//        //Empty String
//        String  primeNumbers = "";
//
//        for (i = 1; i <= 100; i++)
//        {
//            int counter=0;
//            for(num =i; num>=1; num--)
//            {
//                if(i%num==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter ==2)
//            {
//                //Appended the Prime number to the String
//                primeNumbers = primeNumbers + i + " ";
//            }
//        }
//        System.out.println("Prime numbers from 1 to 100 are :");
//        System.out.println(primeNumbers);
//    }
//}