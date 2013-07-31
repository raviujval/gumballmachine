import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballMachine = GumballMachine.getInstance(1,1,1);
        addObject(gumballMachine, 300, 280);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Nickel(), 61, 150 ) ;
        addObject( new Dime(), 65, 225 ) ;
        addObject( new Quarter(), 68, 320 ) ;
        addObject( new FakeQuarter(), 66, 420 ) ;

        Inspector inspector = new Inspector(gumballMachine);
        addObject(inspector, 530, 291);
        //Registering Observers
        QuarterObserver quarterObserver = new QuarterObserver(gumballMachine);
        PennyObserver pennyObserver = new PennyObserver(gumballMachine);
        NickelObserver nickelObserver = new NickelObserver(gumballMachine);
        DimeObserver dimeObserver = new DimeObserver(gumballMachine);
        
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 551, 498);
        randompicker.setLocation(551, 498);
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 707, 400);
        greenpicker.setLocation(707, 400);
        RedPicker redpicker = new RedPicker();
        addObject(redpicker, 707, 206);
        redpicker.setLocation(707, 206);
        BluePicker bluepicker = new BluePicker();
        addObject(bluepicker, 551,94);
        bluepicker.setLocation(551,94);
        PrintSmiley printSmiley = new PrintSmiley();
        addObject(printSmiley, 240,472);
        HoneyTopping honeyTopping = new HoneyTopping();
        addObject(honeyTopping, 357,470);

    }
}
