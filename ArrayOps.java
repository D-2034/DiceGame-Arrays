/* Student ID: COMP 1131, Daniel Yorke. 
 * Assignment 5, Question 1: 
*/

import java.util.Random;
import java.util.Scanner;

public class ArrayOps {
    private char[] array;

    public ArrayOps(int size)  // constructor which accepts size of array as a parameter
    {  
        array = new char[size];
        Random rnd = new Random();
        for (int index = 0; index < size; index++) {
            array[index] = (char) ('a' + rnd.nextInt(26));
        // goes through array and assigns random character to each cell of array. 
        }
    }

    public char getMin() // method to find the smallest character in the array
    {
        char min = array[0];
        for (char c : array) 
        {
            if (c < min) 
            {
                min = c;
            }
        // for-each loop   
        }
        return min;
    }

    public char getMax() // same as getMin method
    {
        char max = array[0];
        for (char c : array) 
        {
            if (c > max) 
            {
                max = c;
            }
        }
        return max;
    }

    
   public String toString() 
    {
        String result = ""; // to make proper spacing between elements 
        for (int i = 0; i < array.length; i++) 
        {
            result += array[i];
            if (i < array.length - 1) 
            {
                result += ", ";
            }
        }
        return result;
    }
}
