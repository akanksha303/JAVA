

public class Encapsulation {
    static class Bankname {
        private double balance;

        public double getbalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    static class student {
        private int marks;

        public void setmarks(int marks){
            if(marks>=0 && marks<= 70){
                this.marks = marks;
            }
            else{
                System.out.println("Invalid marks");
            }
        }


        public int getmarks(int marks){
            return marks;
        }
    }

    public static void main(String[] args) {
        Bankname res = new Bankname();

        res.deposit(5000);
        res.withdraw(200);

        System.out.println(res.getbalance());


        student s1 = new student();
        s1.setmarks(400);
        

        System.out.println(s1.getmarks(45));

        }
    }

