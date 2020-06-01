public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 0) {
            throw new RuntimeException("Number cannot be negative");
        }
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }
}