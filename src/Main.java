import java.util.Scanner;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking the year from the user and store to the year variable
        System.out.print("Enter Year : ");
        int year = input.nextInt();
        System.out.println();
        //The numbers of months in a year
        final int MONTH_IN_A_YEAR = 12;

        //Iterating as long month is less than or equal to monthInAYear
        for(int month = 0; month < MONTH_IN_A_YEAR; month++){
            //Calling printYear for displaying dates in every month
            printYear(month, year);
            System.out.println("\n");
        }

    }

    private static void printYear(int month, int year) {
        final int MONTH_STARTING_DATE = 1;
        //Creating an instance and setting the month, year, and month starting date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, MONTH_STARTING_DATE);

        //Storing all the months in a year to array
         final String [] monthsInAYear = {
                 String.valueOf(MONTH_IN_A_YEAR.January),
                 String.valueOf(MONTH_IN_A_YEAR.February),
                 String.valueOf(MONTH_IN_A_YEAR.March),
                 String.valueOf(MONTH_IN_A_YEAR.April),
                 String.valueOf(MONTH_IN_A_YEAR.May),
                 String.valueOf(MONTH_IN_A_YEAR.June),
                 String.valueOf(MONTH_IN_A_YEAR.July),
                 String.valueOf(MONTH_IN_A_YEAR.August),
                 String.valueOf(MONTH_IN_A_YEAR.September),
                 String.valueOf(MONTH_IN_A_YEAR.October),
                 String.valueOf(MONTH_IN_A_YEAR.November),
                 String.valueOf(MONTH_IN_A_YEAR.December)
             };
         
         //Initializing the first date of the month
        int firstDayOfTheMonth = calendar.get(Calendar.DAY_OF_WEEK);

        //Initializing the days in a month
        int daysInAMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        //Initializing the number of days in a week
        final int DAYS_IN_A_WEEK = 7;

        //Printing month and year
        System.out.println(" " + monthsInAYear[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        //Skipping days
        for(int i = 1; i < firstDayOfTheMonth; i++){
            System.out.print("   ");
        }

        //Printing the days of the month
        for(int day = 1; day <= daysInAMonth; day++){
            System.out.printf("%2d ", day); //Specifying the day format into  characters

            //Validating the days format in a week
            if((day + firstDayOfTheMonth - 1) % DAYS_IN_A_WEEK == 0){
                System.out.println();//If this condition true it will skip and proceed to the next line
            }
        }
    }
}
