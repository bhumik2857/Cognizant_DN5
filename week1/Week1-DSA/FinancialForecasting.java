public class FinancialForecasting {

    public static double futureValue(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return futureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double annualGrowthRate = 0.10;
        int years = 5;

        double futureValue = futureValue(presentValue, annualGrowthRate, years);

        System.out.printf("Present Value : %.2f%n", presentValue);
        System.out.printf("Growth Rate   : %.0f%%%n", annualGrowthRate * 100);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f%n", futureValue);
    }
}