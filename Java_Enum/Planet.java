package Java_Enum;

// Enum (Enumeration) is a special class that represents group of constants(unchangeable variables).
public enum Planet {
    //constants should be separated with comma, and uppercase letters;
    MERCURY,VENUS, EARTH,MARS, JUPITER, SATURN, URANUS, NEPTUNE;


     //Enums values are usually used to with SWITCH statement;
    static void livable(Planet planet){
        switch(planet){
            case EARTH -> System.out.println("It is a habitable planet");
            default ->  System.out.println("It is an inhabitable planet");
        }
    }

    //we can loop through Enum constants via values() methods its return array of enum constants;
    static void ArrayOfConstants(){
        for (Planet pp: Planet.values()) {
            System.out.println(pp);
        }
         /*  Planet[] planet=Planet.values();
        for (int i = 0; i < planet.length; i++) {
            System.out.println(planet[i]);
        }*/
    }

    //The Java compiler internally adds the ordinal() method when it creates an enum.
    // The ordinal() method returns the index of the enum value, and it starts from zero.
    static void indexOfConstants(Planet planet){
        System.out.println("The index of this constants ---->"
                +planet.ordinal());
    }

    //We can have enum inside enum(nested enum),also we can have enum inside a class;
     enum Level{
        LOW(36.2),
        MEDIUM(37.0),
        HIGH(38);

        private double temperature;

        //enum can have constructor;
        Level(double temperature){
            this.temperature=temperature;
        }

        static void printValue(){
            for (Level ll: Level.values()){
                System.out.println(ll+"-->"+ll.temperature);
            }
        }

    }

}


