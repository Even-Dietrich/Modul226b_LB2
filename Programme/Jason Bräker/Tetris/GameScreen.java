import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * This Class represents the Gamescreen. Everything in this Game is 
 * happening on the gamescreen.
 * 
 * @author JBR
 * @version 4.0
 */
public class GameScreen extends World
{
    private int spawnHeight = 0;
    //int spawnPosition = 250;
    private int groundHeight = 380;
    private int cannotspawn = 0;
    private int time;
    public static int score;
    
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        super(500, 400, 1);
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        time = 10000;
        score = 0;
        prepare();
        spawnBlocks();
        showScore();
        showTime();
    }
    
    /**
     * 
     */
    public void act()
    {
        spawnBlocks();
        countTime();
    }
    
    /**
     * Prepares the Gamescreen for playing.
     */
    private void prepare()
    {
       Actor ground = new Ground();
       addObject(ground, 0, groundHeight);
       
       Actor topline = new TopLine();
       addObject(topline, 0, -5);
    }
    
    /**
     * Counts the Score while playing. If the score exeeds 1000 the
     * Game is over.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score == 200) 
        {
            Greenfoot.setWorld(new EndScreen());
            //Greenfoot.stop();
        }
    }
    
    /**
     * Shows the current Score.
     */
    public void showScore()
    {
        showText("Score: " + score, 55, 385); 
    }
    
    /**
     * Countdown of the playtime. If the playtime is 0 the game is over.
     */
    public void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.setWorld(new EndScreen());
            //Greenfoot.stop();
        }
    }
    
    /**
     * Shows the current Time on Screen.
     */
    public void showTime()
    {
        showText("Time: " + time, 440, 385);
    }
    
    /**
     * Zählt die variable cannotspawn -1.
     */
    public void canNotSpawn(int torf)
    {
        cannotspawn= cannotspawn - torf;
    }
    
    /**
     * Method which Spawns randomly Blocks. But only if cannotspawn is set
     * to 0. This means it only spawns Blocks if the block before is 
     * already on Ground.
     */
    public void spawnBlocks()
    {
        if (cannotspawn == 0)    
        {
            // Blocks IBlock = new IBlock();
            // addObject(IBlock, spawnPosition, spawnHeight);
            int blockNumber = Greenfoot.getRandomNumber(7);
            int spawnPosition = Greenfoot.getRandomNumber(350) + 50;
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
