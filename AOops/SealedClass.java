sealed class Payment permits CreditCard , UPI, Cash{
    public  void pay(double amount){
        
    }
}

final class CreditCard extends Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid"+amount+"using Credit card");
    }
}

final class UPI extends Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid" + amount+"using UPI");
    }
}

final class Cash extends Payment{
    @Override 
    public  void  pay(double amount){
        System.out.println("Paid"+amount+"Using Cash");
    }

}
public class SealedClass {
      public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new Cash();

        p1.pay(1000);
        p2.pay(500);
        p3.pay(200);
    }
   
    
}
