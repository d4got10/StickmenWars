import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stickmen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stickman extends Actor
{
    int counter = 0;
    public int speed = 5;
    private String imagePath = "Stickman_Default_";
    
    public Stickman(){
        speed = Greenfoot.getRandomNumber(15) + 5;
    }
    
    public void act() 
    {
        counter++;
        if(counter > 2) counter = 0;
        setImage(imagePath+counter+".png");
        move(speed);
        if(getX() > getWorld().getWidth() - 2){
            setLocation(2, getY());
        }
        //setImage("Stickman_Default_0.png");
    }    
}
