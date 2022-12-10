public class Main {
    public static void main(String[] args) {
        CalculatingPercents service = new CalculatingPercents();
        double payment = service.payment(1_000_000, 0.099, 12);
        System.out.println(payment);

        System.out.println();
        double paymentPerTwoYears = service.payment(1_000_000, 0.099, 24);
        System.out.println(paymentPerTwoYears);

        System.out.println();
        double paymentPerThreeYears = service.payment(1_000_000, 0.099, 36);
        System.out.println(paymentPerThreeYears);
    }
}