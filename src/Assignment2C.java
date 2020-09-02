//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Assignment#: 2

import java.util.Scanner;
import static java.lang.System.*;

public class Assignment2C {
    public static void main(String[] args){

        Scanner scan = new Scanner(in);

        //Get Horizontal pixels
        out.print("Horizontal pixels: ");
        int hPix = scan.nextInt();

        //Get Vertical pixels
        out.print("Vertical pixels: ");
        int vPix = scan.nextInt();

        //Get Diagonal length
        out.print("Diagonal length in inches: ");
        int DLnght = scan.nextInt();

        //All the math stuff-- no inputs or outputs
        //find area
        int area = (int) (Math.pow(vPix, 2) + Math.pow(hPix, 2));
        //get the diagnal pixles
        int DP = (int) (Math.sqrt(area));
        //get pixles per inch
        int PPI = (DP/DLnght);



        //print resalts
        out.println("The area is " + area);
        out.println("The diagonal pixels are " + DP);
        out.println("The pixels Per Inch are " + PPI);
    }
}

/*
BEGIN MAIN
    READ Horizontal pixels
    READ Vertical pixels
    READ Diagonal length in inches
    Square Vertical pixels and Horizontal pixels and then add them together, assign variable Area
    Square root Area and Assign it Varialbe DP
    Devide DP by Diagonal length in inches and assign it variable PPI
    Print Area
    Print DP
    Print PPI
END MAIN
 */
