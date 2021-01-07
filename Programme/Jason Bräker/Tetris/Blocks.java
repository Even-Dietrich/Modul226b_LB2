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
        // isKeyPressed();
        // drop();
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
            
            /*if (Greenfoot.isKeyDown("down")) 
            {
                turn(90);
            }*/
            
            if (Greenfoot.isKeyDown("left")) 
            {
                setLocation(getX()-20, getY());
            }
            
            if (Greenfoot.isKeyDown("right")) 
            {
                setLocation(getX()+20, getY());
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
            gamescreen.canNotSpawn(1);

        }
        if(isTouching(Blocks.class))
        {
            setLocation(getX(), getY());
            onGround = true;
            
            GameScreen gamescreen = (GameScreen)getWorld();
            gamescreen.canNotSpawn(1);
        }
    }
}
