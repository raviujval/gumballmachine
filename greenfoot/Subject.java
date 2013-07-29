import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Subject extends Actor
{
    public abstract void attach(Observer obj);
    public abstract void detach(Observer obj);
    public abstract void notifyObservers(Coin coin);    
}
