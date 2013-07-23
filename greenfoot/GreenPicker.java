import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       World world = getWorld() ;
       List<GumballMachine> gumballmachines = world.getObjects(GumballMachine.class);
       
       GreenGumball gg = new  GreenGumball() ;
       world.addObject(gg, 369, 389) ;
    }    
}
