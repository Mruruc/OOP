package StaticBlock;

public class StaticBlock {
    // Declare two static variables
    static int a = 8; // 'a' is initialized with value 8
    static int b; // 'b' is not yet initialized

    // A static block of code that initializes the value of 'b'
    /*  a static block is a block of code that
     *  is executed when the class is loaded by the Java Virtual Machine (JVM).
     *  In this example, the static block initializes the value of
     *  the static variable b to the value of the static variable a multiplied by 10.
     */
    static {
        System.out.println("This is a Static Block!"); // prints a message to the console
        b = a * 10; // initializes the value of 'b' to 80 (the value of 'a' multiplied by 10)
    }
    /*
    Since static variables are associated with the class rather than with any particular instance of the class,
    they can be accessed without creating an instance of the class.
    The static block ensures that b is initialized before it can be used anywhere in the program.

    When an instance of the class is created,
    the values of the instance variables may be different from the values of the static variables.
    However, in this case, obj.b has the same value as b because the static block initializes b to 80 before
    any instance of the class is created.
   */

    // The main method, which is called when the program is run
    public static void main(String[] args) {
        // Print the value of 'b'
        System.out.println("The value of 'b' is: " + b); // prints "The value of 'b' is: 80"

        // Create an instance of the StaticBlock.StaticBlock class
        StaticBlock obj = new StaticBlock();

        // Print the values of 'a' and 'b' for the instance
        System.out.println("The value of 'a' for the instance is: " + obj.a); // prints "The value of 'a' for the instance is: 8"
        System.out.println("The value of 'b' for the instance is: " + obj.b); // prints "The value of 'b' for the instance is: 80"

        // Print the value of 'a' for the class
        System.out.println("The value of 'a' for the class is: " + StaticBlock.a); // prints "The value of 'a' for the class is: 8"
    }
}
