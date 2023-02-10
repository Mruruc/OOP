package Java_Wrapper_Classes;

public class Main {
    public static void main(String[] args) {

        /*Wrapper classes provide a way to use primitive data type as objects.
        Autoboxing----> its a way that converting primitive data type into wrapper classes objects;
        */

        int i=8;
        Integer m=Integer.valueOf(i); //converting int into Integer explicitly with valueOf() method.
        System.out.println(m);
        Integer wrapObj= i; //autoboxing, now compiler will write Integer.valueOf(m) internally
        System.out.println(wrapObj);

        //Unboxing----->> its a process of converting object into primitive type;

       int primitive= wrapObj.intValue(); //converting Integer object to int primitive explicitly with help of intValue() method.
        int primt=m;    //unboxing, now compiler will write m.intValue() internally


    }
}
