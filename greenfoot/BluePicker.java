import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePicker extends Picker
{
    /**
     * Act - do whatever the BluePicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void getGumball() {
        World world = getWorld() ;
        Message m = new Message() ;
        m.setText( "I'll pick blue!" ) ;
        world.addObject(m, 550, 80) ;
        BlueGumball bg = new  BlueGumball() ;
        world.addObject(bg, 369, 389) ;
    }
}
