
/**
 * Craps Simulator
 *
 * @author Jack Duncan
 * @version 2021-2-2
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
        Scanner in = new Scanner(System.in);
        System.out.println("LET'S PLAY CRAPS!");
        System.out.println("Do you need instructions (Y/N)?");
        String response = in.nextLine();
        if (response.equalsIgnoreCase("y"))
        {
            rules();
        }
        System.out.println();
        System.out.println("Good Luck!");

    }
}
