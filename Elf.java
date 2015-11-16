
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super();
    }
    
    public int damage()
    {
        int returnDamage;
        if(rand.nextInt(10) == 0) {
            returnDamage = (rand.nextInt(strength)+1)*2;
        } else {
            returnDamage = (rand.nextInt(strength)+1);
        }
        return returnDamage;
    }
}
