import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default2StickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default2StickmanButton extends Buttons
{
    public Default2StickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Default 2 Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Default 2 Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(2))
            PlayerSpawner.instance.spawnStickman(1);
    }   
}
