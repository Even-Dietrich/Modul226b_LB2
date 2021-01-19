import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the O Block.
 * 
 * @author JBR 
 * @version 3.0
 */
public class OBlock extends Blocks
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
