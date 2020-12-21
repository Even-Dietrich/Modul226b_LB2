import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author JBR 
 * @version 1
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        super(400, 500, 1);
        prepare();
    }
    
    /**
     * Bereitet die Welt vor. Erzeugt einen Startknopf.
     */
    public void prepare()
    {
       Buttons play = new PlayButton();
       addObject(play, 200, 450);
    }
    
}
