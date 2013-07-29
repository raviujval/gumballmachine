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
        GumballMachine gumballMachine = GumballMachine.getInstance(5,5,5);
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
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        RedPicker redpicker = new RedPicker();
        addObject(redpicker, 720, 291);
        redpicker.setLocation(720, 291);
        BluePicker bluepicker = new BluePicker();
        addObject(bluepicker, 510, 494);
        bluepicker.setLocation(510, 494);
        PrintSmiley printSmiley = new PrintSmiley();
        addObject(printSmiley, 240,472);
        HoneyTopping honeyTopping = new HoneyTopping();
        addObject(honeyTopping, 357,470);

    }
}
