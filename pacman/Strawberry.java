import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Food
{
    public Strawberry()
    {
        setImage("images/strawberry.png");
        Score = 40;
    }
    
    public void act() 
    {
        Eat();
    }    
}
