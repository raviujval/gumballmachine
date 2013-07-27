import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class CombinationStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombinationStrategy extends GumballPickerStrategy
{
    public List<Picker> implementStrategy(GumballMachine gumballMachine)
    {
        
        List<Picker> pickers = new ArrayList<Picker>();
        
        boolean pennyInserted = false;
        boolean nickelInserted = false;
        boolean dimeInserted = false;
        boolean quarterInserted = false;
        
        int pennyCount = gumballMachine.getPennyCount();
        int nickelCount = gumballMachine.getNickelCount();
        int dimeCount = gumballMachine.getDimeCount();
        int quarterCount = gumballMachine.getQuarterCount();
        
        if(pennyCount > 0)
            pennyInserted = true;
            
        if(nickelCount > 0)
            nickelInserted = true;
            
        if(dimeCount > 0)
            dimeInserted = true;    
            
        if(quarterCount > 0)
            quarterInserted = true;    
            
        if(pennyInserted && nickelInserted)
        {
            //put your strategy here
            pickers.add(new BluePicker());
            pickers.add(new RedPicker());
            pickers.add(new GreenPicker());
            pickers.add(new RandomPicker());

        }
        
        return pickers;
    } 
}
