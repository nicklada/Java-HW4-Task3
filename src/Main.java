public class Main {
    public static void main(String[] args) {
       CreditPaymentService service = new CreditPaymentService();
       int payment = service.calculate(3, 1000000);
        System.out.println(payment);
    }
}

