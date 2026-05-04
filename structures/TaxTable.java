public class TaxTable {
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;

        if (status == 0) {
            tax = calculateTax(taxableIncome, new double[]{8350, 33950, 82250, 171550, 372950}, new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35});
        } else if (status == 1) {
            tax = calculateTax(taxableIncome, new double[]{16700, 67900, 137050, 208850, 372950}, new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35});
        } else if (status == 2) {
            tax = calculateTax(taxableIncome, new double[]{8350, 33950, 68525, 104425, 186475}, new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35});
        } else if (status == 3) {
            tax = calculateTax(taxableIncome, new double[]{11950, 45500, 117450, 190200, 372950}, new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35});
        } else {
            System.out.println("Invalid filing status");
        }

        return tax;
    }

    public static double calculateTax(double income, double[] brackets, double[] rates) {
        double tax = 0;
        double previousBracket = 0;

        for (int index = 0; index < brackets.length; index++) {
            if (income > brackets[index]) {
                tax += (brackets[index] - previousBracket) * rates[index];
                previousBracket = brackets[index];
            } else {
                tax += (income - previousBracket) * rates[index];
                return tax;
            }
        }

        tax += (income - previousBracket) * rates[rates.length - 1];
        return tax;
    }

    public static void main(String[] args) {
        System.out.println("Taxable Income    Single    Married Joint    Married Separate    Head of House");

        for (int income = 50000; income <= 70000; income += 100) {
            System.out.printf("%-17d %-9.2f %-16.2f %-19.2f %.2f%n", income, computeTax(0, income), computeTax(1, income), computeTax(2, income), computeTax(3, income));
        }
    }
}
