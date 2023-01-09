package All_About_inheritance;

public class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void introduce(){
        System.out.println("I am " + this.name + "." + "and i am " + this.age + "years old."  );
    }


}


