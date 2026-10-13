public class CarApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.color = "Blue";

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.color = "Red";

        Car s1 = new Car("Tata", 12334);

        System.out.println(s1);
        car1.drive();
        car2.drive();
    }
}

class Car {
    String brand; // Instance variable
    String color; // Instance variable
    String name;
    int price;

    static int count;    // Class variable (shared across all instances)
    final int id = 101;  // Constant variable (cannot be reassigned)

    // no-arg constructor for `new Car()` calls in main
    Car() {
        this.name = "";
        this.price = 0;
    }

    // parameterized constructor for `new Car("Tata", 12334)`
    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void drive() {
        System.out.println("Driving the car");
    }

}