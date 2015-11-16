
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super();
    }

    public int damage()
    {
        return (rand.nextInt(strength)+1)*2;   
    }
}
