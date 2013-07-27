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
       Message m = new Message() ;
       
       if (gumballmachine.getGreenGumballCount()>0) {
           m.setText( "I'll pick green!" ) ;
           GreenGumball gg = new  GreenGumball() ;
           this.dispenseGumball(m,gg) ;
        } else if (gumballmachine.getRedGumballCount()>0) {
           m.setText( "I'll pick red!" ) ;
           RedGumball rg = new  RedGumball() ;
           this.dispenseGumball(m,rg) ;
        } else if (gumballmachine.getBlueGumballCount()>0) {
           m.setText( "I'll pick blue!" ) ;
           BlueGumball rg = new  BlueGumball() ;
           this.dispenseGumball(m,rg) ;
        } else {
           m.setText( "No more Gumball left!" ) ;
           world.addObject(m, 500, 291) ; 
        }
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
    
    public void dispenseGumball(Message m, Gumball gumball) {
         World world = getWorld() ;
         world.addObject(m, 500, 291) ;
         world.addObject(gumball, 369, 389) ;
    }
}
