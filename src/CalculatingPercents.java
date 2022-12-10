public class CalculatingPercents {
    public double payment(int price, double percent, int months) {
        double monthlyPayment = (price + (price * percent)) / months;
        return monthlyPayment;
    }
}
