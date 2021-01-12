import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.5;
    double Boost_Speed = -10;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getX(), (int)(getY()+dy));  
       
       if (getOneIntersectingObject(PipeUp.class)!= null)
       {
          GameOver gameover = new GameOver();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
          Greenfoot.stop(); 
        }
       
       if (getOneIntersectingObject(PipeDown.class)!= null)
       {
          GameOver gameover = new GameOver();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
          Greenfoot.stop(); 
        } 
        
       if (Greenfoot.isKeyDown("up") == true)
       {
          dy = Boost_Speed; 
       }
       
       if (dy>=-10 && dy<=-5){
           setRotation(30);
        }
       else if(dy>-5 && dy<=0){
           setRotation(0);
        }
       else if(dy>0 && dy<=10){
           setRotation(-30);
        } 
      
       
       if (getY() > getWorld().getHeight()){
           GameOver gameover = new GameOver();
           getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
           Greenfoot.stop();
        }
        
         dy=dy+g;
    }    
}
