import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the StartScreen.
 * 
 * @author JBR 
 * @version 4.0
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {    
        super(400, 500, 1);
        prepare();
    }
    
    /**
     * Prepares the StartScreen.
     */
    public void prepare()
    {
       Buttons play = new PlayButton();
       addObject(play, 200, 450);
    }
    
}
