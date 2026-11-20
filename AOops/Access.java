
public class Access {
    private int marks = 90;
    int age = 22;                  // Default access
    protected String name = "Akanksha";
    public String college = "VIT";

    public void display() {
        // All four are accessible inside the same class
        System.out.println("Marks: " + marks);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

class Main {
    public static void main(String[] args) {
        Access s = new Access();

        // System.out.println(s.marks); // Error: private
        System.out.println(s.age);      // Default: allowed
        System.out.println(s.name);     // Protected: allowed
        System.out.println(s.college);  // Public: allowed

        s.display();
    }
}