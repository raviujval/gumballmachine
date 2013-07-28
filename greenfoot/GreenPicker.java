import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class GreenPicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
       

    }    
    
    public void getGumball() {
       World world = getWorld() ;
       GumballMachine gumballmachine = GumballMachine.getInstance();
       
       if (gumballmachine.getGreenGumballCount()>0) {
           Message m = new Message() ;
           m.setText( "I'll pick green!" ) ;
           world.addObject(m, 580, 440) ;
           GreenGumball gg = new  GreenGumball() ;
           world.addObject(gg, 369, 389) ;
        } else {
           Message m = new Message() ;
           m.setText( "No green left!" ) ;
           world.addObject(m, 580, 440) ; 
           if (successor != null) {
               successor.getGumball() ;
            }
        }
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
