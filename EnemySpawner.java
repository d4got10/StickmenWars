import greenfoot.*;
/**
 * Write a description of class EnemySpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpawner extends Actor  
{
    long currentTime = 0; 
    public void act()
    {
        if(currentTime < System.currentTimeMillis() - 2000){
            if(Greenfoot.getRandomNumber(100) < 75){
                getWorld().addObject(new DefaultStickman(true), 
                                        getWorld().getWidth() - 5, 
                                        getWorld().getHeight() / 2);  
            }else{
                getWorld().addObject(new SwordStickman(true), 
                                        getWorld().getWidth() - 5, 
                                        getWorld().getHeight() / 2); 
            }
            
            currentTime = System.currentTimeMillis();
        }
    }//
}
