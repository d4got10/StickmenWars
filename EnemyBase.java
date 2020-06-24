import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBase extends Base
{    
    private BaseHealthBar healthBar;
    
    public EnemyBase(){
        setup();
    }
    
    private void setup()
    {
        getImage().mirrorHorizontally();
        maxHealth = 100;
        health = maxHealth;
        isEnemy = true;
        isAlive = true;
        setOffsetPosition(-100, 0);
    }
    
    public void act()
    {
        if(healthBar == null) 
        {
            healthBar = new BaseHealthBar(getWorld().getWidth()/2, 36, true, this);            
            getWorld().addObject(healthBar, getWorld().getWidth() - getWorld().getWidth()/4, getWorld().getHeight() - 20);
        }
    }
    
    public void die()
    {
        getWorld().addObject(new YouWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
}
