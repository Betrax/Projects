import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoomRobin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Deze kamer is work in progress. Alle Gameplay features en de meeste images moeten nog komen :) 

public class RoomRobin extends World
{
    public static World RoomRobin = new RoomRobin();
    prop USB = new prop("USB_Image.png", 5, 5, 200, 100, 100);
    prop Laptop = new prop("Laptop_Image.png", 6, 6, 557, 430, 100);
    //prop Tapijt = new prop("Tapijt_Image.png", 50, 50, 700, 500, 100);
    
    public RoomRobin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        GreenfootImage achtergrond = (new GreenfootImage("roomRobin.jpg"));
        achtergrond.scale(getWidth(), getHeight());
        setBackground(achtergrond);
        addObject(USB, 1,1);
        addObject(Laptop, 1,1);
        //addObject(Tapijt, 1, 1);
    }
    
}
