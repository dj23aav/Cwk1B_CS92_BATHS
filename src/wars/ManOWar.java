package wars;
import java.util.*;
import java.io.*;/*

/**
 * @author Hamza Hasan Memon (22084720)
 */

/**
 * ManOWar is a Sub-Class of Class Ship
 */
public class ManOWar extends Ship {
    private int numberOfDecks;
    private int numberOfMarines;

    public ManOWar(String name, String captain, int numberOfDecks, int numberOfMarines, int battleSkill, ShipState state) {
        super(name, captain, battleSkill, state,"ManOWar");
        this.numberOfDecks = numberOfDecks;
        this.numberOfMarines = numberOfMarines;
        calculateCommissionFee(); // Calculate commission fee
    }
    
    @Override
    public String toString() {
        return super.toString() + ", numberOfDecks=" + numberOfDecks + ", numberOfMarines=" + numberOfMarines;
    }
    
    @Override
    public void calculateCommissionFee() {
        if (numberOfDecks == 2) {
            super.setCanParticipateInBattle(true);
            super.setCanParticipateInBlockade(true);
            super.setCommissionFee(300);
        } else {
            super.setCanParticipateInBattle(true);
            super.setCanParticipateInBlockade(true);
            super.setCommissionFee(500);
        }
    }
}
