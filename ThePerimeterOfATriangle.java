import java.util.Scanner;

// (Compute the perimeter of a triangle)
//  Write a program that reads three edges 
//  for a triangle and computes the perimeter 
//  if the input is valid. Otherwise, 
//  display that the input is invalid. 
//  The input is valid if the sum of every pair of 
//  two edges is greater than the remaining edge. 
//  (this is pythagorean theorm)

public class ThePerimeterOfATriangle {


    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("enter triangle edge: ");
//  Write a program that reads three edges 
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();

        input.close();
        
 
        Double total = (e1 + e2 + e3);
        
//  The input is valid if the sum of every pair of 
//  two edges is greater than the remaining edge.        
        //  if the input is valid. Otherwise, 
        if (e1 + e2 > e3 && e1 + e3 > e2 && e3 + e2 > e1) {

        System.out.println("The Perimeter Of A Triangle Is " + total);

        }

        //  display that the input is invalid. 
        else
        System.out.println("invalid");




    }

}
