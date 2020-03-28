public class CreditPaymentService {
        public int calculate (double term, double credit) {
            double rate = 9.9/100/12;
            double a = (1+rate);
            double b = term*12;
            double c = Math.pow(a,b);
            double d = 1-1/c;
            double payment = credit*rate /d;
            return (int) payment;
        }
    }

