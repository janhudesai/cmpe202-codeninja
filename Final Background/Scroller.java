import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scroller extends Actor
{
    /**
     * Act - do whatever the Scroller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void scroll()
    {
        if(getX() < getImage.getWidth()/2) {
            setLocation( getX() + getWorld().getWidth()*2, getY() );
        }
        setLocation( getX()-5, getY() );
    }
}