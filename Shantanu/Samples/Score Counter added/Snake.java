import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Background
{
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction = 15; 
    public void act() 
    {
        // Add your action code here.
        if ((direction < 0 && getY() == 0) || (direction > 0 && getY() == getWorld().getHeight()-1)) direction = -direction;  
        // movement
        setLocation(getX(), getY() + direction);
    }    
}
