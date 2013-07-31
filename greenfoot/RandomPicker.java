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
           gumballmachine.setGreenGumballCount(gumballmachine.getGreenGumballCount() - 1);
           m.setText( "I'll pick green!" ) ;
           GreenGumball gg = new  GreenGumball() ;
           super.dispenseGumball(m,550,420,gg,gumballmachine) ;
        } else if (gumballmachine.getRedGumballCount()>0) {
           gumballmachine.setRedGumballCount(gumballmachine.getRedGumballCount() - 1);
           m.setText( "I'll pick red!" ) ;
           RedGumball rg = new  RedGumball() ;
           super.dispenseGumball(m,550,420,rg,gumballmachine) ;
        } else if (gumballmachine.getBlueGumballCount()>0) {
           gumballmachine.setBlueGumballCount(gumballmachine.getBlueGumballCount() - 1); 
           m.setText( "I'll pick blue!" ) ;
           BlueGumball rg = new  BlueGumball() ;
           super.dispenseGumball(m,550,420,rg,gumballmachine) ;
        } else {
           displayNoGumballsLeft(gumballmachine); 
        }
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
       
}
