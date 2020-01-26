package PrintCalender;

interface Print
{
    static void PrintMonth(int year, int month)
    {
        printMonthTitle( year, month);
        printMonthBody(year, month);
    }

    static void printMonthTitle(int year, int month)
    {
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    /** Print the days of the month */
    static void printMonthBody(int year, int month)
    {
        int startDay = getStartDay(year,month);
        int numDays  = getNumberOfDaysInMonth(year, month);
        int i = 0;

        for(i=0;i<startDay;i++)
        {
            System.out.print("    ");
        }

        for(i = 1; i <= numDays; i++ )
        {
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }
    /** Get the name of the Month */
    static String getMonthName(int month)
    {
        String [] months = {"January", "February", "March", "April", "May", "June", "July",
                                "October", "November","December"};
        return months[month-1];
    }

    /** Get the weekday for the first day of the month */
    static int getStartDay(int year, int month)
    {
        final int START_DAY_JAN_1_1800 = 3;
        int totalDays = getTotalNumberOfDays(year,month);

        return (totalDays + START_DAY_JAN_1_1800) % 7;
    }

    /** Get the total number of days since January 1, 1800 */
    static int getTotalNumberOfDays(int year, int month)
    {
        int totalDays = 0;
        // Get the total days from 1800 to 1/1/year
        for(int i = 1800; i < year; i++ )
        {
            if(isLeapYear(i))
            {
                totalDays += 366;
            }
            else
            {
                totalDays += 365;
            }
        }
        for(int i = 1; i < month; i++)
        {
            totalDays += getNumberOfDaysInMonth(year,month);
        }
        return totalDays;
    }
    static int getNumberOfDaysInMonth(int year, int month)
    {
        //days that end in 31
        int [] odds = {1,3,5,7,8,10,12};
        int [] evens = {4,6,9,11};
        boolean leapYear = isLeapYear(year);

        for(var i : odds)
        {
            if(month == i)
            {
                return 31;
            }
        }
        for(var i : evens)
        {
            if( month == i)
            {
                return 30;
            }
        }
        if(month == 2 && !leapYear)
        {
            return 29;
        }else
        {
            return 28;
        }
    }
    /** Determines if the year parameter is a leap year */
    static boolean isLeapYear(int year)
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
