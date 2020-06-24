import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwordStickmanButton extends Buttons
{
    public SwordStickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Sword Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Sword Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(5))
            PlayerSpawner.instance.spawnStickman(3);
    }  
}
