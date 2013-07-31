import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends CoinObserver
{
    public Inspector(GumballMachine gumballMachine)
    {
        super(gumballMachine);
        gumballMachine.attach(this);
    }
    
    public void update(Coin coin)
    {
        if(coin instanceof FakeQuarter)
        {
            coinSound = new GreenfootSound("FakeCoin.wav");
            coinSound.play();
            
            // We can also add a sound shouting that Coin is a Fake !
            Message m = new Message(120,50) ;
            m.setText( "The Coin is a Fake!" ) ;
            m.display(540,200);
        }    
    
    }
}
