import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Subject
{
    private static GumballMachine gumballMachine;
    
    private boolean printSmiley;
    private boolean honeyTopping;
    
    private int redGumballCount;
    private int blueGumballCount;
    private int greenGumballCount;
    
    private int totalGumballCount;
    
    private int nickelCount;
    private int dimeCount;
    private int quarterCount;
    private int pennyCount;
    
    private int total;

    private State waitingFor50CentsState;
    private State noMoneyState;
    private State hasMoneyState;
    private State outOfGumballState;
    
    private State state;
    
    private GumballPickerStrategy strategy;
    
    private  GreenfootSound coinSound;
    
    private List<Observer> observers = new ArrayList<Observer>();
    
    public static synchronized GumballMachine getInstance(int redGumballCount, int blueGumballCount, int greenGumballCount)
    {
        gumballMachine = new GumballMachine(redGumballCount, blueGumballCount, greenGumballCount);
        return gumballMachine;
    }  
    
    public static synchronized GumballMachine getInstance()
    {
        return gumballMachine;
    }
    
    private GumballMachine(int redGumballCount, int blueGumballCount, int greenGumballCount)
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 500 ) ; 
        
        this.redGumballCount = redGumballCount;
        this.blueGumballCount = blueGumballCount;
        this.greenGumballCount = greenGumballCount;
        
        waitingFor50CentsState = new WaitingFor50CentsState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        outOfGumballState = new OutOfGumballState(this);
        
        if((redGumballCount + blueGumballCount + greenGumballCount) > 0)
        {
            state = noMoneyState;
        }
        else
        {
            state = outOfGumballState;
        }
    }

    public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mousePressed(this)) {
            
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            
            System.out.println("MouseX :" + mouseX + " MouseY: " + mouseY);
            
            if((mouseX > 260 && mouseX < 335) && (mouseY > 395 && mouseY < 400))
            {
                System.out.println("Turn Crank is getting called !");
                turnCrank();
            }
            
            /*
            Message m = new Message() ;
            m.setText( "Hello There!" ) ;
            World world = getWorld() ;
            world.addObject(m, mouseX, mouseY) ;
            */
        }

        Actor coin;
        coin = getOneObjectAtOffset(5, 50, Coin.class);
        /*coin = getOneIntersectingObject( Coin.class ) ; */
        if ( coin != null )
        {
            System.out.println( coin.toString() ) ;
            insertCoin((Coin)coin);
            removeAndAddBackCoin((Coin)coin);
        } 
    }  
    
    private void removeAndAddBackCoin(Coin coin)
    {
        World world = getWorld() ;
        world.removeObject( coin ) ;
        
        if(coin instanceof Penny)
            this.getWorld().addObject( new Penny(), 57, 71 ) ;
        else if(coin instanceof Nickel)    
            this.getWorld().addObject( new Nickel(), 61, 150 ) ;
        else if(coin instanceof Dime)
            this.getWorld().addObject( new Dime(), 65, 225 ) ;
        else if(coin instanceof FakeQuarter)    
            this.getWorld().addObject( new FakeQuarter(), 66, 420 ) ;    
        else if(coin instanceof Quarter)    
            this.getWorld().addObject( new Quarter(), 68, 320 ) ;
    }
            
    
    public void insertCoin(Coin coin)
    {
        notifyObservers(coin);
        state.insertCoin(coin);
    }    
    
    public void turnCrank()
    {
        state.turnCrank();
        
        if(isPrintSmiley())
        {
            //invoke decorator pattern here
        }
        if(isHoneyTopping())
        {
           //invoke decorator pattern here     
        }
    }
    
    public void calculateTotal(Coin coin)
    {
        total += determineCoinValue(coin);
    }
    
    public void displayTotal()
    {
        Message m = new Message() ;
        m.setText( "Current Total: " + total) ;
        World world = getWorld() ;
        world.addObject(m, 270,420) ; 
    }    
    
    private int determineCoinValue(Coin coin)
    {
        if(coin instanceof FakeQuarter)
        {
            coinSound = new GreenfootSound("FakeCoin.wav");
            coinSound.play();
            
            return 0;
        }
        else if(coin instanceof Nickel)
        {
            nickelCount++;
            coinSound = new GreenfootSound("Nickel.wav");
            coinSound.play();
            return 5;
        }
        else if(coin instanceof Dime)
        {
            dimeCount++;
            coinSound = new GreenfootSound("Dime.wav");
            coinSound.play();
            return 10;
        }
        else if(coin instanceof Quarter)
        {
            quarterCount++;
            coinSound = new GreenfootSound("Quarter.wav");
            coinSound.play();
            return 25;
        }
        else if(coin instanceof Penny)
        {
            pennyCount++;
            coinSound = new GreenfootSound("Penny.wav");
            coinSound.play();
            return 1;
        }
        else
        {
            return 0;
        }
    }        
    
    public void attach(Observer observer)
    {
        this.observers.add(observer);
    }
    
    public void detach(Observer observer)
    {
        this.observers.remove(observer);
    }
    
    public void notifyObservers(Coin coin)
    {
        System.out.println("Number of Observers: " + observers.size());
        
        for(Observer observer : observers)
        {
            observer.update(coin);
        }
    }
    
    public void setHoneyTopping(boolean b)
    {
        honeyTopping = b;
    }    
    
    public void setPrintSmiley(boolean b)
    {
        printSmiley = b;
    }
    
    public boolean isHoneyTopping()
    {
        return honeyTopping;
    }
    
    public boolean isPrintSmiley()
    {
        return printSmiley;
    }    
    
    public State getState()
    {
        return state;
    }
    
    public void setState(State state)
    {
        this.state = state;
    }
    
    public int getTotal()
    {
        return this.total;
    }
    
    public void setTotal(int total)
    {
        this.total = total;
    }
    
    public int getNickelCount()
    {
        return this.nickelCount;
    }
    
    public void setNickelCount(int nickelCount)
    {
        this.nickelCount = nickelCount;
    }
    
    public int getDimeCount()
    {
        return this.dimeCount;
    }
    
    public void setDimeCount(int dimeCount)
    {
        this.dimeCount = dimeCount;
    }
    
    public int getQuarterCount()
    {
        return this.quarterCount;
    }
    
    public void setQuarterCount(int quarterCount)
    {
        this.quarterCount = quarterCount;
    }
    
    public int getPennyCount()
    {
        return this.pennyCount;
    }
    
    public void setPennyCount(int pennyCount)
    {
        this.pennyCount = pennyCount;
    }
    
    public int getRedGumballCount()
    {
        return this.redGumballCount;
    }
    
    public int getBlueGumballCount()
    {
        return this.blueGumballCount;
    }
    
    public int getGreenGumballCount()
    {
        return this.greenGumballCount;
    }
    
    public State getWaitingFor50CentsState()
    {
        return this.waitingFor50CentsState;
    }
    
    public State getNoMoneyState()
    {
        return this.noMoneyState;
    }
    
    public State getHasMoneyState()
    {
        return this.hasMoneyState;
    }
    
    public State getOutOfGumballState()
    {
        return this.outOfGumballState;
    }
    
    public int getTotalGumballCount()
    {
        return (redGumballCount + blueGumballCount + greenGumballCount);
    }   
    
    public void changeStrategy(GumballPickerStrategy s)
    {
        this.strategy = s;
    }
    
    public GumballPickerStrategy getStrategy()
    {
        return this.strategy;
    }
    
}
