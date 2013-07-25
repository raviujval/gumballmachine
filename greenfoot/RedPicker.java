import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
    
    public void getGumball() {
        World world = getWorld() ;
        Message m = new Message() ;
        m.setText( "I'll pick red!" ) ;
        world.addObject(m, 550, 80) ;
        RedGumball rg = new  RedGumball() ;
        world.addObject(rg, 369, 389) ;
    }
}
