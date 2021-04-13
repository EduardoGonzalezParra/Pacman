import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Food extends Actor
{
    protected int Score;
    
    void Eat(){
        if(isTouching(Pacman.class)){
            PacmanLevel1.score += Score;
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        
    }    
}
