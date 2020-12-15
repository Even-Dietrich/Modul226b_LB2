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
        super(400, 400, 1);
        prepare();
    }
    
    /**
     * Bereitet die Welt vor. Erzeugt einen Startknopf.
     */
    public void prepare()
    {
       Buttons play = new StartButton();
       addObject(play, 250, 300);
    }
    
}
