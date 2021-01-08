import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blocks here.
 * 
 * @author JBR 
 * @version 1.0
 */
public class Blocks extends Actor
{
    private boolean onGround = false;
    /**
     * Act - do whatever the Blocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    
    /**
     * 
     */
    public void isKeyPressed()
    {
        if(onGround == false){
            if (Greenfoot.isKeyDown("up")) 
            {
                turn(-90);
            }
            
            if (Greenfoot.isKeyDown("down")) 
            {
                setLocation(getX(), getY()+10);
            }
            
            if (Greenfoot.isKeyDown("left")) 
            {
                setLocation(getX()-2, getY());
            }
            
            if (Greenfoot.isKeyDown("right")) 
            {
                setLocation(getX()+2, getY());
            }
    }
    }
    
    public void drop()
    {
        if(onGround == false)
        {
            setLocation(getX(), getY()+1);
            nextBlock();
        }
    }
    
    public void nextBlock()
    {
        if(isTouching(Ground.class))
        {
            setLocation(getX(), getY());
            onGround = true;
            GameScreen gamescreen = (GameScreen)getWorld();
            gamescreen.addScore(20);
            
            gamescreen.canNotSpawn(1);
        }
        if(isTouching(Blocks.class))
        {
            setLocation(getX(), getY());
            onGround = true;
            GameScreen gamescreen = (GameScreen)getWorld();
            gamescreen.addScore(20);
            
            gamescreen.canNotSpawn(1);
        }
    }
}
