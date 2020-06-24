import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Base extends Entity
{  
    public int maxHealth;
    
    public double getHealthLeft()
    {
        return (double)health/maxHealth;
    }
}
