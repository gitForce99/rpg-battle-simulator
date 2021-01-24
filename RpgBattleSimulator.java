import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Hashtable;


class RpgBattleSimulator{

    Hashtable<String,SpecificAttack> MoveTable;
    Hashtable<String,Job> JobTable;

    public static void main(String[] args) {
        //System.out.println("System call: Generate Luminous Element");
        System.out.println("Welcome to my game, RpgBattleSimulator! Here you can battle premade enemies using traditional JRPG teams.");
        Scanner sc = new Scanner (System.in);
        wait(1000);
        System.out.println("Please enter your name: ");
        String str = sc.nextLine();
        System.out.println("So your name is " + str + "? What a lovely name!");

    }


    private static void createMoves() {

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