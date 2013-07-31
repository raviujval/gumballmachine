import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BluePicker extends Picker
{
    private Picker successor = null;
    
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void getGumball() {
       GumballMachine gumballmachine = GumballMachine.getInstance();
       World world = gumballmachine.getWorld();
       
       Boolean isAnyBlueGumballLeft = false ;
       //Message is displayed
       if (gumballmachine.getBlueGumballCount()>0) {
            gumballmachine.setBlueGumballCount(gumballmachine.getBlueGumballCount() - 1);
            GreenfootSound crankSound = new GreenfootSound("PickBlue.wav");
            crankSound.play();
            Message m = new Message() ;
            m.setText( "I'll pick blue!" ) ;
            BlueGumball bg = new  BlueGumball() ;
            super.dispenseGumball(m,462,45,bg,gumballmachine);
        } else {
           GreenfootSound crankSound = new GreenfootSound("Noblue.wav");
           crankSound.play(); 
           Greenfoot.delay(120);
           Message m = new Message() ;
           m.setText( "No blue left!" ) ;
           m.display(462,45);
           if (successor != null) {
               successor.getGumball() ;
            }
        }      
    }
    
    public void setSuccessor (Picker picker) {
        successor = picker;
    }
}
