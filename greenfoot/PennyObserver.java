import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuarterObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PennyObserver extends CoinObserver
{
    public PennyObserver(GumballMachine gumballMachine)
    {
        super(gumballMachine);
        gumballMachine.attach(this);
    }
    
    public void update(Coin coin)
    {
        if(coin instanceof Penny)
        {
            if(super.gumballMachine.getTotal() <= 50)
            {
                coinSound = new GreenfootSound("Penny.wav");
                coinSound.play();
            }
        }
    }
}
