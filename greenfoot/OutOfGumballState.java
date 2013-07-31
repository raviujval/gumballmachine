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
        GreenfootSound crankSound = new GreenfootSound("OutofGumballs.wav");
        crankSound.play();
        m.setText( "Out of Gumballs !" ) ;
        m.display(270,420);
    }
    
    @Override
    public void turnCrank()
    {
        GreenfootSound crankSound = new GreenfootSound("OutofGumballs.wav");
        crankSound.play();
        Message m = new Message() ;
        m.setText( "Out of Gumballs !" ) ;
        m.display(270,420);  
    }    
}
