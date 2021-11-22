
/**
 * Dice creates a die object, making it possible to have a die made. 
 *
 * @author Guest
 * @version 10/28/2021
 */
public class Dice
{
    //notes: PIVs= a single die. value, faces
    private int value, faces;
    public Dice()
    {
        //chaining constructors
        this(6);
    }
    public Dice(int f)
    {
        
        faces=f;//should not say what number its starting on
        this.roll();
    }
    
    //accessors
    public int getValue()
    {
        return value;
    }
    //mutators
     public void roll()
    {
        value=(int)(Math.random()*faces+1);
    }
    
}
