
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }

    public int damage()
    {
        int returnDamage;
        if(rand.nextInt(20) == 0) {
            returnDamage = (rand.nextInt(strength)+1)+50;
        } else {
            returnDamage = (rand.nextInt(strength)+1);
        }
        return returnDamage;
    }
}
