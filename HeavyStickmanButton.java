import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavyStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavyStickmanButton extends Buttons
{
    public HeavyStickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Heavy Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Heavy Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(15))
            PlayerSpawner.instance.spawnStickman(5);
    }   
}
