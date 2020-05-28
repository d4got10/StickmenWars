import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwordStickmanButton extends Buttons
{
    public void onPressed()
    {
        setImage("Button_Stickman_Sword_Pressed.png");
    }
    
    public void onClicked()
    {
        setImage("Button_Stickman_Sword.png");
        PlayerSpawner.instance.spawnStickman(1);
    }  
}
