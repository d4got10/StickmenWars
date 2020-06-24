import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultStickman extends Stickman
{
    private void InitializeStickman()
    {
        setImageName("Default");
        setSpeed(5);
        setHealth(3);
        setDamage(1);
        setAttackRate(12);
        setAttackRange(50);
        setWalkingRange(30);
        this.isAlive = true;
    }
    
    public DefaultStickman()
    {
        InitializeStickman();
    }
    
    public DefaultStickman(boolean isEnemy)
    {
        InitializeStickman();
        
        this.isEnemy = isEnemy;
        if(isEnemy){
            turn(180);
            getImage().mirrorVertically();
        }
    } 
}
