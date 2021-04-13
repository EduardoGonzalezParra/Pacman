import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigCircle extends Circles
{
    public BigCircle()
    {
        setImage("images/gold-ball.png");
        Score = 50;
    }
    
    public void act() 
    {
        Eat();/// Add your action code here.
    }    
}
