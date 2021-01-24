class SpecificAttack{
    private int magicOrPhysicalOrHeal;
    private int attackPower;
    private int mandatoryMultitarget;
    private int multitargetAllowed;
    private String attackName;
    private char elementalAffinity;

    public SpecificAttack(int magOrPhysOrHeal, int atkPwr, int mandMult, int multiAllowed, String atkNm, char eleAff) {
        magicOrPhysicalOrHeal = magOrPhysOrHeal;
        attackPower = atkPwr;
        mandatoryMultitarget = mandMult;
        multiAllowed = multiAllowed;
        attackName = atkNm;
        elementalAffinity = eleAff;

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