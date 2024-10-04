public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("Hachiko");
        dog.name();

        dog.setSound("Bow bow");
        dog.sound();

        cat.setName("Murka");
        cat.name();

        cat.setSound("Meow meow");
        cat.sound();
    }
}