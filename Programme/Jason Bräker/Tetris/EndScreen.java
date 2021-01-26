import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the EndScreen.
 * 
 * @author JBR 
 * @version 4.0
 */
public class EndScreen extends World
{
    /**
     * Constructor for objects of class EndScreen.
     */
    public EndScreen()
    {    
        super(400, 500, 1);
        prepare();
    }
    
    /**
     * Prepares the EndScreen.
     */
    public void prepare()
    {
        showText("Play again?", 200, 50);
        
        //GameScreen gamescreen = (GameScreen)getWorld();
        showText("Congrats! You reached "+ GameScreen.score + " Points", 200, 70);
        
        Buttons PlayAgain = new PlayButton();
        addObject(PlayAgain, 200, 450);
    }
}
