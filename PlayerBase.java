import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.EventListener;

/**
 * Write a description of class PlayerBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBase extends Base
{
    private BaseHealthBar healthBar;

    public PlayerBase()
    {
        maxHealth = 500;
        health = maxHealth;
        isAlive = true;
        isEnemy = false;
        setOffsetPosition(100, 0);      
    }
    
    public void act()
    {
        if(healthBar == null) 
        {
            healthBar = new BaseHealthBar(getWorld().getWidth()/2, 36, false, this);            
            getWorld().addObject(healthBar, getWorld().getWidth()/4, getWorld().getHeight() - 20);
        }
    }
    
    public void die()
    {
        getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();        
    }
}
