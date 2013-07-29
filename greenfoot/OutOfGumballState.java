import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OutOfGumballState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OutOfGumballState extends State
{
    private GumballMachine gumballMachine;
    
    public OutOfGumballState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }   
    
    @Override
    public void insertCoin(Coin coin)
    {
    
        Message m = new Message() ;
        m.setText( "Out of Gumballs !" ) ;
        World world = this.gumballMachine.getWorld() ;
        world.addObject(m, 270,420) ;
    
    }
    
    @Override
    public void turnCrank()
    {
    
        Message m = new Message() ;
        m.setText( "Out of Gumballs !" ) ;
        World world = this.gumballMachine.getWorld() ;
        world.addObject(m, 270,420) ;
        
    }    
}
