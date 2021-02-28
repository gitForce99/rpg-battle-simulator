import java.util.ArrayList;

class PlayerCharacter extends Combatant {

    private Job jobType;
    private String name;
    private int level;


    public PlayerCharacter(String name, Job jobType) {
        this.name = name;
        this.jobType = jobType;
        this.maximumHp = 300;
        this.currentHp = 300;
        this.maximumMp = 100;
        this.currentMp = 100;
        this.strength = 5;
        this.defense = 5;
        this.intelligence = 5;
        this.magicDefense = 5;
        this.agility = 5;
        this.level = 1;
    }




}