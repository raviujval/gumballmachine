import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class CountStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountStrategy extends GumballPickerStrategy
{
    public List<Picker> implementStrategy(GumballMachine gumballMachine)
    {
        
        List<Picker> pickers = new ArrayList<Picker>();
        
        int pennyCount = gumballMachine.getPennyCount();
        int nickelCount = gumballMachine.getNickelCount();
        int dimeCount = gumballMachine.getDimeCount();
        int quarterCount = gumballMachine.getQuarterCount();
        
        if(quarterCount > 0)
        {   
            pickers.add(new RandomPicker());
            pickers.add(new BluePicker());
            pickers.add(new RedPicker());
            pickers.add(new GreenPicker());

        } 
        
        else if(pennyCount > 0)
        {
            pickers.add(new BluePicker());
            pickers.add(new RedPicker());
            pickers.add(new GreenPicker());
            pickers.add(new RandomPicker());

        }
            
        else if(nickelCount > 0)  
        {    
            pickers.add(new RedPicker());
            pickers.add(new GreenPicker());
            pickers.add(new RandomPicker());
            pickers.add(new BluePicker());

        }
        
        else if(dimeCount > 0) 
        {
            pickers.add(new GreenPicker());
            pickers.add(new RandomPicker());
            pickers.add(new BluePicker());
            pickers.add(new RedPicker());

        }    
        
        return pickers;
    } 
}
