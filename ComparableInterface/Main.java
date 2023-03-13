package ComparableInterface;

public class Main {

    public static void main(String[] args) {
        Student waflo=new Student(2358, 94.5F);
        Student shipo=new Student(2355,96.9f);

        if(shipo.compareTo(waflo)>0){
            System.out.println("Shipo has higer grade than Waflo");
        }
    }
}
