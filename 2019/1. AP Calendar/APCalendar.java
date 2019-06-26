public class APCalendar
{
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    {
      boolean mod4 = year % 4 == 0;
      boolean mod100 = year % 100 == 0;
      boolean mod400 = year % 400 == 0;

      return mod4 && (!mod100 || mod400);
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
    * Precondition: 0 <= year1 <= year2
    */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;

        for (int y = year1; y <= year2; y++) {
            if (isLeapYear(y)) {
              count++;
            }
        }

        return count;
    }

    /** Returns the value representing the day of the week for the first day of year,
    * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
    */
    public static int firstDayOfYear(int year)
    {
        // https://cs.uwaterloo.ca/~alopez-o/math-faq/mathtext/node39.html

        int k = 1;
        int m = 11;
        int Y = year % 100 - 1;
        int C = year / 100;

        return (k + (int)(2.6*m - 0.2) - 2*C + Y + Y/4 + C/4) % 7;
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
    * Returns 1 for January 1 (month = 1, day = 1) of any year.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfYear(int month, int day, int year)
    {
        int[] numDaysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = day;

        for (int i=1; i < month; i++) {
            count += numDaysInMonths[i];
        }

        if (month > 2 && isLeapYear(year)) {
           count += 1;
        }

        return count;
    }

    /** Returns the value representing the day of the week for the given date
    * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
    * and 6 denotes Saturday.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year)
    {
        int start = firstDayOfYear(year);
        int dayNum = dayOfYear(month, day, year);

        return (start + dayNum - 1) % 7;
    }
}
