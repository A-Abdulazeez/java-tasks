public class MileKilometerConverter {
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }

    public static void main(String[] args) {
        System.out.println("Miles    Kilometers    Kilometers    Miles");

        for (int value = 1; value <= 10; value++) {
            System.out.printf("%-8d %-13.3f %-13d %.3f%n", value, mileToKilometer(value), value, kilometerToMile(value));
        }

        System.out.println("\n2 miles = " + mileToKilometer(2) + " kilometers");
        System.out.println("2 kilometers = " + kilometerToMile(2) + " miles");
    }
}
