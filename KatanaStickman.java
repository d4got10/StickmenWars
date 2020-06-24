import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KatanaStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KatanaStickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Katana");
        setSpeed(4);
        setHealth(6);
        setDamage(4);
        setAttackRate(12);
        setAttackRange(100);
        setWalkingRange(30);
        this.isAlive = true;
    }
    
    public KatanaStickman()
    {
        InitializeStickman();
    }
    
    public KatanaStickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    }   
}
