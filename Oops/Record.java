public class Record {
    record Student(int id, String name) {
}

public class Main {
    public static void main(String[] args) {

        // Constructor
        Student s1 = new Student(101, "Akanksha");
        Student s2 = new Student(101, "Akanksha");

        // Accessor methods
        System.out.println("ID: " + s1.id());
        System.out.println("Name: " + s1.name());

        // toString()
        System.out.println("\ntoString():");
        System.out.println(s1);

        // equals()
        System.out.println("\nequals():");
        System.out.println(s1.equals(s2));

        // hashCode()
        System.out.println("\nhashCode():");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // == operator
        System.out.println("\n== operator:");
        System.out.println(s1 == s2);
    }
}

}
