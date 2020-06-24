import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stickmen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Stickman extends Entity
{    
    private int health = 3;
    private int speed = 5;
    private int damage = 1;
    private int attackRate = 5;
    private int attackRange = 50;
    private int walkingRange = 25;
    
    private String imagePath = "Stickmen/";
    private String imageName = "";
    
    private int animationCounter = 0;
    private int animationState = 0; //0 - moving; 1 - attacking
    
    private Entity attackTarget;
    
    public void act() 
    {
        if(isAlive){
            if(canAttack()) attack();
            else if(canMove()) move();
        }else{
            dieAnimation();
        }
    }    
    
    private boolean canAttack()
    {
        Entity enemyEntity = getClosestEnemyEntityAlive();
        if(enemyEntity != null){
            attackTarget = enemyEntity;
            return true;
        }else{
            attackTarget = null;
            return false;
        }
    }
    
    private boolean canMove()
    {
        Stickman stickmanInFront = getClosestAllyAlive();
        
        if(animationState == 1){
            animationState = 0;
            animationCounter = 0;
        }
        moveAnimation(speed);
        
        if(stickmanInFront != null)
            return false;
        else
            return true;
    }
    
    public void attack()
    { 
        if(animationState == 0){
            animationState = 1;
            animationCounter = 0;
        }
        
        if((animationCounter+1) % (2*(int)(60 / attackRate)) == 0){
            attackTarget.takeDamage(damage);
        }
        
        attackAnimation(); 
    }
    
    public void takeDamage(int amount)
    {
        health -= amount;
        if(health <= 0){
            die();
        }
    }
    
    protected void die()
    {
        isAlive = false;
    }
    
    public void move()
    {
        super.move(speed);    
    }  
    
    private void dieAnimation()
    {
        if(animationState != 2)
        {
            animationState = 2;
            animationCounter = 0;
        }
        if(animationCounter == 0){
            setImage(imagePath + imageName + "Death 1.png");
        } else if(animationCounter == 10){
            setImage(imagePath + imageName + "Death 2.png");
        }else if(animationCounter == 1000){
            getWorld().removeObject(this);
        }
        animationCounter++;
    }
    
    private void attackAnimation()
    {
        animationCounter++;
        if(animationCounter == (int)(60 / attackRate)){
            setImage(imagePath + imageName + "Attack 1.png");
        }else if(animationCounter == 2*(int)(60 / attackRate)){
            setImage(imagePath + imageName + "Attack 2.png");
            animationCounter = 0;
        }
    }
    
    private void moveAnimation(int speed)
    {
        animationCounter++;
        if(animationCounter == (int)(20 / speed)){
            setImage(imagePath + imageName + "Run 1.png");
        }else if(animationCounter == 2 * (int)(20/speed)){
            setImage(imagePath + imageName + "Run 2.png");
        }else if(animationCounter == 3 * (int)(20/speed)){
            setImage(imagePath + imageName + "Run 3.png");
            animationCounter = 0;
        }
    }
    
    public void setImage(String path)
    {
        super.setImage(path);
        if(isEnemy) getImage().mirrorVertically();
    }
    
    private Stickman getClosestAllyAlive()
    {    
        List<Stickman> stickmans = getIntersectingObjects(Stickman.class); //AtOffset(dx, dy, Stickman.class);
        int minDist = Math.abs(walkingRange);
        Stickman closestStickman = null;
        for(Stickman stickman : stickmans)
        {
            if(stickman.isAlive && (isEnemy == stickman.isEnemy)){
                if(!isEnemy){
                    if(stickman.getX() - getX() < minDist && stickman.getX() - getX() > 0){
                        minDist = Math.abs(getX() - stickman.getX());
                        closestStickman = stickman;
                    }
                }else{
                    if(stickman.getX() - getX() > -minDist && stickman.getX() - getX() < 0){
                        minDist = Math.abs(getX() - stickman.getX());
                        closestStickman = stickman;
                    }
                }
            }
        }
        return closestStickman;
    }
    
    private Entity getClosestEnemyEntityAlive()
    {
        int dx = attackRange, dy = 0;
        if(isEnemy) dx *= -1;
        
        List<Entity> entities = getObjectsAtOffset(dx, dy, Entity.class);
            
        int minDist = Math.abs(attackRange);
        Entity closestEntity = null;
        
        for(Entity entity : entities)
        {
            if(entity.isAlive && (isEnemy != entity.isEnemy)){  
                if(isEnemy){
                    if(entity.getX() - getX() > -minDist && entity.getX() - getX() < 0){
                        minDist = Math.abs(getX() - entity.getX());
                        closestEntity = entity;
                    }
                }else{
                    if(entity.getX() - getX() < minDist && entity.getX() - getX() > 0){
                        minDist = Math.abs(getX() - entity.getX());
                        closestEntity = entity;
                    }
                }
                }
            }     
        if(closestEntity == null)
        {
            entities = getIntersectingObjects(Entity.class);
            minDist = Math.abs(attackRange);
            closestEntity = null;
            
            for(Entity entity : entities)
            {
                if(entity.isAlive && (isEnemy != entity.isEnemy)){             
                    if(Math.abs(entity.getX() - getX()) < minDist){
                            minDist = Math.abs(getX() - entity.getX());
                            closestEntity = entity;
                    }
                }
            }
        }
        
        return closestEntity;
    }
    
    protected void setImageName(String name)
    {
        imagePath += name + " ";
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
    
    protected void setHealth(int health)
    {
        this.health = health;
    }
    
    protected void setWalkingRange(int walkingRange)
    {
        this.walkingRange = walkingRange;
    }
}
