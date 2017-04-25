package part_09;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
///**
// * Created by nhavinh on 4/9/17. Code for Reading and Parsing a CSV File.
// */
//
//public class CSV_Reader {
//
//    public static void main(String[] args) {
//
//        String csvFile = "/Users/nhavinh/Bali_Nomads/Homework_and_Notes/SantaCruzPublicSchools.csv";
//        BufferedReader br = null;
//        String line = "";
//        String cvsSplitBy = ",";
//
//        try {
//
//            br = new BufferedReader(new FileReader(csvFile));
//            while ((line = br.readLine()) != null) {
//
//                // use comma as separator
//                String[] school = line.split(cvsSplitBy);
//
//                System.out.println("Santa Cruz School [Name = " + school[1] + " , Type = " + school[7] + "]");
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//}
