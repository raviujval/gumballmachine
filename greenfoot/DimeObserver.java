import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DimeObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DimeObserver extends CoinObserver
{
    public DimeObserver(GumballMachine gumballMachine)
    {
        super(gumballMachine);
        gumballMachine.attach(this);
    }
    
    public void update(Coin coin)
    {
        if(coin instanceof Dime)
        {
            // Sound shouting that Dime is inserted !
        }
    }
}
