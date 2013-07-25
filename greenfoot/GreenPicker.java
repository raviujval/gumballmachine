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
       

    }    
    
    public void getGumball() {
       World world = getWorld() ;
       List<GumballMachine> gumballmachines = world.getObjects(GumballMachine.class);
       
       Boolean isAnyGreenGumballLeft = false ;
       //Message is displayed
       if (isAnyGreenGumballLeft) {
           Message m = new Message() ;
           m.setText( "I'll pick green!" ) ;
           world.addObject(m, 550, 470) ;
           GreenGumball gg = new  GreenGumball() ;
           world.addObject(gg, 369, 389) ;
        } else {
           Message m = new Message() ;
           m.setText( "No green left!" ) ;
           world.addObject(m, 550, 470) ; 
           List<RedPicker> rps = world.getObjects(RedPicker.class) ;
           RedPicker rp = rps.get(0);
           rp.getGumball() ;
        }
    }
}
