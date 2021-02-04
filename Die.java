
/**
 * Write a description of class Die here.
 *
 * @author Jack Duncan
 * @version 2021-2-4
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int number;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        number = (int) (Math.random() * 6 + 1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    roll number
     */
    public int getNumber()
    {
        // put your code here
        return number;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param    changes number
     */
    public void roll()
    {
        // put your code here
        number = (int) (Math.random() * 6 + 1);
    }
}
