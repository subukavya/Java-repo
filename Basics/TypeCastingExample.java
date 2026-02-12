class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class TypeCastingExample {

    public static void main(String[] args) {

        // ==============================
        // 1. Primitive Type Casting
        // ==============================

        // Widening (Implicit Casting)
        int intValue = 100;
        double doubleValue = intValue;  // int -> double (automatic)
        System.out.println("Widening Casting:");
        System.out.println("Int value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        System.out.println();

        // Narrowing (Explicit Casting)
        double anotherDouble = 99.99;
        int narrowedInt = (int) anotherDouble;  // double -> int (manual)
        System.out.println("Narrowing Casting:");
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Converted to Int: " + narrowedInt);

        System.out.println();

        // ==============================
        // 2. Object Type Casting
        // ==============================

        // Upcasting (Implicit)
        Animal animal = new Dog();  // Dog -> Animal
        animal.sound();

        System.out.println();

        // Downcasting (Explicit)
        Dog dog = (Dog) animal;  // Animal -> Dog
        dog.bark();
    }
}
