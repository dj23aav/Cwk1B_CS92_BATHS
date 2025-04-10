package wars;

import java.util.*;
import java.io.*;

/**
 * @author Hamza Hasan Memon (22084720)
 * @author Biben Benny (21073767)
 * @author Don Joy (22104894)
 * @author Ibrahim Oladimeji Soyoye (21001067)
 */
// Abstract class Ship
abstract class Ship implements Serializable{
    private String name;
    private String captain;
    private double commissionFee;
    private int battleSkill;
    private ShipState state;
    private String ShipType; 

    // Fields for participation in different encounters
    private boolean canParticipateInBlockade;
    private boolean canParticipateInBattle;
    private boolean canParticipateInSkirmish;

    public Ship(String name, String captain, int battleSkill, ShipState state, String ShipType) {
        this.name = name;
        this.captain = captain;
        this.battleSkill = battleSkill;
        this.state = state;
        this.canParticipateInBattle = false;
        this.canParticipateInBlockade = false;
        this.canParticipateInSkirmish = false;
        this.ShipType = ShipType;
    }
    
    // Abstract toString method to show ship details
    @Override
    public String toString() {
        return "Ship - " +
                "name='" + name + '\'' +
                ", captain='" + captain + '\'' +
                ", commissionFee=" + commissionFee +
                ", battleSkill=" + battleSkill +
                ", state=" + state +
                ", canParticipateInBattle=" + canParticipateInBattle +
                ", canParticipateInBlockade=" + canParticipateInBlockade +
                ", canParticipateInSkirmish=" + canParticipateInSkirmish +
                ", ShipType="+ShipType;
    }
    
    // Abstract method for calculating commission fee
    public abstract void calculateCommissionFee();
    
    
    public void setCanParticipateInBlockade(boolean canParticipateInBlockade) {
        this.canParticipateInBlockade = canParticipateInBlockade;
    }
    
    public void setCanParticipateInBattle(boolean canParticipateInBattle) {
        this.canParticipateInBattle = canParticipateInBattle;
    }
    
    public void setCanParticipateInSkirmish(boolean canParticipateInSkirmish) {
        this.canParticipateInSkirmish = canParticipateInSkirmish;
    }
    
    public void setCommissionFee(double commissionFee) {
        this.commissionFee = commissionFee;
    }
    
     // Methods to participate in different encounters
    public boolean participateInBlockade() {
        return canParticipateInBlockade;
    }

    public boolean participateInBattle() {
        return canParticipateInBattle;
    }

    public boolean participateInSkirmish() {
        return canParticipateInSkirmish;
    }
    
    public boolean participateInEncounter(String type) {
        switch (type) {
            case "BATTLE":
                return canParticipateInBattle;
            case "BLOCKADE":
                return canParticipateInBlockade;
            case "SKIRMISH":
                return canParticipateInSkirmish;
            default:
                return false;
        }
    }
    
    
    public boolean isInReserve() {
        return state == ShipState.RESERVE;
    }
    
    public boolean isActive() {
        return state == ShipState.ACTIVE;
    }

    public boolean isResting() {
        return state == ShipState.RESTING;
    }

    public boolean isSunk() {
        return state == ShipState.SUNK;
    }
    
    public void setState(ShipState state) {
        this.state = state;
    }
    
   public String getName() {
        return name;
    }
   
   public double getCommissionFee() {
        return commissionFee;
    }
   
   public int getBattleSkill() {
        return battleSkill;
    }

}
