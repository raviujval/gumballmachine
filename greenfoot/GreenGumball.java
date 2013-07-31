import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenGumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenGumball extends Gumball
{
    /**
     * Act - do whatever the GreenGumball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {  
            GumballMachine gumballMachine = GumballMachine.getInstance();
            gumballMachine.getWorld().removeObject(this);
        }
    } 
    
        public void GreenGumball()
    {
        setDescription("Green Gumball") ;
    }
}
