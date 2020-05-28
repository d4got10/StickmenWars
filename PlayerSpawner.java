import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSpawner extends Actor
{
    public static PlayerSpawner instance;
    
    public PlayerSpawner()
    {
        instance = this;
    }
    
    public void spawnStickman(int type)
    {
        switch(type){
            case 0: {
                getWorld().addObject(new DefaultStickman(), 5, getWorld().getHeight() / 2);
                break;
            }
            case 1:{
                getWorld().addObject(new SwordStickman(), 5, getWorld().getHeight() / 2);
                break;
            }
        }
    }
}
