import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity extends Actor
{
    public boolean isAlive;
    public boolean isEnemy;
    
    public int xPosition;
    public int yPosition;
    
    protected int health;
    
    public void takeDamage(int amount)
    {
        health -= amount;
        if(health < 0)
        {
            health = 0;
            die();
        }
    }
    
    protected void die()
    {
        getWorld().removeObject(this);
    }
    
    protected void setOffsetPosition(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }
    
    public int getX()
    {
        return super.getX() + xPosition;
    }
    
    public int getY()
    {
        return super.getY() + yPosition;
    }
}
