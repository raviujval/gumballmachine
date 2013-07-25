import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nickel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nickel extends Coin
{
    /**
     * Act - do whatever the Nickel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nickel()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;        
    }    
}
