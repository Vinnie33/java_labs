package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] strings) {
        double distance = 12;
        double time = 30.5 / 60;
        double miles = distance / 1.6;
        double mph = miles * time;

        System.out.println("A person who runs " + distance + " Kilometers " + "within 30.5 minutes, " +
                "has an average speed of " + mph + " miles per hour");
    }

}
