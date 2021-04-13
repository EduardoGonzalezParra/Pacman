import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Food
{
    public Cherry()
    {
        setImage("images/cherries.png");
        Score = 30;
    }
    
    public void act() 
    {
        Eat();// Add your action code here.
    }    
}
