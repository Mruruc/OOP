package com.Mruruc;
        //cloning object:
        /*
         When we clone an object in Java, a new object is created with its own memory address in the heap.
         So in this case, obj1 and obj2 are separate objects with their own memory addresses in the heap,
         even though they have the same property values.

         Each object will occupy its own memory space,
         consisting of separate memory segments for each of its instance variables.
         In this case, each object has two instance variables (name and age),
         so each object will occupy its own space in memory to hold those variables.
         */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectCloning obj1=new ObjectCloning("Waflo",20);

       // ObjectCloning obj2=new ObjectCloning(obj1);
      //  System.out.println(obj2.name+" "+obj2.age);
        //because of when we make a change on object,its effect others,
        // it's a Shallow copy example;
      //  obj2.name="Shipo";
      //  System.out.println(obj2.name+" "+obj2.age);
       // obj2.age=10;
        //System.out.println(obj2.name+" "+obj2.age);

        //However copying an object with custom constructor it might be inefficient.
        //on this approach we can use clone method from Cloneable interface.


//        System.out.println(obj1.name + " " + obj1.age);
//        ObjectCloning cloneObj = null;
//        try {
//            cloneObj = (ObjectCloning) obj1.clone();
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e.toString());
//        }
//
//        String cloneName = cloneObj.name;
//        int cloneAge = cloneObj.age;
//
//        System.out.println(cloneName + " " + cloneAge);

        //Deep Copy:

        ObjectCloning deepClone=(ObjectCloning) obj1.deepClone("Shipo",100);

        System.out.println(deepClone.name+" "+ deepClone.age);
        System.out.println(obj1.name+" "+obj1.age);


    }
}
