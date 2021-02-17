class EnemyCharacter extends Combatant.java {

    private ArrayList availableAttacks;
    private String enemyType;
    private String enemyName;

    public EnemyCharacter(String name, String type, ArrayList availableAttacks) {
        self.availableAttacks = availableAttacks;
        self.enemyType = type;
        self.enemyName = name;
    }





}