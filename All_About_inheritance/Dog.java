package All_About_inheritance;

public class Dog extends Animal{
    private int footNumber;

    public Dog(String name, int age,int footNumber){
        super(name,age);
        this.footNumber=footNumber;
    }
    public void property(){
        System.out.println("The Dog class can access field and method of Animal class");
        System.out.println("These are " + super.getName() +" "+ super.getAge() );
        System.out.println("and method [");
        super.introduce();
        System.out.println("]");
    }
    public void introduce(){
        super.introduce();
    }

    public void introduce(int footNumber){
        System.out.println("I am " + this.getName() + "." + "and i am " + this.getAge() + "years old."  );
         System.out.println("I have " +footNumber+ "leg.");

    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Nela",13,4);
        dog1.introduce();
        dog1.setName("Reso");
        dog1.introduce();

        dog1.property();
    }

}
