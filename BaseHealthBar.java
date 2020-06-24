import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseHealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseHealthBar extends Actor
{
    private Base base;
    
    private int width, height;
    
    private boolean isEnemy;
    
    public BaseHealthBar(int width, int height, boolean isEnemy, Base base)  
    {
        this.width = width - 4;
        this.height = height - 4;
        this.isEnemy = isEnemy;
        this.base = base;
    }
    
    public void act()
    {
        draw();
    }
    
    public void draw()
    {
        GreenfootImage image = new GreenfootImage(width + 4, height + 4);
               
        image.setColor(Color.LIGHT_GRAY);
        image.fillRect(2, 2, 2 + (int)(base.getHealthLeft()*width), height);
        image.setColor(Color.GRAY);
        image.fillRect((int)(base.getHealthLeft()*width), 2, width, height);
        
        image.setColor(Color.BLACK);
        image.fillRect(0, 0, 2 + width, 2);
        image.fillRect(0, 2 + height, 2 + width, 4 + height);
        image.fillRect(0, 0, 2, 4 + height);
        image.fillRect(2 + width, 0, 4 + width, 4 + height);
        
        if(isEnemy) image.mirrorHorizontally();
        
        setImage(image);
    }
}
