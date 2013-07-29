import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaitingFor50CentsState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaitingFor50CentsState extends State
{
    private GumballMachine gumballMachine;
    
    public WaitingFor50CentsState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }   
    
    @Override
    public void insertCoin(Coin coin)
    {
        this.gumballMachine.calculateTotal(coin);
        this.gumballMachine.displayTotal();
        
        if(this.gumballMachine.getTotal() >= 50)
        {
            this.gumballMachine.setState(this.gumballMachine.getHasMoneyState());
        }
        
    }
    
    @Override
    public void turnCrank()
    {
        if(this.gumballMachine.getTotal() < 50)
        {
            Message m = new Message(350, 50) ;
            m.setText( "Please insert a total of 50 Cents before turning the Crank!" ) ;
            World world = this.gumballMachine.getWorld() ;
            world.addObject(m, 270,420) ;
        }    
    }
}
