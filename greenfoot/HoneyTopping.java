import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoneyDip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoneyTopping extends Actor
{
    public HoneyTopping()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50 , 50 ) ; 
    }    
        
    
    
    /**
     * Act - do whatever the HoneyDip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int mouseX, mouseY ;

        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
        
        if (GumballMachine.getInstance().isHoneyTopping()) {
                
            Message m = new Message() ;
            m.setText( "Honey Topping !!" ) ;
            World world = getWorld() ;
            world.addObject(m, 350,420) ;
 
        }
        else {
            Message m = new Message() ;
            m.setText( "Regular is also good!" ) ;
            World world = getWorld() ;
            world.addObject(m, 350,420) ;
        }
        
    } 
  } 
}
