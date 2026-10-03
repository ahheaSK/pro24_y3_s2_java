
import abstractton.Animal2;
import abstractton.AnimalImpl;
import abstractton.AnimalInterface;
import abstractton.Dog2;
import inheritance.Cat;
import inheritance.Meow;
import polymorphism.Animal1;
import polymorphism.Calculator;
import polymorphism.Dog1;

public class Main {
    public static void main(String[] args) {
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.setAge(1);
//        int age = encapsulation.getAge();
//        System.out.println(age);

//        Meow cat = new Meow();
//        //cat.saying();
//
//        // Class Animal
//        cat.eat();
//        cat.name = "Meow Meow";
//
//        cat.playing();
//
//        Cat cat1 = new Cat();
//        cat1.saying();
//        cat1.eat();
//        cat1.name = "Cat 1";
//        //cat1.playing();

//        Calculator calculator = new Calculator();
//        int i = calculator.add();
//        int b = calculator.add(1,2);
//        System.out.println(i);
//        System.out.println(b);
//
//        Animal1 dog1 = new Dog1();
//        dog1.sound();

        Animal2 dog2 = new Dog2();
        dog2.sound();
        dog2.walk();

        AnimalInterface animal = new AnimalImpl();
        animal.sound();
    }
}