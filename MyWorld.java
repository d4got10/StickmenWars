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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        Setup();
    }
    
    private void Setup(){
        for(int i = 0; i < getHeight()/100; i++){
            addObject(new Stickman(), 5, 100*i + 50);
        }
    }
}
