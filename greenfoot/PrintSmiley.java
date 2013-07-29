import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class printSmiley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintSmiley extends Actor
{
    /**
     * Act - do whatever the printSmiley wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PrintSmiley () 
    {
        GreenfootImage image = getImage() ;
        image.scale( 35 , 35 ) ; 
    }
    
    public void act() 
    {
       int mouseX, mouseY ;

        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
        
        
        if (! GumballMachine.getInstance().isPrintSmiley()) {
            GumballMachine.getInstance().setPrintSmiley(true);    
            Message m = new Message() ;
            m.setText( "Smiley Gumball !!" ) ;
            World world = getWorld() ;
            world.addObject(m, 270,420) ;
            
 
        }
        else {
            GumballMachine.getInstance().setPrintSmiley(false); 
            Message m = new Message() ;
            m.setText( "No Smiley" ) ;
            World world = getWorld() ;
            world.addObject(m, 270,420) ;
        }
        
    }    
}

}
