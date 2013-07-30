import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoneyToppingDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoneyToppingDecorator extends GumballDecorator
{
    GreenfootImage image1;
    GreenfootImage htimage;
    Gumball gumball;
    String tempDesc;
    /**
     * Act - do whatever the HoneyToppingDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
     public HoneyToppingDecorator(Gumball G) {
         
	        this.gumball = G;
	         
	        System.out.println("Adding HoneyTopping");	
	        changeImage();
	        changeDesc();

        }
    
        public void changeImage() {
            
            image1=this.gumball.getImage() ;
            htimage = new GreenfootImage("honeydrop.png");
            htimage.scale(25,25);
            image1.drawImage(htimage, 15,1);
            this.setImage(image1);
        }
        public void changeDesc () {
            //tempDesc = this.gumball.getDescription();
            //tempDesc = tempDesc + " with Sweet Honey " ;
            //this.setDescription(tempDesc);
            tempDesc = description + " With Honey " ;
            description=tempDesc;
    }
}

