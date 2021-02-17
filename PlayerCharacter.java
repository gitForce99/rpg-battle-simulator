class PlayerCharacter extends Combatant {

    private Job jobType;
    private String name;


    public PlayerCharacter(String name, Job jobType) {
        self.name = name;
        self.jobType = jobType;
    }




}