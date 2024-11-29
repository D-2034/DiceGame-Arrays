/* Student ID: COMP 1131, Daniel Yorke. 
 * Assignment 5, Question 1: 
*/

import java.util.Scanner;

public class ArrayOpsDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many tests would you like to run? Enter here: ");
        int num = scan.nextInt();
        
        for (int i = 0; i < num; i++) { 
            System.out.print("Enter the size of the array: ");
            int size = scan.nextInt();
            while (size <= 0)
            {
            System.out.println("Invalid array size. Please enter a positive integer: ");
            size = scan.nextInt();
            }
            
            {
            
            ArrayOps arrayOps = new ArrayOps(size);
            
            System.out.println("Array contents: " + arrayOps.toString());
            System.out.println("Lowest value: " + arrayOps.getMin());
            System.out.println("Highest value: " + arrayOps.getMax());
            }
        }
        
        
    }
}
