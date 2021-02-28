class PlayerCharacter extends Combatant {

    private Job jobType;
    private String name;
    private int level;


    public PlayerCharacter(String name, Job jobType) {
        self.name = name;
        self.jobType = jobType;
        self.maximumHp = 300;
        self.currentHp = 300;
        self.maximumMp = 100;
        self.currentMp = 100;
        self.strength = 5;
        self.defense = 5;
        self.intelligence = 5;
        self.magicDefense = 5;
        self.agility = 5;
        self.level = 1;
    }




}