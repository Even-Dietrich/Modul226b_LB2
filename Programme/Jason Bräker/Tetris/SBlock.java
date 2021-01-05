import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SBlock here.
 * 
 * @author JBR 
 * @version 1.0
 */
public class SBlock extends Blocks
{
    /**
     * Act - do whatever the SBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        isKeyPressed();
        drop();
    }    
}
