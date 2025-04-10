package wars;
import java.util.*;
import java.io.*;/*

/**
 * @author Hamza Hasan Memon (22084720)
 * @author Biben Benny (21073767)
 * @author Don Joy (22104894)
 * @author Ibrahim Oladimeji Soyoye (21001067)
 */

/**
 * Frigate is a Sub-Class of Class Ship
 */
public class Frigate extends Ship {
    private int numberOfCannons;
    private boolean hasPinnace;

    public Frigate(String name, String captain, int numberOfCannons, boolean hasPinnace, int battleSkill, ShipState state) {
        super(name, captain, battleSkill, state,"Frigate");
        this.numberOfCannons = numberOfCannons;
        this.hasPinnace = hasPinnace;
        calculateCommissionFee(); // Calculate commission fee
    }
    
     @Override
    public String toString() {
        return super.toString() + ", numberOfCannons=" + numberOfCannons + ", hasPinnace=" + hasPinnace;
    }
    
      @Override
    public void calculateCommissionFee() {
        super.setCommissionFee(numberOfCannons * 10); // Commission fee based on number of cannons
        super.setCanParticipateInBattle(true);
        super.setCanParticipateInSkirmish(true);
        if (this.hasPinnace)
        {
            super.setCanParticipateInBlockade(true);
        }
    }

    
}