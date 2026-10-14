public class ObjectClass {
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Student s = (Student) obj;

            return this.id == s.id &&
                   this.name.equals(s.name);
        }

        @Override
        public int hashCode() {
            return id + name.hashCode();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Student s1 = new Student(101, "Akanksha");
            Student s2 = new Student(101, "Akanksha");

            // toString()
            System.out.println(s1);

            // equals()
            System.out.println(s1.equals(s2));

            // hashCode()
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());

            // getClass()
            System.out.println(s1.getClass());
        }
    }
} 