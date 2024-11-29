// Assignment 5 Question 3 | Daniel Yorke, COMP 1131_SW3.1

public class PascalTriangle {
    // Recursive method to calculate the value at the 'r' row and 'c' column
    public static int pascalValue(int r, int c) 
    {
        if (c == 0 || c == r) 
        {
            return 1; // this is the base case for the recursive logic
        } else {
            return pascalValue(r - 1, c - 1) + pascalValue(r - 1, c);
        }
    }

    // Method to print Pascal's Triangle up to the Nth line (nested loops)
    public static void printPascalTriangle(int N) 
    {
        for (int r = 0; r < N; r++) 
        {
            // Print leading spaces for alignment in triangle
            for (int i = 0; i < N - r - 1; i++) 
            {
                System.out.print(" ");
            }
            // Print Pascal's Triangle values
            for (int c = 0; c <= r; c++) 
            {
                System.out.print(pascalValue(r, c) + " ");
            }
            System.out.println();
        }
    }
    
}