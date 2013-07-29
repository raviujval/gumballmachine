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
        Message m = new Message(350, 50) ;
        m.setText( "You have entered 50 or more Cents. Please turn the Crank!" ) ;
        World world = this.gumballMachine.getWorld() ;
        world.addObject(m, 270,420) ;
    }
    
    @Override
    public void turnCrank()
    {
        System.out.println("Turn Crank is getting called inside HasMoneyState !");
        //Invoke code for Strategy Pattern here.
        int selection = random.nextInt(2);
        
        System.out.println("The selection is: " + selection);
        
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
        
        System.out.println("The Strategy to be implemented is: " + this.gumballMachine.getStrategy().getClass().getName());
        
        int pennyCount = this.gumballMachine.getPennyCount();
        int nickelCount = this.gumballMachine.getNickelCount();
        int dimeCount = this.gumballMachine.getDimeCount();
        int quarterCount = this.gumballMachine.getQuarterCount();
        
        System.out.println("Penny Count: " + pennyCount);
        System.out.println("Nickel Count: " + nickelCount);
        System.out.println("Dime Count: " + dimeCount);
        System.out.println("Quarter Count: " + quarterCount);
        
        List<Picker> pickersChain = this.gumballMachine.getStrategy().implementStrategy(pennyCount, nickelCount, dimeCount, quarterCount);

        for(Picker picker : pickersChain)
        {
            System.out.println("Picker Name: " + picker.getClass().getName());
        }
        
        //Invoke Chain-of-Responsibility here.
        
        if(this.gumballMachine.getTotalGumballCount() == 0)
        {
            Message m = new Message(370, 50) ;
            m.setText( "No more Gumballs! We are sorry, your money cannot be returned!" ) ;
            World world = this.gumballMachine.getWorld();
            world.addObject(m, 270,420) ;
            
            this.gumballMachine.setState(this.gumballMachine.getOutOfGumballState());
        }
    }   
}
