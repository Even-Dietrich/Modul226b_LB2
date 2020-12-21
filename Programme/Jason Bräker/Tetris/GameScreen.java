import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{

    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
       showText("testtesttest", 250, 200);
        
       Blocks oBlock = new OBlock();
       addObject(oBlock, 200, 450);
       
       Blocks lBlock = new LBlock();
       addObject(lBlock, 250, 450);
    }
}
