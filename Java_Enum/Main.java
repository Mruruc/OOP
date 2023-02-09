package Java_Enum;

public class Main {
    public static void main(String[] args) {
        Planet planet1 = Planet.MERCURY;
        System.out.println(planet1);
        Planet.livable(planet1);
        Planet planet3 = Planet.EARTH;
        Planet.livable(planet3);
        //Because of enum values are public,static and final,
        // we can invoke them with class name;
        System.out.println("--->>> "+Planet.URANUS);
        System.out.println("==================================");
        Planet.ArrayOfConstants();
        Planet.indexOfConstants(planet1);
        Planet.indexOfConstants(planet3);
        try{
            System.out.println(Planet.valueOf("MERCURY"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("===========================");
        Planet.Level level= Planet.Level.LOW;
        System.out.println(level);
        Planet.Level.printValue();

    }
}
