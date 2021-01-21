class SpecificAttack{
    private int magicOrPhysical;
    private int attackPower;
    private int mandatoryMultitarget;
    private int multitargetAllowed;
    private char elementalAffinity;

    public SpecificAttack()

    public int getMagicOrPhysical(){
        return magicOrPhysical;
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

    public char elementalAffinity(){
        return elementalAffinity;
    }

}