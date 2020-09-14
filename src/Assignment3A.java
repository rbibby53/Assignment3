import java.util.Scanner;
import static java.lang.System.*;

public class Assignment3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        boolean party = true;

        out.print("Enter guest 1: ");
        String g1 = input.nextLine().toLowerCase();

        out.print("Enter guest 2: ");
        String g2 = input.nextLine().toLowerCase();

        if (g1.equals("taylor") && g2.equals("fernando")){
                party = false;
        }else if (g2.equals("taylor") && g1.equals("fernando")){
                party = false;
        }


        if (party==true){
            out.print("Your party was a hit!");
        }if (party==false){
            out.print("Your party is ruined and another bad pop song will be written.");
        }
    }
}

/*
BEGIN MAIN
    boolean party = true
    INPUT "enter guest 1: " and assign it g1
    INPUT "enter guest 2: " and assign it g2

    if g1 == taylor AND g2 == fernando{
        party = false
    else if g2 == taylor AND g1 == fernando{
        party = false

    if party == true{
        print("Your party was a hit!")
    }if party == false{
        print("Your party is ruined and another bad pop song will be written.")
    }
END MAIN
 */
