import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{
    public static int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanLevel1()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 784, 1); 
        
        score = 0;
        
        drawWalls();
        
        drawActors();   
    }
    
    public void drawWalls(){
        //Marco externo
        for(int x=36; x<800; x+=72){
            this.addObject(new Wall(), x, 28);
        }
        
        for(int x=36+72; x<750; x+=72){
            this.addObject(new Wall(), x, 784-28);
        }
        
        for(int y=28+56; y<350; y+=56){
            this.addObject(new Wall(), 36, y);
        }
        
        for(int y=448+28; y<800; y+=56){
            this.addObject(new Wall(), 36, y);
        }
        
        for(int y=28+56; y<350; y+=56){
            this.addObject(new Wall(), 792-36, y);
        }
        
        for(int y=448+28; y<800; y+=56){
            this.addObject(new Wall(), 792-36, y);
        }
        
        //TPs
        for(int y=336+28; y<450; y+=56){
            this.addObject(new LeftTP(), 36, y);
        }
        
        for(int y=336+28; y<450; y+=56){
            this.addObject(new RightTP(), 792-36, y);
        }
        
        //Marco interno
        for(int x=288-36; x<600; x+=72){
            this.addObject(new Wall(), x, 28+224);
        }
        
        //for(int x=288-36; x<380; x+=72){
        //    this.addObject(new Wall(), x, 504+28);
        //}
        
        //for(int x=504-36; x<600; x+=72){
        //    this.addObject(new Wall(), x, 504+28);
        //}
        
        for(int y=280+28; y<540; y+=56){
            this.addObject(new Wall(), 288-36, y);
        }
        
        for(int y=280+28; y<540; y+=56){
            this.addObject(new Wall(), 504+36, y);
        }
    }
    
    public void drawActors(){
        addObject(new Pacman(), 130, 100);
        //addObject(new Phantom(), 250, 120);
        
        addObject(new Cherry(), 396, 392);
        addObject(new Strawberry(), 396, 150);
        addObject(new BigCircle(), 130, 392);
        addObject(new BigCircle(), 792-130, 392);
        
        for(int x=144; x<680; x+=72){
            this.addObject(new SmallCircle(), x, 650);
        }     
    }
    
    public void act() 
        {
        showText​("Score: "+ score, 60, 25);
        }  
}
