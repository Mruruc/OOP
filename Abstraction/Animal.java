package Abstraction;

public abstract class Animal {
    // the abstract keyword is a non-access modifier,used for classes and method;

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzzz!");
    }
}

class Pig extends Animal {

    //the body of abstract method is provided in subclass;
    @Override
    public void animalSound() {
        System.out.println("quikk quiiiikk ");
    }
}

class Main {
    public static void main(String[] args) {
        // we can not create object of abstract class, to use properties of abstract class;
        // we should use inheritance:
        //Animal animal=new Animal();--->>> its gonna generate error.

        // we inherit pig class from animal class to use properties of Animal class;
        Pig pig1 = new Pig();
        pig1.sleep();
        pig1.animalSound();
    }
}
