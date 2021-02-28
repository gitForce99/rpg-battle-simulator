import java.util.*;
import java.util.ArrayList;

public abstract class Combatant{
    private int maximumHp;
    private int currentHp;
    private int maximumMp;
    private int currentMp;
    private int strength;
    private int defense;
    private int intelligence;
    private int magicDefense;
    private int agility;


    final int getMaximumHP() {
        return maximumHp;
    }

    final setMaximumHP(int newHP) {
        maximumHp = newHP;
    }

    final int getCurrentHp() {
        return currentHp;
    }

    final setCurrentHp(int newHP) {
        currentHp = newHP;
    }

    final int getMaximumMp() {
        return maximumMp;
    }

    final setMaximumMp(int newMP) {
        maximumMp = newMP;
    }

    final int getCurrentMp() {
        return currentMp;
    }

    final setCurrentMp(int newMP) {
        currentMp = newMP;
    }

    final int getStrength() {
        return strength;
    }

    final setStrength(int newStrength) {
        strength = newStrength;
    }

    final int getDefense() {
        return defense;
    }

    final setDefense(int newDefense) {
        defense = newDefense;
    }

    final int getIntelligence() {
        return intelligence;
    }

    final setIntelligence(int newIntel) {
        intelligence = newIntel;
    }

    final int getMagicDefense(){
        return magicDefense;
    }

    final setMagicDefense(int newMagicDefense) {
        magicDefense = newMagicDefense;
    }

    final int getAgility() {
        return agility;
    }

    final int setAgility(int newAgility) {
        agility = newAgility;
    }
}