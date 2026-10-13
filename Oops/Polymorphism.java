public class Polymorphism {
    static class Animal {
        void Sound() {
            System.out.println("Animal make sounds");
        }
    }

    static class Dog extends Animal {
        @Override
        void Sound() {
            System.out.println("Dog Barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void Sound() {
            System.out.println("Cat does meow");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        Animal[] animals = {
            new Dog(),
            new Cat()
        };

        for (Animal an : animals) {
            an.Sound();
        }

        a.Sound();
        b.Sound();
    }
}
