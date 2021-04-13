import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallCircle extends Circles
{
    public SmallCircle()
    {
        setImage("images/beeper.png");
        Score = 10;
    }
    
    public void act() 
    {
        Eat();/// Add your action code here.
    }    
}
