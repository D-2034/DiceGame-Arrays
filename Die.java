// Assignment 5 Question 2 | Daniel Yorke | COMP 1131_SW3.1

import java.util.Random;

public class Die 
{
    public String dieType;
    private Random random;
    public int faceValue;
    public int numFaces;
    private String[] textNames = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", 
                        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", 
                        "Sixteen", "Seventeen", "Eighteen","Nineteen","Twenty"};   

    public Die() 
    {
        this.dieType = "sixSided"; // Default constructor creates six-sided die
        this.numFaces = 6;
        this.random = new Random();
        roll();
    }

    public Die(int numFaces) { // Second constructor specifies how many faces the die has
        if (isValidDieType(numFaces)) 
        {
            this.numFaces = numFaces;
            switch (numFaces) {
                case 4:
                    this.dieType = "fourSided"; 
                    break;
                case 6:
                    this.dieType = "sixSided";
                    break;
                case 8:
                    this.dieType = "eightSided";
                    break;
                case 12:
                    this.dieType = "twelveSided";   
                    break;
                case 20:
                    this.dieType = "twentySided";    
                    break;
            }
        } else 
        {
            System.out.println("Invalid number of die faces. Defaulting to six-sided die.");
            this.dieType = "sixSided";
            this.numFaces = 6;
        }
        this.random = new Random();
        roll();
    }

    private boolean isValidDieType(int numFaces) 
    { // Specifies what is a valid face number
        return numFaces == 4 || numFaces == 6 || numFaces == 8 || numFaces == 12 || numFaces == 20;
    }

   public void roll() 
    { // Rolls the die
        faceValue = random.nextInt(numFaces) + 1;
    } 
    

    public void setFaceValue(int value) 
    {
        if (value >= 1 && value <= numFaces) 
        {
            faceValue = value;
        } 
        else 
        {
            System.out.println("Invalid face value.");
        }
    }

    public int getFaceValue() 
    {
        return faceValue;
    }

    public String getDieType() 
    {
        return dieType;
    }

    public String getFaceName() 
    {
        switch (faceValue) 
        {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            case 20:
                return "Twenty";
            default:
                return "Unknown"; // For debugging
            
        }
    }


    public String toString() 
    {
        return faceValue + " : " + textNames[faceValue-1];
    }

}    
