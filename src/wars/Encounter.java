package wars;
import java.util.*;
import java.io.*;

/**
 * @author Hamza Hasan Memon (22084720)
 */

// Encounter class
public class Encounter implements Serializable{
    // Fields
    private int encounterNo; 
    private EncounterType type;
    private String location;
    private int battleSkillRequired;
    private double prizeMoney;

    // Constructor
    public Encounter(int encounterNo, EncounterType type, String location, int battleSkillRequired, double prizeMoney) {
        this.encounterNo = encounterNo;
        this.type = type;
        this.location = location;
        this.battleSkillRequired = battleSkillRequired;
        this.prizeMoney = prizeMoney;
    }

    // Override toString method for displaying encounter information
    @Override
    public String toString() {
        return "Encounter -- "+
                "Encounter No: " + encounterNo +
                "\nType: " + type +
                "\nLocation: " + location +
                "\nBattle Skill Required: " + battleSkillRequired +
                "\nPrize Money: $" + prizeMoney;
    }
    
    // Getter and Setter Methods

    public int getEncounterNo() {
        return encounterNo;
    }

    public void setEncounterNo(int encounterNo) {
        this.encounterNo = encounterNo;
    }

    public EncounterType getType() {
        return type;
    }
    
    // Method to return the EncounterType as a String
    public String getTypeAsString() {
        return type.name(); // Returns the name of the enum constant as a String
    }

    public void setType(EncounterType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBattleSkillRequired() {
        return battleSkillRequired;
    }

    public void setBattleSkillRequired(int battleSkillRequired) {
        this.battleSkillRequired = battleSkillRequired;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(double prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    

}

