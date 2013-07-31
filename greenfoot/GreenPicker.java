import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class GreenPicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
       

    }    
    
    public void getGumball() {
       GumballMachine gumballmachine = GumballMachine.getInstance();
       World world = gumballmachine.getWorld();
       
       if (gumballmachine.getGreenGumballCount()>0) {
           gumballmachine.setGreenGumballCount(gumballmachine.getGreenGumballCount() - 1);
           Message m = new Message() ;
           m.setText( "I'll pick green!" ) ;
           GreenGumball gg = new  GreenGumball() ;
           super.dispenseGumball(m,720,315,gg,gumballmachine);
        } else {
           Message m = new Message() ;
           m.setText( "No green left!" ) ;
           m.display(720,315);
           if (successor != null) {
               successor.getGumball() ;
            }
        }
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
