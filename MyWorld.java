import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    public GreenfootSound music;
    
    public MyWorld()
    {    
        super(1280, 720, 1);
        
        Setup();
    }
    
    private void Setup()
    {      
        addObject(new EnemySpawner(), 0, 0);
        addObject(new PlayerSpawner(), 0, 0);
        
        addObject(new PlayerBase(), 10, getHeight()/2 - 100);
        addObject(new EnemyBase(), getWidth() - 10, getHeight()/2 - 100);
        
        addObject(new Background(), getWidth()/2, getHeight()/2);
        
        //Visible things below this line
        
        addObject(new MoneyManager(this, getWidth() - 100, getHeight() - 100), 
                  getWidth() - 100, 
                  getHeight() - 100);
        
        //UI
        addObject(new DefaultStickmanButton(), 100, getHeight() - 100);
        addObject(new Default2StickmanButton(), 215, getHeight() - 100);
        addObject(new SpearStickmanButton(), 330, getHeight() - 100);
        addObject(new SwordStickmanButton(), 445, getHeight() - 100);
        addObject(new KatanaStickmanButton(), 560, getHeight() - 100);        
        addObject(new HeavyStickmanButton(), 675, getHeight() - 100);
        
        music = new GreenfootSound("MainTheme.mp3");
        music.setVolume(10);
        //music.playLoop();
        on = true;
    }
    
    private boolean on = false;
    public void SwitchMusic()
    {
        String key = Greenfoot.getKey();
        if (key != null && key.equals("m")) music.setVolume(on ? 0 : 10);
        music.playLoop();
    }
}
