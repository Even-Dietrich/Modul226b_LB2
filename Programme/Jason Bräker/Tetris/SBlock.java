import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the S Block.
 * 
 * @author JBR 
 * @version 3.0
 */
public class SBlock extends Blocks
{
    /**
     * This Method calls the Methods of Blocks.
     */
    public void act() 
    {
        isKeyPressed();
        drop();
    }    
}
