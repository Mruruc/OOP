package Java_Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EnumApplication {
    //Create an enum called "DaysOfWeek" that contains the 7 days of the week as enumerated values;
    //Write a program that uses a switch statement to display the full name of a day, given its short form.
    // For example, if the user inputs "Mon",
    // the program should display "Monday". Use the DaysOfWeek enum from the previous exercise.
    private enum DaysOfWeek {
        MON, TUE, WED, THU, FRI, SAT, SUN;

        public static void getDay() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the short form of a day (e.g. Mon, Tue, Wed, etc.): ");
            String input = scanner.nextLine().toUpperCase();

            DaysOfWeek day;
            try {
                day = DaysOfWeek.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid short form of a day (e.g. Mon, Tue, Wed, etc.)");
                return;
            }

            switch (day) {
                case MON:
                    System.out.println("Monday");
                    break;
                case TUE:
                    System.out.println("Tuesday");
                    break;
                case WED:
                    System.out.println("Wednesday");
                    break;
                case THU:
                    System.out.println("Thursday");
                    break;
                case FRI:
                    System.out.println("Friday");
                    break;
                case SAT:
                    System.out.println("Saturday");
                    break;
                case SUN:
                    System.out.println("Sunday");
                    break;
            }
            scanner.close();
        }

    }

    //Create an enum called "Month" that contains the 12 months of the year as enumerated values.
    //Write a program that takes a month and a year as input, and outputs the number of days in that month.
    // Use the Month enum from the previous exercise.

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

        public static void getNoOfDays() {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the month (JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE," +
                    " JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER): ");
            String inputMonth = scan.nextLine().toUpperCase();
            Month month = Month.valueOf(inputMonth);

            System.out.print("Enter the year: ");
            int year = scan.nextInt();

            switch (month) {
                case JANUARY:
                case MARCH:
                case MAY:
                case JULY:
                case AUGUST:
                case OCTOBER:
                case DECEMBER:
                    System.out.println("Day in month is 31 !");
                    break;
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    System.out.println("Day in month is 30 !");
                    break;
                case FEBRUARY:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.println("Day in month is 29 !");
                    } else {
                        System.out.println("Day in month is 28");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("invalid month");
            }
            scan.close();

        }
    }
    //Create an enum called "Season" that contains the 4 seasons as enumerated values.
    // Write a program that takes a month and outputs the corresponding season.

    private enum Season {
        WINTER, SPRING, SUMMER, FALL;

        public static void findMonthInSeason() throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the month (JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE," +
                    " JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER): ");

            try {
                String monthInput = reader.readLine().toUpperCase();
                Month month = Month.valueOf(monthInput);
                Season season;

                switch (month) {
                    case DECEMBER:
                    case JANUARY:
                    case FEBRUARY:
                        season = Season.WINTER;
                        break;
                    case MARCH:
                    case APRIL:
                    case MAY:
                        season = Season.SPRING;
                        break;
                    case JUNE:
                    case JULY:
                    case AUGUST:
                        season = Season.SUMMER;
                        break;
                    case SEPTEMBER:
                    case OCTOBER:
                    case NOVEMBER:
                        season = Season.FALL;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid month");
                }

                System.out.println("The month of " + month + " is in the " + season + " season.");
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //Create an enum called "TrafficLight" that contains the 3 states of a traffic light
    // (Red, Yellow, and Green) as enumerated values.
    // Write a program that simulates a traffic light that changes its state every 5 seconds.

    enum TrafficLight {
        RED, YELLOW, GREEN;
        public static void trafficLight() throws InterruptedException {
            TrafficLight light = TrafficLight.RED;
            while (true) {
                switch (light) {
                    case RED:
                        System.out.println("RED");
                        light = TrafficLight.GREEN;
                        break;

                    case YELLOW:
                        System.out.println("YELLOW");
                        light = TrafficLight.RED;
                        break;
                    case GREEN:
                        System.out.println("GREEN");
                        light = TrafficLight.YELLOW;
                        break;
                }
                TimeUnit.SECONDS.sleep(5);
            }
        }

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        EnumApplication.DaysOfWeek.getDay();
        EnumApplication.Month.getNoOfDays();
        EnumApplication.Season.findMonthInSeason();
        EnumApplication.TrafficLight.trafficLight();


    }
}
