import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author JBR 
 * @version 1
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        super(400, 500, 1);
        prepare();
    }
    
    /**
     * 
     */
    private void prepare()
    {
        showText("Play again?", 200, 50);
        
        Buttons PlayAgain = new PlayButton();
        addObject(PlayAgain, 200, 450);
    }
}
