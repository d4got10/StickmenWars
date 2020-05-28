import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Buttons extends Actor
{
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            onPressed();                    
        }else if(Greenfoot.mouseClicked(this))
        {          
            onClicked();
        }
    }
    
    public void onPressed()
    {
    }
    
    public void onClicked()
    {        
    }
}
