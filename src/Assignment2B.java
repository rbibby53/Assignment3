//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Assignment#: 2

import java.util.Scanner;
import static java.lang.System.*;

public class Assignment2B {
    public static void main(String[] args){
        Scanner input = new Scanner(in);

        //Get Width
        out.print("Enter width: ");
        int Width = input.nextInt();

        //Get length
        out.print("Enter Height: ");
        int length = input.nextInt();

        //Get DOTS
        out.print("Enter Square feet per dot: ");
        int dots = input.nextInt();

        out.println("A yard of " + length*Width + " square feet will take " + (length*Width)/dots + " dots to cut.");
    }
}

/*
BEGIN MAIN
    Ask User for Width
    Ask User for length
    Ask user for Square feet per dot
    length*Width=area
    area/100=DTC
    print "A yard of " + Area + " square feet will take " + DTC + " dots to cut."
END MAIN
 */
