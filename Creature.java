import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author      David Martinez
 * @version     11-16-2015
 */
public class Creature
{
   protected Random rand = new Random();
   protected int hp;
   protected int strength;
   
   public Creature(){
       hp = rand.nextInt(6)+5;
       strength = rand.nextInt(6)+5;
   }
   
   public Creature(int hp, int strength){
       this.hp = rand.nextInt(hp-4)+5;
       this.strength = rand.nextInt(strength-4)+5;
   }
    
   public int damage(){
       return (rand.nextInt(strength))+1;
   }
    
}
