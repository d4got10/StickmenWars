import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSpawner extends Spawner
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
                getWorld().addObject(new DefaultStickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
            case 1:{
                getWorld().addObject(new Default2Stickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
            case 2:{
                getWorld().addObject(new SpearStickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
            case 3:{
                getWorld().addObject(new SwordStickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
            case 4:{
                getWorld().addObject(new KatanaStickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
            case 5:{
                getWorld().addObject(new HeavyStickman(), 100, getWorld().getHeight() / 2 + 125);
                break;
            }
        }
    }
}
