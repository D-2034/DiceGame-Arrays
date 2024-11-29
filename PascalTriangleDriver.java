// Assignment 5 Question 3 | Daniel Yorke, COMP 1131_SW3.1

public class PascalTriangleDriver
{
public static void main(String[] args) 
    {
        // Test runs with different sizes
        System.out.println("Pascal's Triangle with 5 rows:");
        PascalTriangle.printPascalTriangle(5);
        System.out.println();

        System.out.println("Pascal's Triangle with 7 rows:");
        PascalTriangle.printPascalTriangle(7);
        System.out.println();

        System.out.println("Pascal's Triangle with 10 rows:");
        PascalTriangle.printPascalTriangle(10);
    }
}
