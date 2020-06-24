import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpearStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearStickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Spear");
        setSpeed(3);
        setHealth(4);
        setDamage(3);
        setAttackRate(2);
        setAttackRange(160);
        setWalkingRange(30);
        this.isAlive = true;
    }
    
    public SpearStickman()
    {
        InitializeStickman();
    }
    
    public SpearStickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    }    
}
