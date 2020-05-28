import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    public MyWorld()
    {    
        super(1280, 720, 1);
        
        Setup();
    }
    
    private void Setup(){
        //GreenfootSound music = new GreenfootSound("MainTheme.mp3");
        //music.setVolume(10);
        addObject(new EnemySpawner(), 0, 0);
        addObject(new PlayerSpawner(), 0, 0);
        addObject(new DefaultStickmanButton(), 100, getHeight() - 100);
        addObject(new SwordStickmanButton(), 215, getHeight() - 100);
        //music.playLoop();
    }
}
