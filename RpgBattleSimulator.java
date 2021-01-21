import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;


class RpgBattleSimulator{

    public static void main(String[] args) {
        //System.out.println("System call: Generate Luminous Element");
        System.out.println("Welcome to my game, RpgBattleSimulator! Here you can battle premade enemies using traditional JRPG teams.");
        Scanner sc = new Scanner (System.in);
        wait(1000);
        System.out.println("Please enter your name: ");


    }

    public static void wait(int ms)
    {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}