//package part_09;
//
///**
// * Created by nhavinh on 4/4/17.
// */
//// Demonstrate the queue exceptions (latest Queue class: Chapter 9, example 19 class QExcDemo), with multi-thread
//
//
//public class SelfTest11_12 implements Runnable {
//
//        public static void main(String args[]) {
//
//            char ch;
//            int i;
//
//            SelfTest11_12(String); {
//                thrd = new Thread(target this,name);
//                thrd.start();
//            }
//            try {
//                for(i=0; i < 11; i++) {
//                    System.out.print("Attempting to store : " +
//                            (char) ('A' + i));
//                    q.put((char) ('A' + i));
//                    System.out.println(" -- OK");
//                }
//                System.out.println();
//            }
//            catch (QueueFullException exc) {
//                System.out.println("Exception error");
//            }
//            System.out.println();
//
//            try {
//                // over-empty the queue
//                for(i=0; i < 11; i++) {
//                    System.out.print("Getting next char: ");
//                    ch = q.get();
//                    System.out.println(ch);
//                }
//            }
//            catch (QueueEmptyException exc) {
//                System.out.println("Exception error");
//            }
//        }
//    }
