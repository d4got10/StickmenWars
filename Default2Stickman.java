import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default2Stickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default2Stickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Default 2");
        setSpeed(4);
        setHealth(3);
        setDamage(2);
        setAttackRate(15);
        setAttackRange(70);
        setWalkingRange(30);
        this.isAlive = true;
    }
    
    public Default2Stickman()
    {
        InitializeStickman();
    }
    
    public Default2Stickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    }   
}
