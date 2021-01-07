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
    int groundHeight = 380;
    private int cannotspawn = 0;
    private int time;
    private int score;
    
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        super(500, 400, 1);
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        time = 3000;
        score = 0;
        prepare();
        spawnBlocks();
        showScore();
        showTime();
    }
    
    public void act()
    {
        spawnBlocks();
        countTime();
    }
    
    private void prepare()
    {
       Actor ground = new Ground();
       addObject(ground, 0, groundHeight);
    }
    
    /**
     * Fügt einige Punkte zu unserem aktuellen Punktestand hinzu. (Kann auch negativ sein.)
     * Wenn der Punktestand unter 0 fällt, ist das Spiel vorbei.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score == 200) 
        {
            //Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Zeigt den aktuellen Punktestand auf dem Bildschirm an.
     */
    private void showScore()
    {
        showText("Score: " + score, 55, 385); 
    }
    
    /**
     * Zählt die Spielzeit herunter und zeigt sie an. Stoppt das Spiel 
     * mit einer Gewinnbenachrichtigung, wenn die Zeit abgelaufen ist.
     */
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            //showEndMessage();
            Greenfoot.stop();
        }
    }
    
    private void showTime()
    {
        showText("Time: " + time, 440, 385);
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
