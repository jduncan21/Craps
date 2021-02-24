
/**
 * Craps Simulator
 *
 * @author Jack Duncan
 * @version 2021-2-4
 */

import java.util.Scanner;
public class Craps
{
    public static void rules()
    {      
        System.out.println("1. Roll two six-sided dice.");
        System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
        System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
        System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
        System.out.println("3. Keep rolling the dice again until:");
        System.out.println("4. a. You roll the point again and win!");
        System.out.println("4. b. or you roll a 7 and lose.");
    }

    public static void main(String[] args)
    {
        // intializing variables/objects
        boolean done = false;
        boolean donePoint = false;
        Die d1 = new Die();
        Die d2 = new Die();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play Craps (Y/N)? ");
        String response1 = in.nextLine();
        if (response1.equalsIgnoreCase("y"))
        {
            System.out.println("Do you need instructions (Y/N)?");
            System.out.println("LET'S PLAY CRAPS!");
            System.out.println("Do you need instructions (Y/N)?");
            String response2 = in.nextLine();
            if (response2.equalsIgnoreCase("y"))
            {
                rules();
            }
            System.out.println();
            System.out.println("Good Luck!");
        }
        else
        {
            System.out.println("Goodbye!");
            done = true;
        }
        while (!done)
        {
            d1.roll();
            d2.roll();
            int firstRoll = d1.getNumber() + d2.getNumber();
            System.out.println("Press <enter> to roll: ");
            String enter = in.nextLine();
            System.out.println("First roll ...");
            System.out.println("Your rolled a " + (firstRoll) + "!");
            if (firstRoll == 7 || firstRoll == 11)
            {
                System.out.println("You win!");
            }
            else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println(firstRoll + " is your point!");
                while (!donePoint)
                {
                    System.out.println("Press <enter> to roll: ");
                    enter = in.nextLine();
                    System.out.println("Rolling ...");
                    d1.roll();
                    d2.roll();
                    System.out.println("Your rolled a " + (d1.getNumber() + d2.getNumber()) + "!");
                    if (d1.getNumber() + d2.getNumber() == firstRoll)
                    {
                        System.out.println("You win!");
                        donePoint = true;
                    }
                    else if (d1.getNumber() + d2.getNumber() == 7)
                    {
                        System.out.println("You lose!");
                        donePoint = true;
                    }
                }
            }
            System.out.println("Press Q to quit, anything else to play again: ");
            String ans = in.nextLine();
            donePoint = false;
            if (ans.equalsIgnoreCase("q"))
            {
                System.out.println("Goodbye!");
                done = true;
            }
        }
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

Super-clean version of this game, and I love how you structured your
code. Top notch!

SCORE: 16/15

*/

