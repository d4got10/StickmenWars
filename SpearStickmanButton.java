import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpearStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearStickmanButton extends Buttons
{
    public SpearStickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Spear Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Spear Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(3))
            PlayerSpawner.instance.spawnStickman(2);
    }    
}
