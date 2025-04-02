package src.wars;

import java.util.*;
import java.io.*;
/**
 * This class implements the behaviour expected from the BATHS
 system as required for 5COM2007 Cwk1B BATHS - Feb 2025
 * 
 * @author A.A.Marczyk 
 * @version 16/02/25
 */

public class SeaBattles implements BATHS 
{
    // may have one HashMap and select on stat

    private String admiral;
    private double warChest;
    private HashMap<String, Ship> reserveFleet = new HashMap<>(); // Reserve fleet as HashMap


//**************** BATHS ************************** 
    /** Constructor requires the name of the admiral
     * @param adm the name of the admiral
     */  
    public SeaBattles(String adm)
    {
       admiral = adm;
       warChest = 1000.0;
        
       setupShips();
       setupEncounters();
    }
    
    /** Constructor requires the name of the admiral and the
     * name of the file storing encounters
     * @param admir the name of the admiral
     * @param filename name of file storing encounters
     */  
    public SeaBattles(String admir, String filename)  //Task 3
    {
      
       admiral = admir;
       warChest = 1000.0; // Example initial war chest amount
       
       
       setupShips();
       // setupEncounters();
       // uncomment for testing Task 
       // readEncounters(filename);
    }
    
    
    /**Returns a String representation of the state of the game,including the name of the 
     * admiral, state of the warChest,whether defeated or not, and the ships currently in 
     * the squadron,(or, "No ships" if squadron is empty), ships in the reserve fleet
     * @return a String representation of the state of the game,including the name of the 
     * admiral, state of the warChest,whether defeated or not, and the ships currently in 
     * the squadron,(or, "No ships" if squadron is empty), ships in the reserve fleet
     **/
    public String toString()
    {
        
        return "null";
    }
    
    
    /** returns true if War Chest <=0 and the admiral's squadron has no ships which 
     * can be retired. 
     * @returns true if War Chest <=0 and the admiral's fleet has no ships 
     * which can be retired. 
     */
    public boolean isDefeated()
    {
        return false;
    }
    
    /** returns the amount of money in the War Chest
     * @returns the amount of money in the War Chest
     */
    public double getWarChest()
    {
        return warChest;
    }
    
    
    /**Returns a String representation of all ships in the reserve fleet
     * @return a String representation of all ships in the reserve fleet
     **/
    public String getReserveFleet()
    {   //assumes reserves is a Hashmap
       
        if (reserveFleet.isEmpty()) {
            return "No ships";
        }
        StringBuilder fleetDetails = new StringBuilder();

        // Iterate through each ship in the reserves
        for (Ship ship : reserveFleet.values()) {
            fleetDetails.append(ship.toString()).append("\n"); // Append each ship's details
        }

        return fleetDetails.toString();
    }
    
    /**Returns a String representation of the ships in the admiral's squadron
     * or the message "No ships commissioned"
     * @return a String representation of the ships in the admiral's fleet
     **/
    public String getSquadron()
    {
   
        
        return "No ships";
    }
    
    /**Returns a String representation of the ships sunk (or "no ships sunk yet")
     * @return a String representation of the ships sunk
     **/
    public String getSunkShips()
    {
       
        return "No ships";
    }
    
    /**Returns a String representation of the all ships in the game
     * including their status
     * @return a String representation of the ships in the game
     **/
    public String getAllShips()
    {
  
        
        return "No ships";
    }
    
    
    /** Returns details of any ship with the given name
     * @return details of any ship with the given name
     **/
    public String getShipDetails(String nme)
    {
         Ship ship = reserveFleet.get(nme); // Assuming reserves is a HashMap with ship names as keys

          if (ship != null) {
            return ship.toString(); // Return the ship's details
          } 
        return "\nNo such ship";
    }     
 
    // ***************** Fleet Ships ************************   
    /** Allows a ship to be commissioned to the admiral's squadron, if there 
     * is enough money in the War Chest for the commission fee.The ship's 
     * state is set to "active"
     * @param nme represents the name of the ship
     * @return "Ship commissioned" if ship is commissioned, "Not found" if 
     * ship not found, "Not available" if ship is not in the reserve fleet, "Not 
     * enough money" if not enough money in the warChest
     **/        
    public String commissionShip(String nme)
    {
        
        return "- Ship not found";
    }
        
    /** Returns true if the ship with the name is in the admiral's squadron, false otherwise.
     * @param nme is the name of the ship
     * @return returns true if the ship with the name is in the admiral's squadron, false otherwise.
     **/
    public boolean isInSquadron(String nme)
    {
        return false;
    }
    
