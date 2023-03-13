package ComparableInterface;

public class Student implements Comparable<Student>{
    int indexNo;
    final float grade;

    public Student(int indexNo,float grade) {
        this.grade = grade;
        this.indexNo=indexNo;
    }

    @Override
    public int compareTo(Student o) {
       return (int) (this.grade-o.grade);
       /*
       * if first grade grater than o.grade it will return +number.
       * if they are equal return 0.
       * if o.grade grater than first garde it will return -number
       * */
    }


}
