public abstract class Animal {
    private int age;

    public Animal(){
        age = 0;
    }

    public void setAge(int inAge){
        age = inAge;
    }

    public int getAge(){
        return age;
    }

    // abstract method needs to be in an abstract class
    public abstract void eat();

    public abstract String bark();
}
