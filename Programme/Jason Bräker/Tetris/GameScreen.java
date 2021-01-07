import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class GameScreen here.
 * 
 * @author JBR
 * @version 1.0
 */
public class GameScreen extends World
{
    int spawnHeight = 0;
    int spawnPosition = 250;
    int groundHeight = 600;
    private int cannotspawn = 0;
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        super(500, 600, 1);
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        prepare();
        spawnBlocks();
    }
    
    public void act()
    {
        spawnBlocks();
    }
    private void prepare()
    {
       Actor ground = new Ground();
       addObject(ground, 0, groundHeight);
    }
    
    public void canNotSpawn(int torf)
    {
        cannotspawn= cannotspawn - torf;
    }
    
    /**
     * 
     */
    public void spawnBlocks()
    {
        if (cannotspawn == 0)    
        {
            // Blocks IBlock = new IBlock();
            // addObject(IBlock, spawnPosition, spawnHeight);
            int blockNumber = Greenfoot.getRandomNumber(7);
            
            if (blockNumber == 0)
            {
                Blocks IBlock = new IBlock();
                addObject(IBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 1)
            {
                Blocks JBlock = new JBlock();
                addObject(JBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 2)
            {
                Blocks LBlock = new LBlock();
                addObject(LBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 3)
            {
                Blocks OBlock = new OBlock();
                addObject(OBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 4)
            {
                Blocks SBlock = new SBlock();
                addObject(SBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 5)
            {
                Blocks TBlock = new TBlock();
                addObject(TBlock, spawnPosition, spawnHeight);
            }
            else if(blockNumber == 6)
            {
                Blocks ZBlock = new ZBlock();
                addObject(ZBlock, spawnPosition, spawnHeight);
            }
            
            cannotspawn = 1;
        }
    }
}
