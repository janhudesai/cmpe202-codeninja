import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vplatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vplatform extends Actor
{
    /**
     * Act - do whatever the Vplatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public Vplatform(){
    }
    public Vplatform(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
