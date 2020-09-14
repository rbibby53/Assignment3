import java.util.Scanner;
import static java.lang.System.*;


public class Assignmnet3C {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(in);

        //ask how many in party
        out.print("How many people in your party? ");
        int party = input.nextInt();

        //ask total
        out.print("What is the total cost of your bill? ");
        float bill = input.nextFloat();

        //if party is more than 6 do more stuff
        if(party >= 6){

            bill = (float) (bill + (bill*.18));

            out.println("Your bill is " + bill);

            //ask if they want to do an additinal tip
            out.print("Would you like to include an additional tip (Y/N)? ");
            String dec = input.next().toLowerCase();

            //if they said yes, ask how much
            if (dec.equals("y")){
                out.print("How much? ");
                float tip = input.nextFloat();
                bill = bill + tip;
            }
        }else{//if they don't have 6 do this
            out.println("Your bill is " + bill);
            out.print("How much for the tip? ");
            float tip = input.nextFloat();
            bill = bill + tip;
        }
        //print final total
        out.print("Total bill is: " + bill);
    }
}

/*
begin main
    input people in party and assign it party
    input bill and sign it bill
    if there is more than 6 people in party{
        bill= bill + (bill*.18)
        print bill
        input would you like to inclube addinal tip? and assign it to dec
        if dec is yes{
            input how much and assign it to tip
            bill = bill + tip
    else{
    print bill
    input how much for tim and assign it to tip
    bill = bill + tip

    print "Total bill is :" bill
 */

