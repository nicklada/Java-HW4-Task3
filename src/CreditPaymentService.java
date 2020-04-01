import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditPaymentService {
    public BigDecimal calculate (int term, int credit) {
                BigDecimal rate = new BigDecimal(9.99/100/12);
                BigDecimal a = new BigDecimal(1).add(rate);
                int b = term*12;
                BigDecimal c = a.pow(b);
                BigDecimal e = new BigDecimal(1).divide(c,10000,RoundingMode.UP);
                BigDecimal d = new BigDecimal(1).subtract(e);
                BigDecimal payment = new BigDecimal(credit).multiply(rate).divide(d,0,RoundingMode.UP);
                return payment;
            }
        }
