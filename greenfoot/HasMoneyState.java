import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;

/**
 * Write a description of class HasMoneyState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasMoneyState extends State
{
    private GumballMachine gumballMachine;
    
    private Random random = new Random();
    
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
        int selection = random.nextInt(2);
        
        switch(selection) {
            case 0: 
                    this.gumballMachine.changeStrategy(new CombinationStrategy());
                    break;
            
            case 1: 
                    this.gumballMachine.changeStrategy(new CountStrategy());
                    break;
            
            default:         
                    this.gumballMachine.changeStrategy(new CombinationStrategy());
                    break;            
        }
        
        int pennyCount = this.gumballMachine.getPennyCount();
        int nickelCount = this.gumballMachine.getNickelCount();
        int dimeCount = this.gumballMachine.getDimeCount();
        int quarterCount = this.gumballMachine.getQuarterCount();
        
        List<Picker> pickersChain = this.gumballMachine.getStrategy().implementStrategy(pennyCount, nickelCount, dimeCount, quarterCount);

        //Invoke Chain-of-Responsibility here.
        
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
