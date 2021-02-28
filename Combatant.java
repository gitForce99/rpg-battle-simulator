public abstract class Combatant{
    protected int maximumHp;
    protected int currentHp;
    protected int maximumMp;
    protected int currentMp;
    protected int strength;
    protected int defense;
    protected int intelligence;
    protected int magicDefense;
    protected int agility;


    final int getMaximumHP() {
        return maximumHp;
    }

    final void setMaximumHP(int newHP) {
        maximumHp = newHP;
    }

    final int getCurrentHp() {
        return currentHp;
    }

    final void setCurrentHp(int newHP) {
        currentHp = newHP;
    }

    final int getMaximumMp() {
        return maximumMp;
    }

    final void setMaximumMp(int newMP) {
        maximumMp = newMP;
    }

    final int getCurrentMp() {
        return currentMp;
    }

    final void setCurrentMp(int newMP) {
        currentMp = newMP;
    }

    final int getStrength() {
        return strength;
    }

    final void setStrength(int newStrength) {
        strength = newStrength;
    }

    final int getDefense() {
        return defense;
    }

    final void setDefense(int newDefense) {
        defense = newDefense;
    }

    final int getIntelligence() {
        return intelligence;
    }

    final void setIntelligence(int newIntel) {
        intelligence = newIntel;
    }

    final int getMagicDefense(){
        return magicDefense;
    }

    final void setMagicDefense(int newMagicDefense) {
        magicDefense = newMagicDefense;
    }

    final int getAgility() {
        return agility;
    }

    final void setAgility(int newAgility) {
        agility = newAgility;
    }
}