import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Hashtable;


class RpgBattleSimulator{

    private Hashtable<String,SpecificAttack> moveTable;
    //private Hashtable<String,Job> JobTable;

    /*public RpgBattleSimulator() {
        MoveTable = new Hashtable<String,SpecificAttack>();
    }*/

    public static void main(String[] args) {
        //System.out.println("System call: Generate Luminous Element");
        RpgBattleSimulator myProgram = new RpgBattleSimulator();

        System.out.println("Welcome to my game, RpgBattleSimulator! Here you can battle premade enemies using traditional JRPG teams.");
        Scanner sc = new Scanner (System.in);
        myProgram.wait(1000);
        System.out.println("Please enter your name: ");
        String str = sc.nextLine();
        System.out.println("So your name is " + str + "? Cool!");


        myProgram.createMoves();


    }


    private void createMoves() {
        moveTable = new Hashtable();
        SpecificAttack strike = new SpecificAttack(1, 20, 0, 0, "Strike", 'n', "A simple physical attack");
        SpecificAttack lash = new SpecificAttack(1, 40, 0, 0, "Lash", 'n', "A strong physical attack");
        SpecificAttack heal = new SpecificAttack(2, 10, 0, 0, "Heal", 'n', "A simple healing spell");
        SpecificAttack spark = new SpecificAttack(0, 20, 0, 0, "Spark", 'e', "A simple electric attack");
        moveTable.put(strike.getAttackName(), strike);
        moveTable.put(lash.getAttackName(), lash);
        moveTable.put(heal.getAttackName(), heal);
        moveTable.put(spark.getAttackName(), spark);
        System.out.print("Moves successfully loaded");
    }

    private void createJobs() {


    }

    private void wait(int ms)
    {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}