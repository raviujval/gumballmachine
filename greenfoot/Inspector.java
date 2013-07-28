import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{

    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;

    public void addPicker(Picker obj) {
        pickers.add(obj) ;
    }

    public void removePicker(Picker obj) {
        pickers.remove(obj) ;
    }
    
    public void inspect(Coin coin )
    {
        if(coin instanceof FakeQuarter)
        {
            Message m = new Message() ;
            m.setText( "Fake Coin! Please insert a Valid Coin" ) ;
            World world = getWorld() ;
            world.addObject(m, 270,420) ;
        }
        
    }
    
    /*
    public void act(){
        World world = getWorld() ;
        
        List<GreenPicker> gps = world.getObjects(GreenPicker.class) ;
        GreenPicker gp = gps.get(0) ;
        List<RedPicker> rps = world.getObjects(RedPicker.class) ;
        RedPicker rp = rps.get(0) ;
        List<BluePicker> bps = world.getObjects(BluePicker.class) ;
        BluePicker bp = bps.get(0) ;
        
        gp.getGumball() ;
        gp.setSuccessor(rp) ;
        rp.setSuccessor(bp) ;
    }
    */
    
}