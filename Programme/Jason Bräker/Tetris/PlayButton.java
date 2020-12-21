import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author JBR 
 * @version 1
 */
public class PlayButton extends Buttons
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkIfPressed();
    }   
    
    /**
     * Kontrolliert ob Knopf gedrückt wurde. 
     * Wenn ja wird der Gamescreen angezeigt.
     * 
     */
    private void checkIfPressed()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new GameScreen());
        }
    }
}