    /** Decommissions a ship from the squadron to the reserve fleet (if they are in the squadron)
     * pre-condition: isInSquadron(nme)
     * @param nme is the name of the ship
     * @return true if ship decommissioned, else false
     **/
    public boolean decommissionShip(String nme)
    {
        return false;
    }
    
  
    /**Restores a ship to the squadron by setting their state to ACTIVE 
     * @param ref the name of the ship to be restored
     */
    public void restoreShip(String ref)
    {
  
        
    }
    
//**********************Encounters************************* 
    /** returns true if the number represents a encounter
     * @param num is the reference number of the encounter
     * @returns true if the reference number represents a encounter, else false
     **/
     public boolean isEncounter(int num)
     {
         return false;
     }
     
     
/** Retrieves the encounter represented by the encounter 
      * number.Finds a ship from the fleet which can fight the 
      * encounter.The results of fighting an encounter will be 
      * one of the following: 
      * 0-Encounter won by...(ship reference and name)-add prize money to War 
      * Chest and set ship's state to RESTING,  
      * 1-Encounter lost as no ship available - deduct prize from the War Chest,
      * 2-Encounter lost on battle skill and (ship name) sunk" - deduct prize 
      * from War Chest and set ship state to SUNK.
      * If an encounter is lost and admiral is completely defeated because there 
      * are no ships to decommission,add "You have been defeated " to message, 
      * -1 No such encounter
      * Ensure that the state of the war chest is also included in the return message.
      * @param encNo is the number of the encounter
      * @return a String showing the result of fighting the encounter
      */ 
    public String fightEncounter(int encNo)
    {
       
            
        return "Not done";
    }

    /** Provides a String representation of an encounter given by 
     * the encounter number
     * @param num the number of the encounter
     * @return returns a String representation of a encounter given by 
     * the encounter number
     **/
    public String getEncounter(int num)
    {
        
        return "\nNo such encounter";
    }
    
    /** Provides a String representation of all encounters 
     * @return returns a String representation of all encounters
     **/
    public String getAllEncounters()
    {
 
        return "No encounters";
    }
    

    //****************** private methods for Task 4 functionality*******************
    //*******************************************************************************
     private void setupShips()
     {
        reserveFleet.put("Victory", new Ship("Victory", "Alan Aikin", 3, 30.0, "ManOWar", 3, 30, "yes", "ManOWar"));
        reserveFleet.put("Sophie", new Ship("Sophie", "Ben Baggins", 8, 16.0, "Frigate", 8, 16, "yes", "Frigate"));
        reserveFleet.put("Endeavour", new Ship("Endeavour", "Col Cannon", 4, 20.0, "ManOWar", 4, 20, "no", "ManOWar"));
        reserveFleet.put("Arrow", new Ship("Arrow", "Dan Dare", 5, 150.0, "Sloop", 5, 150, "yes", "Sloop"));
        reserveFleet.put("Belerophon", new Ship("Belerophon", "Ed Evans", 8, 50.0, "ManOWar", 8, 50, "no", "ManOWar"));
        reserveFleet.put("Surprise", new Ship("Surprise", "Fred Fox", 6, 10.0, "Frigate", 6, 10, "no", "Frigate"));
        reserveFleet.put("Jupiter", new Ship("Jupiter", "Gil Gamage", 7, 20.0, "Frigate", 7, 20, "no", "Frigate"));
        reserveFleet.put("Paris", new Ship("Paris", "Hal Henry", 5, 200.0, "Sloop", 5, 200, "yes", "Sloop"));
        reserveFleet.put("Beast", new Ship("Beast", "Ian Idle", 5, 400.0, "Sloop", 5, 400, "no", "Sloop"));
        reserveFleet.put("Athena", new Ship("Athena", "John Jones", 2, 100.0, "Sloop", 2, 100, "yes", "Sloop"));
    
                                                                                                                               

     }
     
    private void setupEncounters()
    {
  
    }
    // Placeholder for the Ship class by Me
    
    private class Ship {
        private String name;
        private String captain;
        private int battleSkill;
        private double commissionFee;
        private String type;
        private int decks;
        private int marines;
        private String doctorOrPinnace;
        private String shipType;

        public Ship(String name, String captain, int battleSkill, double commissionFee, String type, int decks, int marines, String doctorOrPinnace, String shipType) {
            this.name = name;
            this.captain = captain;
            this.battleSkill = battleSkill;
            this.commissionFee = commissionFee;
            this.type = type;
            this.decks = decks;
            this.marines = marines;
            this.doctorOrPinnace = doctorOrPinnace;
            this.shipType = shipType;
        }

        @Override
        public String toString() {
            return name + " | " + captain + " | " + battleSkill + " | " + commissionFee + " | " + type + " | " + decks + " | " + marines + " | " + doctorOrPinnace + " | " + shipType;
        }

    }

    // Useful private methods to "get" objects from collections/maps

    //*******************************************************************************
    //*******************************************************************************
  
    /************************ Task 3 ************************************************/

    
    //******************************** Task 3.5 **********************************
    /** reads data about encounters from a text file and stores in collection of 
     * encounters.Data in the file is editable
     * @param filename name of the file to be read
     */
    public void readEncounters(String filename)
    { 
      
        
        
    }   
 
    
    // ***************   file write/read  *********************
    /** Writes whole game to the specified file
     * @param fname name of file storing requests
     */
    public void saveGame(String fname)
    {   // uses object serialisation 
           
    }
    
    /** reads all information about the game from the specified file 
     * and returns 
     * @param fname name of file storing the game
     * @return the game (as an SeaBattles object)
     */
    public SeaBattles loadGame(String fname)
    {   // uses object serialisation 
       
        return null;
    } 
    
 
}



