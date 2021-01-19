import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the PlayButton.
 * 
 * @author JBR 
 * @version 3.0
 */
public class PlayButton extends Buttons
{
    /**
     * Calls the Method checkIfPressed.
     */
    public void act() 
    {
        checkIfPressed();
    }   
    
    /**
     * Checks if the Button was clicked.
     */
    private void checkIfPressed()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new GameScreen());
        }
    }
}
