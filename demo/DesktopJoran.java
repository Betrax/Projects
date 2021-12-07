import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesktopJoran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesktopJoran extends World
{
    public static World DesktopJoran = new DesktopJoran();
    int x;
    int y;
    long static_time = System.currentTimeMillis();
    prop background = new prop("windows.jpg", 169, 270, 600, 350, 0);   
   
    prop norton = new prop ("RoomJoran/norton.png", 8, 8, x, y, 0);
    
    prop virussen [] = {new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0)};
    
    public DesktopJoran()
    {    
         // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        
        
        addObject(virussen[0], 100, 100);
        addObject(virussen[1], 100, 100);
        addObject(virussen[2], 100, 100);
        addObject(virussen[3], 100, 100);
        addObject(virussen[4], 100, 100);
        addObject(virussen[5], 100, 100);
        addObject(virussen[6], 100, 100);
        addObject(virussen[7], 100, 100);
        addObject(norton, x, y);
    }
    
    public void act()
    {
        move();
        if (norton.touching())
        {
            removeObject(virussen[0]);
            
        }
    }
    
    public void move()
    {   
        if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("up"))
        {
             static_time = System.currentTimeMillis();
             norton.locationY -= 10;
        }
        if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("left"))
        {
             static_time = System.currentTimeMillis();
             norton.locationX -= 10;
        }
        if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("down"))
        {
             static_time = System.currentTimeMillis();
             norton.locationY += 10;
        }
        if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("right"))
        {
             static_time = System.currentTimeMillis();
             norton.locationX += 10;
        }
    }
    
    }



     
       
    
                                 
        
    
