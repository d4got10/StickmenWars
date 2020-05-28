import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stickmen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Stickman extends Actor
{
    public boolean isEnemy = false;
    public boolean isAlive = true;
    
    private int health = 3;
    private int speed = 5;
    private int damage = 1;
    private int attackRate = 5;
    private int attackRange = 50;
    
    private String imagePath = "Stickman_";
    
    private int animationCounter = 0;
    private int animationState = 0; //0 - moving; 1 - attacking
    
    private Stickman stickmanInFront;
    
    public void act() 
    {
        if(isAlive){
            if(!checkCollision()) move();
            else attack(); 
        }else{
            getWorld().removeObject(this);
        }
    }    
    
    private boolean checkCollision()
    {
        if(stickmanInFront == null || !stickmanInFront.isAlive)
        {
            Stickman stickman = getClosestStickman();        
            
            if(stickman != null){
                if(stickman.isAlive)
                {
                    stickmanInFront = stickman;
                    return true;
                }
                else
                {
                    stickmanInFront = null;   
                    return false;
                }
            }else{
                stickmanInFront = null; 
                return false;
            }
        }else{
            if(stickmanInFront != null && (isEnemy == stickmanInFront.isEnemy) && Math.abs(stickmanInFront.getX() - getX()) < attackRange) return false;
            if(stickmanInFront != null && stickmanInFront.isAlive && Math.abs(stickmanInFront.getX() - getX()) < attackRange) return true;
            else stickmanInFront = null;
            return false;
        }
    }
    
    public void attack()
    {
        if(stickmanInFront != null && (isEnemy != stickmanInFront.isEnemy)){ 
            
            if(animationState == 0){
                animationState = 1;
                animationCounter = 0;
            }
            
            if((animationCounter+1) % (2*attackRate) == 0){
                stickmanInFront.getDamage(damage);
            }
            
            attackAnimation();
        }
    }
    
    public void getDamage(int amount)
    {
        health -= amount;
        if(health <= 0){
            die();
        }
    }
    
    private void die()
    {
        isAlive = false;
    }
    
    public void move()
    {
        if(stickmanInFront == null) super.move(speed);
        if(animationState == 1){
            animationState = 0;
            animationCounter = 0;
        }
        moveAnimation(speed);
    }
    
    protected void setImageName(String name)
    {
        imagePath += name + "_";
    }
    
    protected void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    protected void setAttackRange(int attackRange)
    {
        this.attackRange = attackRange;
    }
    
    protected void setAttackRate(int attackRate)
    {
        this.attackRate = attackRate;
    }
    
    protected void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    protected void setHealth(int healt)
    {
        this.health = health;
    }
    
    private void attackAnimation()
    {
        animationCounter++;
        if(animationCounter == attackRate){
            setImage(imagePath + "3.png");
        }else if(animationCounter == 2*attackRate){
            setImage(imagePath + "4.png");
            animationCounter = 0;
        }
    }
    
    private void moveAnimation(int speed)
    {
        animationCounter++;
        if(animationCounter == speed){
            setImage(imagePath + "0.png");
        }else if(animationCounter == 2*speed){
            setImage(imagePath + "1.png");
        }else if(animationCounter == 3*speed){
            setImage(imagePath + "2.png");
            animationCounter = 0;
        }
    }
    
    public void setImage(String path)
    {
        super.setImage(path);
        if(isEnemy) getImage().mirrorVertically();
    }
    
    private Stickman getClosestStickman()
    {
        int dx = attackRange, dy = 0;
        if(isEnemy) dx *= -1;
        List<Stickman> stickmans = getObjectsAtOffset(dx, dy, Stickman.class);
        int minDist = Math.abs(dx);
        Stickman closestStickman = null;
        for(Stickman stickman : stickmans)
        {
            if(stickman.isAlive){
                if(Math.abs(getX() - stickman.getX()) < minDist){
                    minDist = Math.abs(getX() - stickman.getX());
                    closestStickman = stickman;
                }
            }
        }
        return closestStickman;
    }
}
