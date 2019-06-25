public class APCalendarTester
{
    public static void main(String[] args) {
        // a
        System.out.println( APCalendar.numberOfLeapYears(2000, 2020) );

        // Test by temporarily making firstDayOfYear public
        System.out.println( APCalendar.firstDayOfYear(2019) );

        // Test by temporarily making dayOfYear public
        System.out.println( APCalendar.dayOfYear(3, 1, 2017) );
        System.out.println( APCalendar.dayOfYear(3, 1, 2016) );

        // b
        System.out.println( APCalendar.dayOfWeek(1, 5, 2019) );
        System.out.println( APCalendar.dayOfWeek(1, 10, 2019) );
    }

}
