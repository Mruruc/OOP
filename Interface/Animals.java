package Interface;
public interface Animals {
    //by default interface attributes are public,static and final;
    //Which means we have to initialize them if we created ;
    String namee="name";
    //interface methods are by default abstract and public;
    public void sound();
    abstract void eat();
    void reproduction();

}
class Pigs implements Animals{
    private String name;

    public Pigs(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("Quiiiik , quuuiiiik");
    }
    public void eat(){
        System.out.println("yammyyyamambhfvwerf");
    }
    public void reproduction(){
        System.out.println("Male"+ " I love you tekiloo");
        System.out.println("Female"+ " I love you to waflo");
    }

}
interface Second{
    public void method();
}
interface Third{
    public void methodd();
}
class Demo implements Animals,Second,Third{
    public void eat(){
        System.out.println("eat");
    }
    public void sound(){
        System.out.println("Zzzzzzzzzzzzzzzzzz");
    }
    public void reproduction(){
        System.out.println("babyyyy");
    }
    public void method(){
        System.out.println("this method is from second interface! ");
    }
    public void methodd(){
        System.out.println("this method is from Third interface! ");
    }
}

class Mainn{
    public static void main(String[] args) {
        Pigs pigoo=new Pigs("Wafloooo");
        Pigs pigy=new Pigs("Shipoo");

        pigy.eat();
        pigy.sound();
        pigoo.reproduction();
        Demo demo =new Demo();
        demo.eat();
        demo.sound();
        demo.reproduction();
        demo.methodd();
        demo.method();
    }
}
