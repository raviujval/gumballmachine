import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoMoneyState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoMoneyState extends State
{
    private GumballMachine gumballMachine;
    
    public NoMoneyState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }   
    
    @Override
    public void insertCoin(Coin coin)
    {
       if(this.gumballMachine.getTotal() == 0)
       {
           this.gumballMachine.calculateTotal(coin);
           this.gumballMachine.setState(this.gumballMachine.getWaitingFor50CentsState());
           this.gumballMachine.displayTotal();
       }   
    }
    
    @Override
    public void turnCrank()
    {
        Message m = new Message() ;
        m.setText( "Please insert a total of 50 Cents before turning the Crank!" ) ;
        World world = getWorld() ;
        world.addObject(m, 270,420) ; 
    } 
}
