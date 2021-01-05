import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
    int spawnHeight = 0;
    int spawnPosition = 250;
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        super(500, 600, 1);
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        //prepare();
        spawnBlocks();
    }
    
    private void prepare()
    {
       showText("testtesttest", 250, 200);
        
       Blocks oBlock = new OBlock();
       addObject(oBlock, 200, 458);
       
       Blocks LBlock = new LBlock();
       addObject(LBlock, 250, 450);
       
       Blocks zBlock = new ZBlock();
       addObject(zBlock, 300, 450);
    }
    
    /**
     * 
     */
    public void spawnBlocks()
    {
        int blockNumber = Greenfoot.getRandomNumber(7);
        
        if (blockNumber == 1)
        {
            Blocks IBlock = new IBlock();
            addObject(IBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 2)
        {
            Blocks JBlock = new JBlock();
            addObject(JBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 3)
        {
            Blocks LBlock = new LBlock();
            addObject(LBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 4)
        {
            Blocks OBlock = new OBlock();
            addObject(OBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 5)
        {
            Blocks SBlock = new SBlock();
            addObject(SBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 6)
        {
            Blocks TBlock = new TBlock();
            addObject(TBlock, spawnPosition, spawnHeight);
        }
        else if(blockNumber == 7)
        {
            Blocks ZBlock = new ZBlock();
            addObject(ZBlock, spawnPosition, spawnHeight);
        }
    }
    
    
}
