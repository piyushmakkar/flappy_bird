import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeDown extends Actor
{
    int speed = -4;
    /**
     * Act - do whatever the PipeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+speed, getY());
       
    }    
}
