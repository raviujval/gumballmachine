import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoneyToppingDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmileyDecorator extends GumballDecorator
{
    GreenfootImage image1;
    GreenfootImage smimage;
    String tempDesc;
    Gumball gumball;
    /**
     * Act - do whatever the HoneyToppingDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
     public SmileyDecorator(Gumball G) {
         
            //super(G);
            
            this.gumball = G;
             
            System.out.println("Adding Smiley");    
            changeImage();
            changeDesc();
            System.out.println(gumball.description);

        }
        public void changeImage() {
            
            image1=this.gumball.getImage() ;
            smimage = new GreenfootImage("smiley.png");
            smimage.scale(25,25);
            image1.drawImage(smimage, 35,35);
            this.setImage(image1);
        }
        
        public void changeDesc () {
            tempDesc = gumball.getDescription();
            tempDesc = tempDesc + " with Smiley " ;
            this.setDescription(tempDesc);
    }
}
