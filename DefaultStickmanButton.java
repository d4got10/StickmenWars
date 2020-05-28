import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DefaultStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultStickmanButton extends Buttons
{
    public void onPressed()
    {
        setImage("Button_Stickman_Default_Pressed.png");
    }
    
    public void onClicked()
    {
        setImage("Button_Stickman_Default.png");
        PlayerSpawner.instance.spawnStickman(0);
    }
}
