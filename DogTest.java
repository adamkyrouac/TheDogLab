// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest
{
    public static void main(String[] args) {
	    Dog dog = new Dog("Spike");
	    System.out.println(dog.getName() + " says " + dog.bark());

        Labrador lab = new Labrador("Terry", "chocolate");
        System.out.println(lab.getName() + " says " + lab.bark());

        Yorkshire york = new Yorkshire("Little", 3);
        york.waddle();
        System.out.println(york.bark());

        // Needs to have its own waddle method because Dog doesn't have one to inherit
        lab.waddle();
    }
}
