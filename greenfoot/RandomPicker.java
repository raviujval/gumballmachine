import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RandomPicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void getGumball() {
       World world = getWorld() ;
       GumballMachine gumballmachine = GumballMachine.getInstance();
       
       Boolean isAnyGumballLeft = false ;
       //Message is displayed
       if (isAnyGumballLeft) {
           Message m = new Message() ;
           m.setText( "I'll pick green!" ) ;
           world.addObject(m, 500, 291) ;
           GreenGumball gg = new  GreenGumball() ;
           world.addObject(gg, 369, 389) ;
        } else {
           Message m = new Message() ;
           m.setText( "No green left!" ) ;
           world.addObject(m, 500, 291) ; 
           if (successor != null) {
               successor.getGumball() ;
            }
        }
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
