// Assignment 5 Question 2 | Daniel Yorke | COMP 1131_SW3.1
 
import java.util.Scanner;
public class DiceDriver
{
             
    public static void main(String[] args)
    {
        // Roll and output for 1 die
        DiceSet diceSet1 = new DiceSet(1); // initialize diceset
        System.out.println("Rolling 1 die 10 times: ");
        for (int i = 0; i < 10; i++) 
        {
            diceSet1.rollAll(); // roll all die in the set
            System.out.println("Roll " + (i + 1) + ": " + diceSet1);
        }

        // Roll and output for 2 dice
        DiceSet diceSet2 = new DiceSet(2);
        System.out.println("\nRolling 2 dice 10 times: ");
        for (int i = 0; i < 10; i++) 
        {
            diceSet2.rollAll();
            System.out.println("Roll " + (i + 1) + ": " + diceSet2);
        }

        // Roll and output for 5 dice
        DiceSet diceSet5 = new DiceSet(5);
        System.out.println("\nRolling 5 dice 10 times: ");
        for (int i = 0; i < 10; i++) 
        {
            diceSet5.rollAll();
            System.out.println("Roll " + (i + 1) + ": " + diceSet5);
        }

        // Roll and output for 10 dice
        DiceSet diceSet10 = new DiceSet(10);
        System.out.println("\nRolling 10 dice 10 times: ");
        for (int i = 0; i < 10; i++) 
        {
            diceSet10.rollAll();
            System.out.println("Roll " + (i + 1) + ": " + diceSet10);
        }
    }

      
}
