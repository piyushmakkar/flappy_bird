import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBg extends World
{

    int counter = 0;
    int space = 5;
    int score =0;
    
    /**
     * Constructor for objects of class FlappyBg.
     * 
     */
    public FlappyBg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        FlappyBird flappy =new FlappyBird();
        
        addObject(flappy, 100, 200);
    }
    
    public void act()
    {
        counter++;
        if (counter%100==0)
        {
        PipeDown pipedown = new PipeDown();
        
        GreenfootImage imagedown = pipedown.getImage();
        
        PipeUp pipeup = new PipeUp();
            
        GreenfootImage imageup = pipeup.getImage();
            
        addObject(pipeup, getWidth(), getHeight()/2-imageup.getHeight()/2);
            
        addObject(pipedown, getWidth(), getHeight()/2+(imagedown.getHeight()-2));
          
        score=(counter-1)/100;
        
        System.out.println(score-1);
        }
    }  
}
