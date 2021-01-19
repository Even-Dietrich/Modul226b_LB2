import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class represents the J Block.
 * 
 * @author JBR 
 * @version 3.0
 */
public class JBlock extends Blocks
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
