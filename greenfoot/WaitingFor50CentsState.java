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
        if((this.gumballMachine.getTotal() > 0) && (this.gumballMachine.getTotal() < 50))
        {
            this.gumballMachine.calculateTotal(coin);
            this.gumballMachine.displayTotal();
        }
        else
        {
            this.gumballMachine.setState(this.gumballMachine.getHasMoneyState());
        }
        
    }
    
    @Override
    public void turnCrank()
    {
        if(this.gumballMachine.getTotal() < 50)
        {
            Message m = new Message() ;
            m.setText( "Please insert a total of 50 Cents before turning the Crank!" ) ;
            World world = getWorld() ;
            world.addObject(m, 270,420) ;
        }    
    }
}
