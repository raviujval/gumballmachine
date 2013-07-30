import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BluePicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void getGumball() {
       World world = getWorld() ;
       GumballMachine gumballmachine = GumballMachine.getInstance();
       
       Boolean isAnyBlueGumballLeft = false ;
       //Message is displayed
       if (gumballmachine.getBlueGumballCount()>0) {
            Message m = new Message() ;
            m.setText( "I'll pick blue!" ) ;
            world.addObject(m, 551,94) ;
            BlueGumball bg = new  BlueGumball() ;
            world.addObject(bg, 369, 389) ;
        } else {
           Message m = new Message() ;
           m.setText( "No blue left!" ) ;
           world.addObject(m, 551,94) ; 
           if (successor != null) {
               successor.getGumball() ;
            }
        }      
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
