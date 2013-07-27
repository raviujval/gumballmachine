import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HasMoneyState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasMoneyState extends State
{
    private GumballMachine gumballMachine;
    
    public HasMoneyState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }   
    
    @Override
    public void insertCoin(Coin coin)
    {
        Message m = new Message() ;
        m.setText( "You have entered 50 or more Cents. Please turn the Crank!" ) ;
        World world = getWorld() ;
        world.addObject(m, 270,420) ;
    }
    
    @Override
    public void turnCrank()
    {
        //Invoke code for Strategy Pattern here.
        
        if(this.gumballMachine.getTotalGumballCount() == 0)
        {
            Message m = new Message() ;
            m.setText( "No more Gumballs! We are sorry, your money cannot be returned!" ) ;
            World world = getWorld() ;
            world.addObject(m, 270,420) ;
            
            this.gumballMachine.setState(this.gumballMachine.getOutOfGumballState());
        }
    }   
}
