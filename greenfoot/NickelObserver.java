import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NickelObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NickelObserver extends CoinObserver
{
    public NickelObserver(GumballMachine gumballMachine)
    {
        super(gumballMachine);
    }
    
    public void update(Coin coin)
    {
        if(coin instanceof Nickel)
        {
            // Sound shouting that Nickel is inserted !
        }
    }
}
