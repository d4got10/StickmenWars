import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultStickman extends Stickman
{
    public DefaultStickman()
    {
        setImageName("Default");
        setSpeed(5);
        this.isAlive = true;
    }
    
    public DefaultStickman(boolean isEnemy)
    {
        setImageName("Default");
        this.isEnemy = isEnemy;
        this.isAlive = true;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    } 
}
