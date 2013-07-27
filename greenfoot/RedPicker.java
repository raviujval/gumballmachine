import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class RedPicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
       
    }    
    
    public void getGumball() {
       World world = getWorld() ;
       GumballMachine gumballmachine = GumballMachine.getInstance();
       
       if (gumballmachine.getRedGumballCount()>0) {
            Message m = new Message() ;
            m.setText( "I'll pick red!" ) ;
            world.addObject(m, 720, 291) ;
            RedGumball rg = new  RedGumball() ;
            world.addObject(rg, 369, 389) ;
        } else {
           Message m = new Message() ;
           m.setText( "No red left!" ) ;
           world.addObject(m, 720, 291) ; 
           if (successor != null) {
               successor.getGumball() ;
            }
        }
            
    }
    
     public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
