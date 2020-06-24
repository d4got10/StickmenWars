import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DefaultStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultStickmanButton extends Buttons
{
    public DefaultStickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Default Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Default Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(1))
            PlayerSpawner.instance.spawnStickman(0);
    }
}
