import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       CreditPaymentService service = new CreditPaymentService();
       BigDecimal payment = service.calculate (1,1000000);
        System.out.println(payment);
    }
}
