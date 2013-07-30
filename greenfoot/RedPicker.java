import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class RedPicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
       
    }    
    
    public void getGumball() {
       GumballMachine gumballmachine = GumballMachine.getInstance();
       World world = gumballmachine.getWorld();
       
       if (gumballmachine.getRedGumballCount()>0) {
           gumballmachine.setRedGumballCount(gumballmachine.getRedGumballCount() - 1);          
           Message m = new Message() ;
           m.setText( "I'll pick red!" ) ;
           RedGumball rg = new  RedGumball() ;
           super.dispenseGumball(m,640,280,rg,gumballmachine);
        } else {
           Message m = new Message() ;
           m.setText( "No red left!" ) ;
           world.addObject(m, 640, 280) ; 
           if (successor != null) {
               successor.getGumball() ;
            }
        }
            
    }
    
     public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
