import java.util.ArrayList;

class EnemyCharacter extends Combatant {

    private ArrayList availableAttacks;
    private String enemyType;
    private String enemyName;

    public EnemyCharacter(String name, String type, ArrayList availableAttacks, int maximumHp, int maximumMp, int strength, int defense, int intelligence, int magicDefense, int agility) {
        this.availableAttacks = availableAttacks;
        this.enemyType = type;
        this.enemyName = name;
        this.maximumHp = maximumHp;
        this.currentHp = maximumHp;
        this.maximumMp = maximumMp;
        this.currentMp = maximumMp;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
        this.magicDefense = magicDefense;
        this.agility = agility;
    }





}