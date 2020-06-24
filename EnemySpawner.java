import greenfoot.*;
/**
 * Write a description of class EnemySpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpawner extends Spawner
{
    long currentTime = 0; 
    public void act()
    {
        if(currentTime < System.currentTimeMillis() - 2000){
            int number = Greenfoot.getRandomNumber(100);
            if(number < 35){
                getWorld().addObject(new DefaultStickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125);  
            }else if(number < 55){
                getWorld().addObject(new Default2Stickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125); 
            }else if(number < 70){
                getWorld().addObject(new SpearStickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125); 
            }else if(number < 85){
                getWorld().addObject(new SwordStickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125); 
            }else if(number < 92){
                getWorld().addObject(new KatanaStickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125); 
            }else if(number < 100){
                getWorld().addObject(new HeavyStickman(true), 
                                        getWorld().getWidth() - 100, 
                                        getWorld().getHeight() / 2 + 125); 
            }
            
            currentTime = System.currentTimeMillis();
        }
    }//
}
