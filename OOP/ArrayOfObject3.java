package Object_Oriented_Programing;

public class ArrayOfObject3 {
    public static void main(String[] args) {

        Student[] array;
        Student student1=new Student("Alice",21,new double[]{63.1,42.89,98.3});
        Student student2=new Student("Bob",23,new double[]{63.1,74.89,98.3});
        Student student3=new Student("Charlie",19,new double[]{89.9,71.0,95});

        array=new Student[]{student1,student2,student3};


        for (Student student :array) {
            System.out.println(student.getName() +" : "+ student.getAvarageGrade());
        }

    }
}

class Student{
    private String name;
    private int age;
    private double[] grades;

    public Student(String name,int age,double[] grades){
        this.name=name;
        this.age=age;
        this.grades=grades;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double[] getGrades(){
        return this.grades;
    }

    public double getAvarageGrade(){
        double sum=0;
        for (int i = 0; i < this.grades.length; i++) {
            sum=sum+this.grades[i];
        }
        return sum/this.grades.length;
    }

}
