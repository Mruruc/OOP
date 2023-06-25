/*
* In Java,'this' is a reference variable that refers to the current object.*/
public class WhatIsThis {
    public static void main(String[] args) {

    }
}
/*'this' can be used to refer to the current class instance variable: if there is parameter
* with the same name as an instance variable, we can distinguish the class member (instance) within
* our method by using 'this'.*/
class Student {
    int id;
    String name;

  boolean isStudentExists(int id,String name){
      return this.id==id && this.name==name;
  }


    /*
     *'this' can be used to invoke the current class method(implicitly): In Java,'this' keyword
     * can be used to call the current class method.if we do not use 'this',
     *  the compiler automatically adds 'this' to call the current class method.
     * */

    void display(){
        System.out.println("this is a student class method.");
    }

    void show(){
        this.display();
    }
    /*
    * 'this' can be used to invoke the current class constructor: if a class has multiple constructors,
    *the 'this' keyword can be used to invoke one constructor from another.
    * point to underline: call to 'this()' must be the first statement in the constructor.
    * */

    Student(){
        System.out.println("Default Constructor.");
    }

    Student( String name) {
        this();
        this.id = id;
        this.name = name;
    }

    /*
    * 'this' can be passed as an argument in the method call: In some cases, we might need to
    * pass the current class instance to another method.  */
    void studentInfo(Student student){
        System.out.println(student.id +"," + student.name);
    }
    void showInfo(){
        this.studentInfo(this);
    }

    /*
    * this can be used to return the current class instance:
    * we can use this keyword to return the current class instance from the method.
    * */
    Student getStudent(){
        return this;
    }
    void display2() {
        Student s = getStudent();
        System.out.println("The returned student: " + s.name);
    }

    public static void main(String[] args) {
        Student student =new Student("Wafflo");
        student.showInfo();
        student.display2();
    }

}