import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Message extends Actor
{
    GreenfootImage gi;

    public Message()
    {
        gi = new GreenfootImage( 100, 50);
        setImage(gi);        
    }
    
    public Message(int x, int y)
    {
        gi = new GreenfootImage( x, y);
        setImage(gi); 
    }

    public void setText( String msg )
    {
        gi.clear();
        gi.setColor( java.awt.Color.YELLOW ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( msg, 0, 25 );  
    }

    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
        }
    }  
    
    public void display(int x, int y)
    {
        GumballMachine gumballMachine = GumballMachine.getInstance();
        gumballMachine.getWorld().addObject(this, x, y);
        Greenfoot.delay(70);
        gumballMachine.getWorld().removeObject(this);
    }
}