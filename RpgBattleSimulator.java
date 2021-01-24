import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Hashtable;


class RpgBattleSimulator{

    private Hashtable<String,SpecificAttack> MoveTable;
    private Hashtable<String,Job> JobTable;

    public static void main(String[] args) {
        //System.out.println("System call: Generate Luminous Element");
        System.out.println("Welcome to my game, RpgBattleSimulator! Here you can battle premade enemies using traditional JRPG teams.");
        Scanner sc = new Scanner (System.in);
        wait(1000);
        System.out.println("Please enter your name: ");
        String str = sc.nextLine();
        System.out.println("So your name is " + str + "? Cool!");

    }


    private static void createMoves() {
        MoveTable = new Hashtable();
        SpecificAttack Gash = new SpecificAttack(1, 20, 0, 0, "Gash", 'n');
    }


    private static void wait(int ms)
    {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}