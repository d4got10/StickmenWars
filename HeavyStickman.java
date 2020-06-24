import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavyStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavyStickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Heavy");
        setSpeed(2);
        setHealth(50);
        setDamage(3);
        setAttackRate(7);
        setAttackRange(80);
        setWalkingRange(30);
        this.isAlive = true;
    }
    
    public HeavyStickman()
    {
        InitializeStickman();
    }
    
    public HeavyStickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    }     
}
