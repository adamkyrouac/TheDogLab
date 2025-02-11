// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************
import java.util.*;

public class DogTest
{
    public static void main(String[] args) {
//	    Dog dog = new Dog("Spike");
//	    System.out.println(dog.getName() + " says " + dog.bark());
//
//        Labrador lab = new Labrador("Terry", "chocolate");
//        System.out.println(lab.getName() + " says " + lab.bark());
//
//        Yorkshire york = new Yorkshire("Little", 3);
//        york.waddle();
//        System.out.println(york.bark());
//
//        // Needs to have its own waddle method because Dog doesn't have one to inherit
//        lab.waddle();
//
//
//        //Phase 2
//        Dog[] dogs = new Dog[3];
//        dogs[0] = new Dog("Greg");
//        dogs[1] = new Yorkshire("Squirt", 6);
//        dogs[2] = new Labrador("Harold", "yellow");
//
//        for(int i = 0; i < dogs.length; i++){
//            System.out.println(dogs[i].bark());
//        }
//
//        for(Dog d : dogs){
//            // Dog has a bark method in it that Labrador has overridden
//            System.out.println(d.bark());
//        }
//
//        // looks for a waddle() in Dog first, since the Labrador object is stored as a Dog
//        ((Labrador)dogs[2]).waddle(); // cast it to a Labrador
//
//        ArrayList<Dog> dogsList = new ArrayList<Dog>(3);
//        dogsList.set(0, new Dog("Greg 2"));
//        dogsList.set(1, new Yorkshire("Squirt 2", 6));
//        dogsList.set(2, new Labrador("Harold 2", "yellow"));
//
//        for(int i = 0; i < dogsList.size(); i++){
//            System.out.println(dogsList.get(i).bark());
//        }
//
//        for(Dog d : dogsList){
//            System.out.println(d.bark());
//        }
//
//        ((Labrador)dogsList.get(2)).waddle();


        //Phase 3

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(0, new Dog("Lightning"));
        animals.add(1, new Yorkshire("Billy", 4));
        animals.add(2, new Labrador("Quicko", "black"));

        animals.get(0).setAge(2);
        animals.get(1).setAge(4);
        animals.get(2).setAge(6);

        for(Animal a : animals){
            System.out.println(a.getAge());
            a.eat();
            // There's no bark method in Animal class
            System.out.println(a.bark());
        }
    }
}
