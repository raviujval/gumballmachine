import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    private static boolean printSmiley;
    private static boolean honeyTopping;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            Message m = new Message() ;
            m.setText( "Hello There!" ) ;
            World world = getWorld() ;
            world.addObject(m, mouseX, mouseY) ;
        }

        Actor coin;
        coin = getOneIntersectingObject( Coin.class ) ;
        if ( coin != null )
        {
            System.out.println( coin.toString() ) ;
            World world = getWorld() ;
            world.removeObject( coin ) ;
        }
    }    
    
    public static void setHoneyTopping(boolean b)
    {
        honeyTopping = b;
    }    
    
    public static void setPrintSmiley(boolean b)
    {
        printSmiley = b;
    }
    
    public static boolean isHoneyTopping()
    {
        return honeyTopping;
    }
    
    public static boolean isPrintSmiley()
    {
        return printSmiley;
    }    
}
