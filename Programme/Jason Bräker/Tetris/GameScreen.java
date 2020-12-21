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
        super(500, 600, 1);
        getBackground().setColor(Color.GREY);
        getBackground().fill();
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
