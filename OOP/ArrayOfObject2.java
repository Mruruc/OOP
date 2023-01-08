package Object_Oriented_Programing;

public class ArrayOfObject2 {
    private String name;
    private int age;
    public ArrayOfObject2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        ArrayOfObject2 [] array=new ArrayOfObject2[4];

        ArrayOfObject2 person1=new ArrayOfObject2("Civocivo",21);
        ArrayOfObject2 person2=new ArrayOfObject2("Nela",25);
        ArrayOfObject2 person3=new ArrayOfObject2("Wafle",5);

        array[0]=new ArrayOfObject2("Tekilo",255); //one of way that we can assign array element.
        array[1]=person1;
        array[2]=person2;
        array[3]=person3;
        System.out.println(array[0]); ///it will be address from memory.
        System.out.println(person1);  ///it will be address  from memory.
        System.out.println(array[1]);  ///it will be address  from memory.

       /* for (ArrayOfObject2 p:array) {   //one of way that we can print object of array.
            System.out.println(p.getName() +" " + p.getAge());
        }*/

        for (int i = 0; i < array.length; i++) {  //one of way that we can print object of array.
            ArrayOfObject2 person = array[i];
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
}
