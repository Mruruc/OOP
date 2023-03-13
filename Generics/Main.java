package Generics;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<String> list=new CustomArrayList<>();
        list.add("Waflo");
        list.add("Shipo");
        list.add("Nelo");

        list.print();
        System.out.println(list.getIndex("Shipo"));
        System.out.println(list.size());
    }
}
