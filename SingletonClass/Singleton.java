package SingletonClass;

/*
*SingletonClass.Singleton pattern is a way to make sure that only one instance of a class is created,
*and it can be accessed from anywhere in the code.
*The Java implementation of the SingletonClass.Singleton pattern uses a private constructor,
*which means that the class cannot be instantiated from outside the class.
*Instead, a public static method named getInstance() is used to access the single instance of the class.
*/


public class Singleton {

    // Declare a private static variable to hold the single instance of the class
    private static Singleton instance;

    // Make the constructor private so that it cannot be called from outside the class
    // This ensures that only the SingletonClass.Singleton class can create its own instance
    private Singleton() {

    }

    // Create a public static method to access the single instance of the class
    // This method returns the existing instance if it has already been created,
    // or creates a new instance if it has not yet been created
    public static Singleton getInstance() {

        // If the instance has not been created yet, create it
        if (instance == null) {
            Singleton.instance = new Singleton();
        }

        // Return the single instance of the class
        return instance;
    }
}

// The SingletonClass.Singleton pattern is useful in situations where you need to limit the number of instances of a class,
// such as when working with shared resources or global settings.
// This pattern ensures that only one instance of the class is created and can be accessed from anywhere in the code.
// The use of lazy initialization ensures that the instance is only created when it is first requested,
// which can be more efficient than creating the instance immediately, especially if the instance is never actually needed.
