import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwordStickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Sword");
        setSpeed(4);
        setAttackRate(5);
        setAttackRange(80);
        setDamage(2);
        setHealth(3);
        this.isAlive = true;
    }
    
    public SwordStickman()
    {
        InitializeStickman();
    }
    
    public SwordStickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    }    
}
