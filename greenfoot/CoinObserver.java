import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinObserver extends Observer
{
    protected GumballMachine gumballMachine;
    protected GreenfootSound coinSound;
    
    public CoinObserver(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    public void update(Coin coin)
    {
        
    }
}
