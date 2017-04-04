package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *              10 births per minute, 600 per hour (600 * 24 hours * 365 days) = 5,256,000
 *          - One person who dies every 12 seconds
 *              5 deaths per minute, 300 per hour (300 * 24 hours * 365 days) = 2,628,000
 *          - One person who immigrates every 40 seconds
 *              1.5 immigrants per minute, 90 per hour (90 * 24 hours * 365 days) = 788,400
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {
        int counter, year;
        long currentPop = 380_123_456;
        long births = 5_256_000;
        long deaths = -2_628_000;
        long immigrants = 788_400;

        counter = 0;
        for(year = 1; year <= 3; year++) {
            System.out.println("Current Population for Year " + year + " is " + currentPop);
            currentPop = currentPop + births + deaths + immigrants;
            }
        }
    }
