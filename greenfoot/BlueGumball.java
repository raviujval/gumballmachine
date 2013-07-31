import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueGumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueGumball extends Gumball
{
    private String description;
    /**
     * Act - do whatever the BlueGumball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //description="Blue Gumball";
    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {  
            GumballMachine gumballMachine = GumballMachine.getInstance();
            gumballMachine.getWorld().removeObject(this);
        }
    }   
    
    public void BlueGumball()
    {
        setDescription("Blue Gumball") ;
        
    }
}

