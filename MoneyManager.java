import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyManager extends Actor
{
    public int moneyCount = 0;
    
    private long moneyIncomeTimer = 0, moneyIncomeDelay = 1000;
    
    private Actor coinIcon;
    
    public static MoneyManager instance;
    
    public MoneyManager(World world, int x, int y)
    {
        instance = this;
        updateImage();
        world.addObject(new CoinIcon(), x + 50, y);
    }
    
    public void act() 
    {
        if(moneyIncomeTimer + moneyIncomeDelay < System.currentTimeMillis())
        {
            moneyIncomeTimer = System.currentTimeMillis();
            addMoney(1);
        }
    }
    
    private void updateImage()
    {       
        GreenfootImage image = new GreenfootImage(""+moneyCount, 48, Color.BLACK, Color.WHITE);
        setImage(image);
    }
    
    public void addMoney(int amount)
    {
        moneyCount += amount;
        updateImage();
    }
    
    public boolean spendMoney(int amount)
    {
        if(moneyCount >= amount){
            moneyCount -= amount;
            updateImage();
            return true;
        }else
            return false;
    }
}
