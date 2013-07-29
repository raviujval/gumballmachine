import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuarterObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuarterObserver extends CoinObserver
{
    public QuarterObserver(GumballMachine gumballMachine)
    {
        super(gumballMachine);
    }
    
    public void update(Coin coin)
    {
        if(!(coin instanceof FakeQuarter) && (coin instanceof Quarter))
        {
            // Sound shouting that Quarter is inserted !
        }
    }
}
