package SingletonClass;


public class Main {
    public static void main(String[] args) {
   // because of the constructor is private we can not create object via using constructor.
        //SingletonClass.Singleton obj1=new SingletonClass.Singleton();

//        SingletonClass.Singleton obj1 = null; because this object is null,we can not call get instance Method with this object.
//        SingletonClass.Singleton obj2=obj1.getInstance();

        /*
       * To call and create single object of SingletonClass.Singleton class,getInstance Method should be static:
       */

        Singleton obj3=Singleton.getInstance();
        System.out.println(obj3);


    }
}