import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public  abstract class Gumball  extends Actor 
{
    protected String description ;
    
    public Gumball()
    {
        //description="Gumball" ;
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }
    
   
    public void act() 
    {
        // Add your action code here.
    } 
    
    
    public String getDescription () {
        return description;
    }
    
    public void setDescription (String S) {
        description =  S;
    }
}
