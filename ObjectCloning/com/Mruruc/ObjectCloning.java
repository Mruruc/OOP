package com.Mruruc;

public class ObjectCloning implements Cloneable {
    String name;
    int age;

    public ObjectCloning(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Shallow copy:
    /*
    * when makes a copy of an object creates copy of primitive type, but it  points to object type.
    *   */
    public ObjectCloning(ObjectCloning other) {
        this.name= other.name;
         this.age= other.age;
    }

    //Shallow copy:
   @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Deep copy:
    //Creates copy of all data:
    protected Object deepClone(String name,int age) throws CloneNotSupportedException {
        ObjectCloning cloneObj=(ObjectCloning)super.clone();
        cloneObj.name= name;
        cloneObj.age=age;
        return cloneObj;
    }


}
