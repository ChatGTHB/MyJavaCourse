package gun37._02_Soru;

import gun35._02_Polymorphism.Hayvan;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        //Animal animall=new Animal();

        Swallow swallow=new Swallow();
        Cat cat=new Cat();
        Shark shark=new Shark();
        Duck duck=new Duck();

        List<Animal> animals=new ArrayList<>();

        animals.add(swallow);
        animals.add(cat);
        animals.add(shark);
        animals.add(duck);

        for(Animal animal:animals){
            System.out.println();
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("===============================");
            if(animal instanceof Swallow){
                System.out.println(((Swallow) animal).food());
            }else if(animal instanceof Cat){
                System.out.println(((Cat) animal).food());
            }else if(animal instanceof Shark) {
                System.out.println(((Shark) animal).food());
            }else if(animal instanceof Duck) {
                System.out.println(((Duck) animal).food());
            }
        }

    }
}
