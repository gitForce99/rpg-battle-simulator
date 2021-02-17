class SpecificAttack{
    private int magicOrPhysicalOrHeal; //Indicates if an attack is magical (0), physical(1), or a healing move(2)
    private int attackPower;
    private int mandatoryMultitarget;
    private int multitargetAllowed;
    private String attackName;
    private char elementalAffinity;
    private String attackDescription;

    public SpecificAttack(int magOrPhysOrHeal, int atkPwr, int mandMult, int multiAllowed, String atkNm, char eleAff, String atkDesc) {
        magicOrPhysicalOrHeal = magOrPhysOrHeal;
        attackPower = atkPwr;
        mandatoryMultitarget = mandMult;
        multiAllowed = multiAllowed;
        attackName = atkNm;
        elementalAffinity = eleAff;
        attackDescription = atkDesc;

    }
    public String getAttackName() {
        return attackName;
    }

    public int getMagicOrPhysicalOrHeal(){
        return magicOrPhysicalOrHeal;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public int getMandatoryMultitarget(){
        return mandatoryMultitarget;
    }

    public int getMultitargetAllowed(){
        return multitargetAllowed;
    }

    public char getElementalAffinity(){
        return elementalAffinity;
    }

}