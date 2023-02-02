
package good_Task;

import java.util.Random;

public class DiceRoller {
   Random random;
    int number;
      DiceRoller(){
       // random=new Random();
        roll();
    }
    void roll(){
        this.number=random.nextInt(6)+1;
        System.out.println(this.number);
    }
    public static void main(String[] args){
        DiceRoller obj= new DiceRoller();

    }
}
