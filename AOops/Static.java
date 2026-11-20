public class Static {
    
     class Employee{
        String name;
        static int count=0;

        public static void count(String name){
            count +=1;
            System.out.println(count);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        
        Employee.count("Akanksha");
        Employee.count("Rahul");
        
    }
    
}
