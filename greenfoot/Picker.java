import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
     public void getGumball() { };
     
     public void setSuccessor(Picker picker) { };
     
     public void displayNoGumballsLeft(GumballMachine gumballMachine)
    {
        Message m = new Message(370, 50) ;
        m.setText( "No more Gumballs! We are sorry, your money cannot be returned!" ) ;
        World world = gumballMachine.getWorld();
        world.addObject(m, 270,420) ;       
        gumballMachine.setState(gumballMachine.getOutOfGumballState());
    }
    
    public void dispenseGumball(Message m, int x, int y, Gumball gumball, GumballMachine gumballmachine) {
         
         if(gumballmachine.isHoneyTopping())
            gumball = new HoneyToppingDecorator(gumball);
         
         if(gumballmachine.isPrintSmiley())
            gumball = new SmileyDecorator(gumball);
        
         World world = gumballmachine.getWorld() ;
         world.addObject(m, x, y) ;
         world.addObject(gumball, 369, 389) ;
         
         gumballmachine.resetState();
    } 
}
