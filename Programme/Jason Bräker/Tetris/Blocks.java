import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blocks here.
 * 
 * @author JBR 
 * @version 1.0
 */
public class Blocks extends Actor
{
    /**
     * Act - do whatever the Blocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        isKeyPressed();
        drop();
    }    
    
    /**
     * 
     */
    public void isKeyPressed()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            turn(-90);
        }
        
        /*if (Greenfoot.isKeyDown("down")) 
        {
            turn(90);
        }*/
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-2, getY());
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+2, getY());
        }
    }
    
    public void drop()
    {
        setLocation(getX(), getY()+1);
    }
}
