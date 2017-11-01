import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor
{
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy=0;
    int g =2;
     public Ninja(){
    }
    public Ninja(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void moveLeft(){
        move(-2);
    }
    public void moveRight(){
        move(2);
    }
    public void moveUp(){
         setLocation(getX(), getY() - 3);
    }
    public void moveDown(){
         setLocation(getX(), getY() + 3);
    }
    public boolean intersectingLeft(){
        return true;
    }
    public boolean intersectingRight(){
        return true;
    }
    public boolean intersectingUp(){
        return true;
    }
    public boolean intersectingDown(){
        return true;
    }
    
    
    public void move(){
        int x, y;
        x=this.getX();
        y=this.getY();
       if(isBarrier()){
            if(Greenfoot.isKeyDown("left")){
                move(-2);
            }
            if(Greenfoot.isKeyDown("right")){
                move(2);
            }
            
        }
        else{
             if(Greenfoot.isKeyDown("left")){
                move(2);
            }
            if(Greenfoot.isKeyDown("right")){
                move(-2);
            }
            if (Greenfoot.isKeyDown("up"))
            {
                dy = -5; 
            }
            //potential for momento design pattern
            
        }
       if (Greenfoot.isKeyDown("up"))
            {
               dy= - 6; 
            }
    }
        public boolean isBarrier(){
            Actor mb;
    Actor tw;
    Actor w;
        //    mb = !getIntersectingObjects(MovingBrick.class).isEmpty();
    tw = getOneIntersectingObject(TempWall.class);
    w = getOneIntersectingObject(wall.class);
        if(!getIntersectingObjects(MovingBrick.class).isEmpty()|| tw !=null || w !=null){
            return false;    
        }
        else
            return true;
    }
    public void fall (){
        dy = dy+g;
        setLocation(getX(), getY()+dy);
    }
    public void checkedFall(){
        if(onGround()){
            dy = 0;
            setLocation(getX(), getY()-8);
        }
        else{
            fall();
        }
    }
    
    public boolean onGround(){
        Actor wall = getOneIntersectingObject(Actor.class);
        if(wall==null){
            return false;
        }
        return (true);
    }
    public void act() 
    {
        // Add your action code here.
        move();
        checkedFall();
        
    }    
}
