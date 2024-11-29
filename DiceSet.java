// Assignment 5 Question 2 | Daniel Yorke,  COMP 1131_SW3.1

import java.util.Random;
public class DiceSet
{
    private Die[] sixSidedSet;
    Random random = new Random();

    public DiceSet(int numDice) 
    {
        sixSidedSet = new Die[numDice];
        for (int i = 0; i < numDice; i++) 
        {
            sixSidedSet[i] = new Die(6); // Initialize each die with 6 faces
        }
    }

    public void rollAll() 
    {
        for (Die die : sixSidedSet) // for-each loop to roll each dice in the dice set. 
        {
            die.roll();
        }
       
    }
    
        public String toString() 
        {
        String result = "";
        for (int i = 0; i < sixSidedSet.length; i++) 
        {
            result = result + sixSidedSet[i].toString();
            
            // Add a space between dice, but not at the end
            if (i < sixSidedSet.length - 1) 
            {
                result = result +" | "; 
            }
        }
        return result;
    }
    
}