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
       addObject(oBlock, 200, 458);
       
       Blocks LBlock = new LBlock();
       addObject(LBlock, 250, 450);
       
       Blocks zBlock = new ZBlock();
       addObject(zBlock, 300, 450);
    }
}
