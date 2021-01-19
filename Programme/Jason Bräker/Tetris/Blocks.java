import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class is the "Father" of all Blocks. Everthing which includes
 * the Blocks is coded in here.
 * 
 * @author JBR 
 * @version 5.0
 */
public class Blocks extends Actor
{
    private boolean onGround = false;
    
    /**
     * This Method checks if a Key is pressed.
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
    
    /**
     * This Method is responsible for the downwards movement of the Blocks.
     */
    public void drop()
    {
        if(onGround == false)
        {
            setLocation(getX(), getY()+1);
            nextBlock();
        }
    }
    
    /**
     * This Method checks if the next Block can be spawned.
     */
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
