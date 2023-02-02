import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky");


        dog.eat();
        System.out.println("-------------------");

        dog.walk();
        System.out.println("-------------------");

        dog.run();


    }


}
