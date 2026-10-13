public class Inheritance {

    static class Animal {
        String name;

        Animal(String name){
            System.out.println(name);

        }
        void eat() {
            System.out.println("Eating");
        }

        void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        Dog(){
            super("Dog");
        }
        void sound() {
            super.sound();
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
    }
}
