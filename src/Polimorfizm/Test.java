package Polimorfizm;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        Animal animal1 = new Dog();
        Dog dog1 = new Dog();
//        animal.eat();
//        animal1.eat();
//        dog1.eat();
//        System.out.println(dog1.bark());
        test1(dog1);
        test1(animal);



    }

    public static void test1(Animal animal) {
        animal.eat();
    }
}
