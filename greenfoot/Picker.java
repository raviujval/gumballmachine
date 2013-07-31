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
        Message m = new Message(390, 50) ;
        m.setText( "No more Gumballs! We are sorry, your money cannot be returned!" ) ;
        World world = gumballMachine.getWorld() ;
        world.addObject(m, 270, 420) ;
        
        Greenfoot.delay(180);
        world.removeObject(m);
        
        gumballMachine.setState(gumballMachine.getOutOfGumballState());
    }
    
    public void dispenseGumball(Message m, int x, int y, Gumball gumball, GumballMachine gumballMachine) {
         
         if(gumballMachine.isHoneyTopping())
            gumball = new HoneyToppingDecorator(gumball);
         
         if(gumballMachine.isPrintSmiley())
            gumball = new SmileyDecorator(gumball);
        
         World world = gumballMachine.getWorld() ;
         world.addObject(m, x, y) ;
         world.addObject(gumball, 298, 508) ;
         
         Greenfoot.delay(100);
         world.removeObject(m);
         
         gumballMachine.resetState();
    } 
}
