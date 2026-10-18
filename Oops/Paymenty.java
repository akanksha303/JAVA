abstract class Payments {
    abstract void pay(double amt);
}

public class Paymenty extends Payments {
    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using default payment");
    }

    static class UPI extends Payments {
        @Override
        public void pay(double amt) {
            System.out.println("Paid " + amt + " using UPI");
        }
    }

    static class Card extends Payments {
        @Override
        public void pay(double amt) {
            System.out.println("Paid " + amt + " using Card");
        }
    }

    public static void main(String[] args) {
        Payments p1 = new UPI();
        Payments p2 = new Card();
        p2.pay(200);
        p1.pay(1000);
    }
}
