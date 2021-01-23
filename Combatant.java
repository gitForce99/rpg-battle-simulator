import java.util.*;

public abstract class Combatant{
    private int MaximumHp;
    private int CurrentHp;
    private int MaximumMp;
    private int CurrentMp;
    private int Strength;
    private int Defense;
    private int Intelligence;
    private int MagicDefense;
    private int Agility;


    final int getMaximumHP() {
        return MaximumHp;
    }

    final setMaximumHP(int newHP) {
        MaximumHp = newHP;
    }

    final int getCurrentHp() {
        return CurrentHp;
    }

    final setCurrentHp(int newHP) {
        CurrentHp = newHP;
    }

    final int getMaximumMp() {
        return MaximumMp;
    }

    final setMaximumMp(int newMP) {
        MaximumMp = newMP;
    }

    final int getCurrentMp() {
        return CurrentMp;
    }

    final setCurrentMp(int newMP) {
        CurrentMp = newMP;
    }

    final int getStrength() {
        return Strength;
    }

    final setStrength(int newStrength) {
        Strength = newStrength;
    }

    final int getDefense() {
        return Defense;
    }

    final setDefense(int newDefense) {
        Defense = newDefense;
    }

    final int getIntelligence() {
        return Intelligence;
    }

    final setIntelligence(int newIntel) {
        Intelligence = newIntel;
    }

    final int getMagicDefense(){
        return MagicDefense;
    }

    final setMagicDefense(int newMagicDefense) {
        MagicDefense = newMagicDefense;
    }

    final int getAgility() {
        return Agility;
    }

    final int setAgility(int newAgility) {
        Agility = newAgility;
    }
}