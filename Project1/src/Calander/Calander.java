package Calander;

import java.util.Scanner;

public class Calander {

    private int year;
    private int month;
    private int day;
    private int firstdayOfMonth;

    String[] month_names = {
        "January", "February", "March", "April", "May",
        "June", "July", "August", "September",
        "October", "November", "December"
    };

    String[] week = {
        "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
    };

    int[] number_of_days_in_months = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Calander(int year) {
        this.year = year;
    }

    public void displayCalander(int year) {

        for (int current_month = 0; current_month < month_names.length; current_month++) {  // print out month names 

            int start_date = getFirstDayOfYear(current_month + 1, year);     // first day of the month
            int number_of_days = getNumberOfDaysinMonth(current_month, year);    // fetch number of days

            printMonthNammes(current_month);
            printWeekTitles();
            printMonthBody(number_of_days, start_date);

        }
    }

    public int getNumberOfDaysinMonth(int month, int year) {
        if (isLeapYear(year) && month == 1) {
            number_of_days_in_months[1] = 29;
        }
        int i = month;
        return number_of_days_in_months[i];
    }

    public int getFirstDayOfYear(int month, int year) {
        this.year = year;

        this.day = 1;   // First day , 01

        this.month = month; // First Month, January

        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;

        int j = year / 100;

        // 0 = Saturday, 1 = Sunday, 2= Monday, 3= Tues, 4 = Weds... 6 = friday
        int dayOfWeek = ((day + (((month + 1) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) % 7;

        //System.out.println("first day of week " + dayOfWeek );
        firstdayOfMonth = dayOfWeek;
        return dayOfWeek;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void printMonthNammes(int month) {
        System.out.print("\t\t" + month_names[month] + "  " + year + "\n");

    }

    public void printWeekTitles() {
        for (int j = 0; j < week.length; j++) {
            System.out.print(week[j] + "\t");
        }
        System.out.print('\n');

    }

    public void printMonthBody(int number_of_days, int startdate) {
        int num = 1;
        int temp;

        temp = paddingNeeded(startdate);   // gets number of empty spaces needed 

        for (int i = 0; i < temp; i++) //adds empty space 
        {
            System.out.print("\t");
        }

        for (int i = 1; i <= number_of_days; i++) { //Prints out days
            System.out.print(i + "\t");
            if ((i + temp) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public int paddingNeeded(int startdate) {
        int padding = 0;

        switch (startdate) {
            case 0:
                padding = 6;
                break;
            case 1:
                padding = 0;
                break;
            case 2:
                padding = 1;
                break;
            case 3:
                padding = 2;
                break;
            case 4:
                padding = 3;
                break;
            case 5:
                padding = 4;
                break;
            case 6:
                padding = 5;
                break;
        }

        return padding;
    }

}
