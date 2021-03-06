import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Background1[] bg = new Background1[3];
    
    private final int LEFT_BOUNDARY = -300;
    private final int RIGHT_BOUNDARY = 900;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 3, false);
        int x = LEFT_BOUNDARY;
        for(int i=0; i<bg.length; i++)
        {
            bg[i] = new Background();
            addObject( bg[i], x, getHeight()/2 );
            x=x+ 600;
        }
        addObject( new Person(), getWidth()/2, 190);
    }
    
    public void scroll(int direction)
    {
        for(int i=0; i< bg.length; i++)
        {
            bg[i].setLocation(bg[i].getX()+direction, bg[i].getY() );
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")) 
        {
            scroll(5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            scroll(-5);
        }
    }

}
