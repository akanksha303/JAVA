abstract class Payments {
    abstract void pay(double amt);
}

public class Payment extends Payments {
    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using default payment");
    }

    static class UPI extends Payment {
        @Override
        public void pay(double amt) {
            System.out.println("Paid " + amt + " using UPI");
        }
    }

    static class Card extends Payment {
        @Override
        public void pay(double amt) {
            System.out.println("Paid " + amt + " using Card");
        }
    }

    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        p2.pay(200);
        p1.pay(1000);
    }
}
