import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KatanaStickmanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KatanaStickmanButton extends Buttons
{
    public KatanaStickmanButton()
    {
        getImage().scale(100, 100);
    }
    public void onPressed()
    {
        setImage("Stickman Katana Button Pressed.png");
        getImage().scale(100, 100);
    }
    
    public void onClicked()
    {
        setImage("Stickman Katana Button.png");
        getImage().scale(100, 100);
        if(MoneyManager.instance.spendMoney(8))
            PlayerSpawner.instance.spawnStickman(4);
    }    
}
