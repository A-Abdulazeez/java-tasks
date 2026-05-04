public class DaysInYear {
    public static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        }

        return 365;
    }

    public static void main(String[] args) {
        for (int year = 2014; year <= 2034; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
        }
    }
}
